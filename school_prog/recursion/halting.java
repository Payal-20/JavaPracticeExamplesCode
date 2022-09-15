package recursion;
import java.util.Scanner;
//addition of two numbers
public class halting {
    public static int halting(int start,int end) {
        if(end>start){
            return end + halting(start,end-1);
        }else{
            return end;
        }
    }
    public static void main(String args[]) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("enter starting and ending number:");
            int start=sc.nextInt();
            int end=sc.nextInt();
            int result=halting(start,end);
            System.out.println("sum is:"+ result);
        }
    }
}
