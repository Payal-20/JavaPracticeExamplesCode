import java.util.Scanner;


public class voteeligibility {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            if(n>=18){
                System.out.println("you are eligible for voting");
            }
            else{
                System.out.println("you are not eligible for voting");
            }
        }
    }
}
