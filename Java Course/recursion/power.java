public class power {
    public static int powerOf(int a, int b){
        if(b==0){
            return 1;
        }
        if(b==1)
            return a;
        int ans=powerOf(a, b/2);
        if(b%2==0)
            return ans*ans;
        else
            return a*ans*ans;

    }
    public static void main(String[] args) {
        int a=2;
        int b=3;
        System.out.println(powerOf(a,b));
    }
}
