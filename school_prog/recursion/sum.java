package recursion;

public class sum {
    public static int numSum(int num) {
        if(num>0){
            return num+numSum(num-1);
        }else{
            return 0;
        }
    }
    public static void main(String args[]) {
        int sum=numSum(10);
        System.out.println("sum of numbers is:"+ sum);
    }
}
