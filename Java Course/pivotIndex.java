public class pivotIndex {
 
    public static void main(String[] args) {        
        pivotIndex main = new pivotIndex();
        int result = main.pivotIndex(new int[] {4, 7, 3, 6, 8, 6});
        System.out.print(result);       
    }
     
    /* Solution */   
    public int pivotIndex(int[] nums) {
         
        int sum = 0;
        for(int value : nums){
            sum = sum + value;
        }
         
        int start = 0, index = 0;
        for(index=0; index<nums.length; index++){
             
            sum = sum - nums[index];
            if(start == sum){
                return index;
            }
            start = start + nums[index];
        }
        return -1;
    }
}//LeftSum is equal to Sum – LeftSum – Nums[i]
//This problem can be solved in following steps :-

//Traverse the given input array Nums to calculate the sum of all its elements, let’s say Sum.
//Again traverse the input array from start (index 0) to end (n-1, where n is the length of an array) 
//and calculate the sum of its traversed elements, let’s say LeftSum. 
//If at any index LeftSum is equal to Sum – LeftSum – Nums[i], then i is a pivot index.