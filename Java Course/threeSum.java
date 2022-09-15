import java.util.*;;
public class threeSum {
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
    
        Arrays.sort(nums);
        
        Set<List<Integer>> arr = new HashSet<>();//used hashSet because it not allows duplicate values
        
        if(nums.length < 3){
            return new ArrayList<>(arr);
        }
        
        int n = nums.length;
        for(int i = 0; i < n-2;i++)
        {    
            if(i != 0 && nums[i] == nums[i-1])
                continue;
            // so we dont have to do again for the same one i.e if i = -1 && i -1 is also  == -1;
            int j = i+1;
            int k = n - 1;
            while(j < k)
            {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0)
                {
                    arr.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    k--;
                    j++;
                    
                }
                else if(sum > 0)
                {
                    k--;
                }
                else
                {
                    j++;
                }
            }
        }
        return new ArrayList<>(arr);
    }
}
/* Logic
 * [-1,0,1,2,-1,-4]
 * sort=[-4,-1,-1,0,1,2]
 * i=-4
 * j=-1
 * k=2
 * if(i+j+k=0) return values and j++ and k--
 * if (i+j+k>=) i.e addition is positive hence reduce positive number i.e k--
 * and then j++
 * return new array list which is hashSet that means it will not take duplicate values
 * 
 * 
 * 
 * 
 */