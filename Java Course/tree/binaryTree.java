//for printing root 
//and preorder traverse=O(n)
//postorder=O(n)
//inorder=O(n)
//count of nodes=O(n)
//height of tree=O(n)
//diameter of a nodes=o(n^2)
//dim2=O(n)
//subtree of another tree
import java.util.*;
public class binaryTree {
    //must
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }//basic must for all trversal
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if   (nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }
    }
    public static void preorder(Node root) {
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right); 
    }
    public static void inorder(Node root) {
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right); 
    }
    public static void postorder(Node root) {
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void levelorder(Node root) {
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }
    public static int countNode(Node root) {
        if(root==null){
            return 0;
        }
        int leftNodes=countNode(root.left);
        int rightNodes=countNode(root.right);

        return leftNodes+rightNodes+1;
    }
    public static int sumOfNodes(Node root) {
        if(root==null){
            return 0;
        }
        int leftSum=sumOfNodes(root.left);
        int rightSum=sumOfNodes(root.right);

        return leftSum+rightSum+root.data;
    }
    public static int heightOfTree(Node root) {
        if(root==null){
            return 0;
        }
        int leftHeight= heightOfTree(root.left);
        int rightHeiht=heightOfTree(root.right);
        int myHeight=Math.max(leftHeight, rightHeiht)+1;

        return myHeight;
    }
    public static int diameter(Node root) {
        if(root==null){
            return 0;
        }
        int dim1= diameter(root.left);
        int dim2=diameter(root.right);
        int diam3=heightOfTree(root.left)+heightOfTree(root.right)+1;
        return Math.max(Math.max(dim1, dim2),diam3);
    }
    static class treeInfo{
        int ht;
        int dimtr;

        treeInfo(int ht, int dimtr){
            this.ht=ht;
            this.dimtr=dimtr;
        }
        public static treeInfo diameter2(Node root) {
            if(root==null){
                return new treeInfo(0, 0);
            }
            treeInfo left=diameter2(root.left);
            treeInfo right=diameter2(root.right);

            int myHeight=Math.max(left.ht, right.ht)+1;

            int dim1=left.dimtr;
            int dim2=right.dimtr;
            int diam3=left.ht+right.ht+1;

            int mydiameter=Math.max(Math.max(dim1, dim2), diam3);
            treeInfo myInfo=new treeInfo(myHeight, mydiameter);
            return myInfo;
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        levelorder(root);
        System.out.println("number of nodes are :"+countNode(root));
        System.out.println("sum of nodes: "+sumOfNodes(root));
        System.out.println("height of tree is: "+ heightOfTree(root));
        System.out.println("diameter of tree is: "+diameter(root));
        //System.out.println("diameter by approach2 is: "+diameter2(root).dimtr);
    }
}
 