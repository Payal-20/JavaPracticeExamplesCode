public class tabilation {
    // public static int fibonacci(int[] dp,int n){
    //     if(n<=1){
    //         return n;
    //     }
    //     if(dp[n]!=-1){
    //         return dp[n];
    //     }
    //     return dp[n]=fibonacci(dp, n-1)+fibonacci(dp, n-2);
    // }
    public static void main(String[] args) {
        int n=5;
        int pre2=0;
        int pre=1;
        for(int i=2;i<=n;i++){
            int curr=pre+pre2;
            pre2=pre;
            pre=curr;
        }
        System.out.println(pre);
    }
}
