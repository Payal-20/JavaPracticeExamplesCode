package arrays;

import java.util.Scanner;

public class size {
    public static void main(String args[]) {
        try (Scanner sc =new Scanner(System.in)){
            int arry=sc.nextInt();
            int number[]= new int[arry];
            //input
            for(int i=0;i<arry; i++){
                 number[i]=sc.nextInt();
            }
            //output
            for(int i=0; i<arry;i++){
                System.out.print(number[i]);
            }
        } 
    }
}
