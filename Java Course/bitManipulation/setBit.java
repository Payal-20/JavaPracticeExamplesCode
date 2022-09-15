package bitManipulation;

public class setBit {
    public static void main(String args[]) {
        int n=5;//0101
        int posi=1;//0
        int bitMask=1<<posi;//0001= 0010

        int newNumber= bitMask | n;//0010 | 0101=0111
        System.out.println(newNumber);

    }
}//OR operation
