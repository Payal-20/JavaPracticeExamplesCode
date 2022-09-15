package loop;

import java.util.Scanner;

public class sumofnaturalno {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int sum =0;
            int i=0;
            while(i<=n){
                sum=sum+i;
                i++;
            }
            System.out.println(sum);
        }
    }
    
}
