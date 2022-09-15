

public class stackHeight {
    public static int calPower(int x, int n) {
        if(x==0){//base case 1
            return 0;
        }
        if(n==0){//base case 2
            return 1;
        }
        int xPowernm1 = calPower(x, n-1);//what we want:kaam
        int xPown=x* xPowernm1;
        return xPown;
        
    }
    public static void main(String[] args) {
        int x=3, n=5;
        int ans= calPower(x, n);
        System.out.println(ans);
    }
}
