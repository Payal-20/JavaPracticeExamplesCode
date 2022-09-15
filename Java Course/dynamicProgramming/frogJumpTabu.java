import java.util.Arrays;

public class frogJumpTabu {
    public static void main(String[] args) {
        int height[]={30,10,60,10,60,50};
        int n=height.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        dp[0]=0;
        for(int idx=1;idx<n;idx++){
            int first=dp[idx-1]+Math.abs(height[idx]-height[idx-1]);
            int second = Integer.MAX_VALUE;
            if(idx>1){
                second=dp[idx-2]+Math.abs(height[idx]-height[idx-2]);
            }
            dp[idx]=Math.min(first, second);
        }
        System.out.println(dp[n-1]);
    }
}
