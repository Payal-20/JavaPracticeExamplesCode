public class jumpGame {
    public int jump(int[] nums) {
        int farthest=0;
        int current=0;        
        int jump=0;  
            
        if(nums.length==1)return 0;        
        for( int i=0;i<nums.length-1;i++){            
            farthest=Math.max(farthest,nums[i]+i);
            if(i==current){
                current=farthest;
                jump++;
            }
        }        
        return jump;
    }
}
//no.of jump to reach lst 
//arry nu=nu.of jump we can take 