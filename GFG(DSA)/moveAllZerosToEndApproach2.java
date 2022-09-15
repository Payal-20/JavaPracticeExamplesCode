import java.util.ArrayList;
import java.util.Arrays;

public class moveAllZerosToEndApproach2 {
    public static void moveToRight(ArrayList<Integer> m){
        int count=0;
        for(int i=0;i<m.size();i++){
            if(m.get(i)==0){
                count++;
               
                m.remove(i);
                i--;
            }
        }
        for(int i=0;i<count;i++){
            m.add(0);
        }
        System.out.println("New array is: ");
        for(int i=0;i<m.size();i++){
            System.out.print(m.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> m= new ArrayList<>(Arrays.asList(5, 6, 0, 4, 6, 0, 9, 0, 8));
        moveToRight(m);
    }
}
//count number of zeros and add them 
//O(n)