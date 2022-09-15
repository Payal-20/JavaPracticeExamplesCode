package pattern;

import java.util.Scanner;

public class pyramid {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        //rows
        for(int i=n;i>=1;i--){
            //cloumns
            for(int j=1;j<=i-2;j++){
                    System.out.print(j);
            }
            System.out.println();
        }
    }
}
