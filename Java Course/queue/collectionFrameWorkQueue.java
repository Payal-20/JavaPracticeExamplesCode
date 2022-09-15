package queue;
import java.util.*;
public class collectionFrameWorkQueue {
    public static void main(String[] args) {
        //Queue<Integer> q=new LinkedList<>();
        Queue<Integer> q=new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
         
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }


    }
}
//quque is interface ,object is only for classes not for interfaces 
//queue is interface ...linkedList is object//arrayDeque is resizable array implementation of deque interface
//linkedList class is the list implementation