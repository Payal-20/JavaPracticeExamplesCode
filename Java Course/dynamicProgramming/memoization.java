import java.util.Arrays;

public class memoization {
    public static int fibonacci(int[] dp,int n){
        if(n<=1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n]=fibonacci(dp, n-1)+fibonacci(dp, n-2);
    }
    public static void main(String[] args) {
    int n=5;
    int dp[]=new int[n+1];
    Arrays.fill(dp,-1);
    System.out.println(fibonacci(dp,n));
    }
}
