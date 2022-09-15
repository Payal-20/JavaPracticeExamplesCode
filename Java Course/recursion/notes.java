

public class notes {
    //recuurssion is same as loop/iteration
    /*uses:
     * zomato
     * a function that calls itself
     * function calls itself till the basecase occures
     * stack
     * if no base condition then stack overflow will happen//error
     */
    public static void printNum(int n) {
        if(n==0)//base case
        return;
        System.out.println(n);//print
        printNum(n-1);//recurssion
    }
    public static void main(String[] args) {
        int n=5;
        printNum(n);
    }
}
