public class sortedArrayOrNot {
    public static boolean isSorted(int arr[],int size){
        if(size==0 || size==1){
            return true;
        }
        if(arr[0]>arr[1]){
            return false;
        }
        else{
            boolean remainingPart=isSorted(arr+1, size-1);
            return remainingPart;
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,5,6,9};
        int size=5;
        boolean ans=isSorted(arr,size);
        if(ans){
            System.out.println("sorted");
        }else{
            System.out.println("not sorted");
        }
    }
}
