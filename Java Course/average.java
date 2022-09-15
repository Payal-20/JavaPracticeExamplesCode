import java.util.Scanner;

public class average {
    public static int average(int a, int b) {
        int avg = (a+b)/2;
        System.out.println(avg);
        return avg;
    }
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            average(a, b);
        }
    }
}
