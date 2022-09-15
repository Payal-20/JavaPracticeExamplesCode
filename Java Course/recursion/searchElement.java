public class searchElement {
    public static boolean search(int arr[],int size,int k){
        if(size==0){
            return false;
        }
        if(arr[0]==k){
            return true;
        }
        else{
            boolean remainingPart=search(arr+1, size-1, k);
            return remainingPart;
        }
    }

    public static void main(String[] args) {
       int arr[]={3,5,1,2,6};
       int size=5;
       int key=2;
       boolean ans=search(arr,size,key); 
       if(ans){
        System.out.println("found");
       }else{
        System.out.println("not found");
       }
    }
}
