package loop;

import java.util.Scanner;

public class tableofanumber {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            for(int i=1; i<=10; i++){
                System.out.println(n*i);
            }
        }
    }
    
}
