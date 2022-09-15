import java.util.Scanner;

public class oddnosum {
    public static void oddNoSum(int n) {
        int sum=0;
        for(int i=1; i<=n;){
            sum= sum*2+i;
            System.out.println(sum);
            return;
        }
    }
    public static void name() {
        try (Scanner sc = new Scanner(System.in)) {
            int n =sc.nextInt();
            oddNoSum(n);
        }
    }
}
