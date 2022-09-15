package recursionQue;

public class moveZeros {
    public static void moveZero(int nums[]){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[count++]=nums[i];
            }
        }
        while(count<nums.length){
            nums[count++]=0;
        }
    }
    public static void main(String[] args) {
        int nums[]={1,0,12,45,0,8,0};
        moveZero(nums);

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
