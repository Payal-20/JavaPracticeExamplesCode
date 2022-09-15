package string;

import java.util.Scanner;

public class reverse {
    public static void main(String args[]) {
        System.out.println("Enter string: ");
        Scanner sc= new Scanner(System.in);
        String name =sc.nextLine();
        StringBuilder sb= new StringBuilder(name);
        for(int i=0; i<sb.length()/2;i++){
            int front= i;
            int back= sb.length()-1-i;//5-1-0==4

            char frontChar=sb.charAt(front);
            char backChar =sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);

        }
        System.out.println("reverse string is: "+ sb);
    }
}
