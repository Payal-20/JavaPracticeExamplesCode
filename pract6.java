class MultiThread extends Thread{
    public void run(){
        System.out.println("Running Thread Name: "+ this.currentThread().getName());
        System.out.println("Running Thread Priority: "+ this.currentThread().getPriority());
    }
}
class MultiThrd {
    public static void main(String[] args) {
        MultiThread multiThread1 = new MultiThread();        
         multiThread1.setName("First Thread");         
         multiThread1.setPriority(Thread.MIN_PRIORITY);
        MultiThread multiThread2 = new MultiThread();        
         multiThread2.setName("Second Thread");         
         multiThread2.setPriority(Thread.MAX_PRIORITY);
        MultiThread multiThread3 = new MultiThread();        
         multiThread3.setName("Third Thread");
        multiThread1.start();         
        multiThread2.start();         
        multiThread3.start();
    }
}
 class Main extends Thread {   
     public static void main(String[] args) {     
         Main thread = new Main();     
         thread.start();
    System.out.println("This code is outside of the thread");
}  
   public void run() {    
       System.out.println("This code is running in a thread");
    }
}

