package recursionQue;

public class reverse {
    public static void prtRev(String str, int idx) {
        if(idx==0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        prtRev(str, idx-1);
    }
    public static void main(String[] args) {
        String str="payal";
        prtRev(str, str.length()-1);
    }
}//time complexity=length of string=O(n)
