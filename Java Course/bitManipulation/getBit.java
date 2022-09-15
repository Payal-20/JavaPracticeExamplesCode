package bitManipulation;

public class getBit {
    public static void main(String args[]) {
        int n=5;//0101
        int posi=3;//0
        int bitMask=1<<posi;//0001<<3=1000

        if((bitMask & n)==0){//1000 & 0101=0000
            System.out.println("bit was zero");//correct
        }else{
            System.out.println("bit was one");
        }
    }
}//and operation
//get whether bit is 0 or 1
