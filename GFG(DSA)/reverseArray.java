public class reverseArray {
    static void reverseArray(int arr[],int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    static void printArray(int arr[],int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        printArray(arr, 5);
        reverseArray(arr, 0, 4);
        System.out.print("reversed array: \n");
        printArray(arr, 5);
    }
}
