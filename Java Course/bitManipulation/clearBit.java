package bitManipulation;

public class clearBit {
    public static void main(String args[]) {
        int n=5;//0101
        int posi=2;//1
        int bitMask= 1<<posi;//0001=0100
        int notBitmask=~(bitMask);//1011

        int newNumber= notBitmask & n;//0001
        System.out.println(newNumber);


    }
}//and with not
//not first and then and
