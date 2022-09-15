package function;

import java.util.*;

public class twono {
    public static float twoNumber(int a, int b ) {
        int mul=a*b;
        return mul;
    }
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int a= sc.nextInt();
            int b= sc.nextInt();
            float mul = twoNumber(a, b);
            System.out.println("multiplication of two numbers is:"+mul);
        }
    }
}
