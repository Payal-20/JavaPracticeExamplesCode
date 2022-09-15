public class buySellStock {
    public static int sellStock(int[] prices){
        int maxProfit=0;
        int minPrice=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            minPrice=Math.min(prices[i], minPrice);
            maxProfit=Math.max(maxProfit, prices[i]-minPrice);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println(sellStock(prices));
    }
}
/*
 * profit must be high
 * [7,1,5,3,6,4]
 * if(7-3)i.e loss i.e buy at 7 and sell at 3 ...loss of 4
 * profit(1-5)....4 cha pofit
 * sub must be high 
 * 2 pointers 
 * 1. at 7 and other at 1 .....check if any other element is greatr than 7 or not...
 * if grater sub 7 from that and stored sub .... and find max of it
 * TC=O(N^2) not optimised
 */

 /*
  * for more optimized solution 
  TC=O(N)
  Space=O(1)
  keep profit=0
  and min stock value is INT_MAX
  serach for min stock value
  and sub other from that and update profit to max value
  */