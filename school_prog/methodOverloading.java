public class methodOverloading {
    public static int firstMethod(int x,int y) {
        return x+y;
    }
    public static double secondMethod(double x, double y) {
        return x+y;
    }
    public static void main(String args[]) {
        int num1=firstMethod(2,9);
        double num2= secondMethod(8.5, 4.9);
        System.out.println(num1);
        System.out.println(num2);
    }
}
