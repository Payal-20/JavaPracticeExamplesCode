package recursionQue;

import java.util.ArrayList;
import java.util.List;

public class permutation {
    public static void main(String[] args) {
        int nums[]={1,2,3};
        System.out.println(permute(nums));
    }
    public static void permutations_optimised(int index, int[] nums, List<List<Integer>> ans){
        // Base case
        if(index == nums.length){
            // creating new ArrayList for storing the manipulated(changed while recursion call) nums array
            ArrayList<Integer> ds = new ArrayList<>();
            // adding elements of the nums array
            for(int i=0 ; i<nums.length ; i++){
                ds.add(nums[i]);
            }
            // after that simple adding whole list into our final ans list
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        
        // Recursive call
        for(int i=index ; i<nums.length ; i++){
            swap(nums, index, i);
            permutations_optimised(index+1, nums, ans);
            swap(nums, index, i);
        }
    }
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        
        // un-comment these 2 lines for brute force solution
        // boolean[] freq = new boolean[nums.length];
        // permutations_bruteForce(nums, nums.length, freq, ans, new ArrayList<Integer>());
        
        permutations_optimised(0, nums, ans);
        return ans;
    }
}
