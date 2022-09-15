package operators;

import java.util.Scanner;

public class increment {
    public static void main(String args[]) {
        try(Scanner sc= new Scanner(System.in)){
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            //num2=num1++; first use then increment
            num2=++num1;//first increment then use
            System.out.println(num1);
            System.out.println(num2);
        }
    }
}
