package function;

import java.util.Scanner;

public class factorial {
    public static void factorialTwo(int n) {
        if(n<0){
            System.out.println("invalid");
            return;
        }
        int fact=1;
        for(int i=n; i>=1; i--){
            fact= fact*i;
        }
        System.out.println(fact);
        return;
    }
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n= sc.nextInt();
      factorialTwo(n);
        }
    }
}
