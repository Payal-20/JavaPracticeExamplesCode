package linkedlist;

public class reverseIterative {
    Node head;
    private int size;

    reverseIterative(){
        this.size=0;

    }
    class Node{
        int data;
        Node next;

        Node(int data2){
            this.data=data2;
            this.next=null;
            size++;
        }
    }//add first
    public void addFirst(int data){
        Node newNode =new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //add-last
    public void addLast(int data) {
        Node newNode =new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        //triverse
        Node curNode= head;
        while(curNode.next!= null){
            curNode=curNode.next;
        }
        curNode.next=newNode;
    }//print
    public void printList() {
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node curNode= head;
        while(curNode!= null){
            System.out.print(curNode.data+ "-->");
            curNode=curNode.next;
        }
        System.out.println("NULL");
    }
    public int getSize(){
        return size;
    }
    public void reverseIterate() {
        if(head==null || head.next==null){
            System.out.println("string is empty");
            return;
        }
        Node preNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode= currNode.next;
            currNode.next=preNode;

            //update
            preNode=currNode;
            currNode=nextNode;

        }
        head.next=null;
        head=preNode;
    }
public static void main(String[] args) {
    reverseIterative list=new reverseIterative();
    list.addLast(1);
    list.addLast(2);
    list.addLast(3);
    list.addLast(4);
    list.printList();

    list.reverseIterate();
    list.printList();
    
}
}//by iterative way