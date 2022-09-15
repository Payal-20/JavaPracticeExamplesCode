public class quickSort {
    public static int partition(int arr[],int s, int e) {
        int pivot=arr[s];
        int count=0;
        for(int i=s+1;i<=e;i++){
            if(pivot>=arr[i]){
                count++;
            }
        }
        int pivotIndex=s+count;
        swap(pivotIndex, s, arr);

        int i=s;
        int j=e;
        while (i<pivotIndex && j>pivotIndex) {
            while(arr[i]<=pivotIndex){
                i++;
            }
            while(arr[j]>=pivotIndex){
                j--;
            }  
            while(i<pivotIndex && j>pivotIndex){
                swap(i, j, arr);
                i++;
                j--;
            }
        }
        return pivotIndex;
    }
    public static void swap(int i,int j,int arr[]) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    public static void quickS(int arr[],int s, int e) {
        if(s>=e){
            return;
        }
        //partion
        int p=partition(arr, s, e);
        //left shift
        quickS(arr, s,p-1);
        //right shift
        quickS(arr, p+1,e);
    }
    public static void main(String[] args) {
        int arr[]={1,8,5,4,9};
        quickS(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
