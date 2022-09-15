public class teoSum {
    public static int[] twoSum(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==target-arr[i]){
                    return new int[]{i,j};
                }
            }
        }return null;
    }
    public static void main(String[] args) {
        int arr[]={2,7,12,14};
        int target=9;
        System.out.println(twoSum(arr,target));
    }
}
