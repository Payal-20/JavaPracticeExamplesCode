import java.util.Scanner;

public class leapyear {

    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int year=sc.nextInt();
            boolean leap = false;
            if((year%100!=0 && year%4==0) || (year%400==0)){
                leap=true;
            }
            else{
                leap=false;
            }
            if (leap)
            System.out.println(year + " is a leap year.");
            else
            System.out.println(year + " is not a leap year.");
    }
  }
}

