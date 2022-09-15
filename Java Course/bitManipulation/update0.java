package bitManipulation;

public class update0 {
    public static void main(String args[]) {
        int n=5;//0101
        int pos=1;//0=1
        int bitMask=1<<pos;//0001=0010

        int newNumber= bitMask | n;//0010 | 0101=0111
        System.out.println(newNumber);

    }
}
//perform set operation for conversion of 0 int 1