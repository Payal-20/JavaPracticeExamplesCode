public class reverseString {
    public static void swap(int start,int end){
        int temp=start;
        start=end;
        end=start;
    }
    public static void reverse(String str,int start, int end){
        if(start>end){
            return;
        }
        else{
            swap(start,end);
            start++;
            end--;
        }
        reverse(str, start, end);
    }
    public static void main(String[] args) {
        String str="Payal";
        System.out.println();
        reverse(str, 0, str.length()-1);
    }
}
