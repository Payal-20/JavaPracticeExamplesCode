public class binarySearch {
    static void print(int arr[],int s, int e){
        for(int i=s;i<=e;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int binarySrch(int arr[], int s, int e, int k){
        print(arr,s,e);
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(arr[mid]==k){
            return arr[mid];
        }
        if(arr[mid]<k){
            return binarySrch(arr, mid+1, e, k) ;
        }else{
            return binarySrch(arr, s,mid-1, k);
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,10,14,16};
        int k=16;
        System.out.println(binarySrch(arr, 0,5 , k)); 
    }
}
