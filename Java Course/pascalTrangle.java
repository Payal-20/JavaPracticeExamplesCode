import java.lang.reflect.Array;
import java.util.*;
public class pascalTrangle {
    public static List<List<Integer>> pasTng(int n){
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        ArrayList<Integer> row, prev=null;
        for(int i=0;i<n;++i){
            row=new ArrayList<Integer>();
            for(int j=0;j<=j;++j){
                if(j==1 || j==i){
                    row.add(1);
                }else{
                    row.add(prev.get(j-1)+prev.get(j));
                }
            }
            prev=row;
            ans.add(row);
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=0;
        System.out.println(pasTng(n));

    }
}
