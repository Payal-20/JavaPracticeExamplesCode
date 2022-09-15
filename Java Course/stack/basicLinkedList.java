package stack;
//using linkedList
public class basicLinkedList {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }
    static class Stack{
        public static Node head;
        public static boolean isEmpty() {
            return head==null;
        }//push
        public static void push(int data) {
            Node newNode=new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                return 0;
            }
            int top=head.data;
            return top;

        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}
//push..O(1)=end of the stack=add
//pop..O(1)//remove
//peek..O(1)//value
//last in firstout
//implimentation==1.array-fixed size==not used
//2.ArrayList=variable size
//3.LinkedList=variable size