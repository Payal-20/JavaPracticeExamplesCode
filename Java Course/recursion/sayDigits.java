public class sayDigits {
    public static void sayDigit(int n,String arr[]){
        if(n==0){
            return;
        }
        int digit=n%10;
        n=n/10;
        sayDigit(n, arr);
        System.out.println(arr[digit]+" ");
    }
    public static void main(String[] args) {
        String arr[]={"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
        int n=234;
        sayDigit(n,arr);
    }
}
