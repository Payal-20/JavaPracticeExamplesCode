public class inversionCount {
    public static int count(int arr[],int n){
        int invCount=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    invCount++;
                }
            }
        }
        return invCount;
    }
    public static void main(String[] args) {
        int arr[]={1, 20, 6, 4, 5};
        System.out.println(count(arr, arr.length));
        
    }
}
