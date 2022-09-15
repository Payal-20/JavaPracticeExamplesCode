//linear search
package arrays;

import java.util.Scanner;

public class search {
    public static void main(String args[]) {
        try(Scanner sc= new Scanner(System.in)){
            System.out.println("enter array size:");
            int size= sc.nextInt();
            System.out.println("enter array numbers:");
            int number[]=new int[size];
            for(int i=0;i<size;i++){
                number[i]=sc.nextInt();
            }
            System.out.println("enter element to search:");
            int x=sc.nextInt();
            for(int i=0;i<number.length;i++){
                if(number[i]==x){
                    System.out.println("x found at index i:"+ i);
                }
            }
        }
    }
}
