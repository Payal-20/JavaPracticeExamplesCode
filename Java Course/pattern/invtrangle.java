package pattern;

import java.util.Scanner;


public class invtrangle {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            for(int i=n; i>=1; i--){
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        
    }
}
