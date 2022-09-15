package sorting;

import arrays.string;

public class bubbleS {
    public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"");
        }
    }
    public static void main(string args[]) {
        //bubble sort
        int arr[]={4,9,5,8};
        //time complexity=O(n^2)
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
        printArr(arr);
    }
}
