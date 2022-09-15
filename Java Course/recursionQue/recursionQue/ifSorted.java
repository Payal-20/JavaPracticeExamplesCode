package recursionQue;

public class ifSorted {
    public static boolean isSorted(int arr[], int idx) {
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            //array is sorted
            return isSorted(arr, idx+1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,5,3,7};
        System.out.println(isSorted(arr, 0));
    }
}
