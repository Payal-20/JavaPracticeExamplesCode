package loop;

import java.util.Scanner;

public class marks {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 1 or 0:");
            int n=sc.nextInt();
            while(n==1){
                System.out.println("Enter marks:");
                int marks=sc.nextInt();
                if(marks>=90){
                    System.out.println("this is good");
                }
                if (marks>=60) {
                    System.out.println("this is also good");
                } else {
                    System.out.println("this is good as well");
                    
                }
                System.out.println("Press 1 to continue & 0 to stop");
                n = sc.nextInt();
            }
        }
    }
}
