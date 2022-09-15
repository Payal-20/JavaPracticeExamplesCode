package linkedlist;

public class basic {
    Node head;
    private int size;

    basic(){
        this.size=0;

    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    //add
    //first
    public void addFirst(String data){
        Node newNode =new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //add-last
    public void addLast(String data) {
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
    }
    //print
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
    //delete first
    public void deleteFirst() {
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head=head.next;
    }
    //delete last
    public void deleteLast() {
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;//head.next==null-->lastnode=null
        while (lastNode.next!=null) {//error
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    public int getSize(){
        return size;
    }


    public static void main(String[] args) {
        basic list=new basic();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("List");
        list.printList();

        list.addFirst("this");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize()); 

    }
    
}
//for Array List
//for element in between we will copy elemeent and place in new arry with 1 space between
//insert timecomp=O(n)
//search timcopm=O(1)
//for LinledList
//insertion add 1 and point to nest node....O(n) use for insertion as time complexity is less as compare to array list
//search timecomp=O(n)>Array list so use Array list for searching operation
//node{data,next}
//head=1st node || tail=last node