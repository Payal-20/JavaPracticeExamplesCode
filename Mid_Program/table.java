
import java.util.Scanner;

public class table {
    public static void main(String args[]) {
        System.out.println("Enter the number:");
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();

            System.out.println("Table for the given number is:");
            for(int i=1; i<=10; i++){
                System.out.println(n*i);
            }
        }
    }
}
