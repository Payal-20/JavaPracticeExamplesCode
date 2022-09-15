package string;

import java.util.Scanner;

public class compare {
    public static void main(String args[]) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("enter two strings:");
            String name1= sc.nextLine();
            String name2=sc.nextLine();
            //cmpareTo
            //1 s1>s2 :+ve value
            //2 s1==s2 :0
            //1 s1<s2 :-ve value
            //according to albphbatical order a<b
            if(name1.compareTo(name2)==0){
                System.out.println("strings are equal");
            }else{
                System.out.println("strings are not equal");
            }



        }
    }
}
