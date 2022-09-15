import java.util.Scanner;

public class calculator {
    public static int cal(int a, int b) {
        int opreation=1;
        switch(opreation){
            case 1:
            int addition=a+b;
            System.out.println(addition);
            break;
            case 2:
            int multiplication=a*b;
            System.out.println(multiplication);
            break;
            case 3:
            int substraction=a-b;
            System.out.println(substraction);
            break;
            case 4:
            int division=a/b;
            System.out.println(division);
            break;
            case 5:

        }
        return opreation;
    }public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            cal(a, b);
        }
    }
}
