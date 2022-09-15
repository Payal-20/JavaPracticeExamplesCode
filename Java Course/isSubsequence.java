public class isSubsequence {
    public static boolean isSub(String a,String b) {
        int m=a.length();
        int n=b.length();
        int i=0;
        int j=0;

        while(i<m && j<n){
            if(a.charAt(i)==b.charAt(j)){
                i++;
            }
            j++;
        }
        if(i==m){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String a="acb";
        String b="ahbmc";
        System.out.println(isSub(a, b));
    }
}
