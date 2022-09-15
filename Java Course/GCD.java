import java.util.*;
public class GCD {
    public static void commonDiviser(int n1, int n2) {
        while(n1 != n2) {
            if(n1>n2) {
            n1 = n1 - n2;
        } else {
            n2 = n2 - n1;
            }
        }
        System.out.println("GCD is : "+ n2);
        return;
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            commonDiviser(n1, n2);
        }
        
    }
}