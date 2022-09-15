package bitManipulation;

import java.util.Scanner;

public class update {
    public static void main(String args[]) {
        try(Scanner sc=new Scanner(System.in)){
            int operation=sc.nextInt();
            //oper=1:set oper oper=0:clear operation
            int n=5;//0101
            int pos=1;//0

            if(operation==1){
                //set operation
                //i.e or operation
                int bitMask=1<<pos;
                int newNumber=bitMask | n;
                System.out.println(newNumber);
            }else{
                //clear operation i.e not with and
                int bitMask=1<<pos;
                int notBitmask=~(bitMask);
                int newNumber=notBitmask | n;
                System.out.println(newNumber);
            }
        }
    }
}
