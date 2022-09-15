public class moveAllZerosToEnd {
    public static void swap(int arr[],int a, int b) {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {
        int arr[]={5, 6, 0, 4, 6, 0, 9, 0, 8};
        int n=arr.length;
        int j=0;

        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                swap(arr, j, i);
                j++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
//O(n)
//zero as pivot element and swap zero with non zero element