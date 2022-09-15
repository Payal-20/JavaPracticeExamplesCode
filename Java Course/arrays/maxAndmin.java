package arrays;

import java.util.Scanner;


public class maxAndmin {
    public static void main(String args[]) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println(("enter the size of the array:"));
            int size=sc.nextInt();
            int number[]=new int[size];

            for(int i=0;i<size;i++){
                number[i]=sc.nextInt();
            }
            int max=Integer.MAX_VALUE;
            int min=Integer.MIN_VALUE;

            for(int i=0;i<number.length;i++){
                if(number[i]<min){
                    min=number[i];
                }
                if(number[i]>max){
                    max=number[i];
                }
            }
            System.out.println("largest number is: "+max);
            System.out.println("smallest number is: "+ min);
        }
    }
}
