package bitManipulation;

public class update1 {
    public static void main(String args[]) {
        int n=5;//0101
        int pos=2;//1=0
        int bitMask=1<<pos;//0001=0100
        int notBitmask=~(bitMask);//1011

        int newNumber= notBitmask & n;//1011 & 0101 = 0001
        System.out.println(newNumber);

    }
}
//perform clear operation (i.e not with and) for conversion of 1 into 0