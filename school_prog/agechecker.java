import java.util.Scanner;

public class agechecker {
    public static void agecheck(int age) {
        if(age<21){
            System.out.println(" you are mature");
        }else{
            System.out.println(" you are not mature");
        }
    }
    public static void main(String args[]) {
        try (Scanner sc=new Scanner(System.in)){
            System.out.println("Enter name: ");
            String name=sc.nextLine();
            System.out.println("enter age: ");
            int age= sc.nextInt();
            System.out.print(name);
            agecheck(age);
        }
    }
}