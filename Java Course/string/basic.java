package string;

import java.util.Scanner;

public class basic {
    public static void main(String args[]) {
        // String name="payal";
        // String sentence="sunny is cute";
        try(Scanner sc= new Scanner(System.in)){
            String name= sc.nextLine();
            System.out.println("your name is: "+name);
        }
    }
}
