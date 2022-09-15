package recursionQue;

public class towerOfHanoi {
    public static void hanoi(int n,String src, String helper, String dest) {
        if(n==1){
            System.out.println("transfer disk "+ n+" from "+ src + " to "+ dest);
            return;
        }
        hanoi(n-1, src, dest, helper);
        System.out.println("transfer disk "+ n +" from "+ src +" to "+ dest);
        hanoi(n-1, helper, src, dest);
        //System.out.println("transfer disk"+n+"from"+helper+"to"+src);
    }
    public static void main(String[] args) {
        int n=3;
        hanoi(n, "S", "H", "D");
    }
}
//1. move n-1 desk from source to helper
//2.move desk 1 from source to destination
//use source as helper to move n-1 from helper to destination
//COMPLEXITY=O(2^N-1)==O(2^N)