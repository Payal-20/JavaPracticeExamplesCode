import java.util.HashSet;

public class setHash {
    public static void main(String[] args) {
        HashSet<Integer> bdayDates= new HashSet<Integer>();
        bdayDates.add(20);
        bdayDates.add(26);
        bdayDates.add(15);
        for(int i=1;i<=15;i++){
            if(bdayDates.contains(i)){
                System.out.println(i+" is present in the list");
            }else{
                System.out.println(i+" is not present in the list");
            }
        }
    }
}
