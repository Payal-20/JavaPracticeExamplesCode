public class stairs {
    public static int countDistinctWayToClimbStairs(int nStairs){
        if(nStairs==0){
            return 1;
        }
        if(nStairs<0){
            return 0;
        }
        int ans=countDistinctWayToClimbStairs(nStairs-1)+countDistinctWayToClimbStairs(nStairs-2);
        return ans;
    }
    public static void main(String[] args) {
        int stairs=12;
        System.out.println(countDistinctWayToClimbStairs(stairs));
    }
}
