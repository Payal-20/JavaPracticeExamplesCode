public class returnval {
    public static int myReturnType(int num1,int num2) {
        return num1* num2;
    }
    public static void main(String args[]) {
        int nmul=myReturnType(2, 5);
        System.out.println(nmul);
    }
}
