package linkedlist;

public class reverseRecurssion {
    Node head;
    private int size;

    reverseRecurssion(){
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
    public Node reverseRecursive(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newHead= reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;

        return newHead;
    }
    public static void main(String[] args) {
        reverseRecurssion list=new reverseRecurssion();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.printList(); 

        list.head=list.reverseRecursive(list.head);
        list.printList();
    }
}
