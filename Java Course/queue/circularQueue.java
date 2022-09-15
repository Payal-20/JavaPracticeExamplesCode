package queue;

public class circularQueue {
    static class Queue{
        static int arr[];
        static int size;
        static int rear=-1;
        static int front=-1;

        Queue(int n){
            arr=new int[n];
            this.size=n;
        }
        public static boolean isEmpty() {
            return rear==-1 && front==-1;
        }
        public static boolean isFull() {
            return (rear+1)%size==front;
        }
        //enqueue
        public static void add(int data) {
            if(isFull()){
                System.out.println("full queue");
                return;
            }
            //first element add
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        //dequeue-O(1)
        public static int remove() {
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int result=arr[front];
            //single element condition
            if(rear==front){
                rear=front=-1;
            }else{
                front=(front+1)%size;
            }
            return result;
        }
        //peek
        public static int peek() {
            if(isEmpty()){
                System.out.println("empty Queue");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue Q=new Queue(5);
        Q.add(1);
        Q.add(2);
        Q.add(3);
        Q.add(4);
        Q.add(5);

        System.out.println(Q.remove());
        Q.add(6);
        System.out.println(Q.remove());
        Q.add(7);

        while (!Q.isEmpty()) {
            System.out.println(Q.peek());
            Q.remove();
        }


    }
}
//circular is pushing front and back instead of values
