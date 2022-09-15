public class countNo {
    public static void count(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        count(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        count(n); 
    }
}
