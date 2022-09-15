package function;
import java.util.*;

public class hello {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String args[]) {
       try (Scanner sc = new Scanner(System.in)) {
        String name = sc.next();
           printMyName(name); //call finction
    }
    }
}
