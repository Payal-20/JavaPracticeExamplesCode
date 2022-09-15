import java.util.Scanner;

public class curcomference {
    public static double circleCurcum(double radius) {
        double curcom= 2* 3.14 * radius;
        System.out.println(curcom);
        return curcom;
    }
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int radius=sc.nextInt();
            circleCurcum(radius);
        }
    }
}
