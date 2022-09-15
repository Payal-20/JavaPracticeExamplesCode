import java.util.Arrays;

public class frogJumpMeo {
    public static int jump(int idx,int[] height,int[] dp){
        if(idx==0){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int left=jump(idx-1, height,dp)+Math.abs(height[idx]-height[idx-1]);
        int right=Integer.MAX_VALUE;
        if(idx>1){
            right=jump(idx-2, height, dp)+Math.abs(height[idx]-height[idx-2]);
        }
        return dp[idx]=Math.min(left,right);

    }
    public static void main(String[] args) {
        int height[]={30,10,60,10,60,50};
        int n=height.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        System.out.println(jump(n-1,height,dp));
    }
}
