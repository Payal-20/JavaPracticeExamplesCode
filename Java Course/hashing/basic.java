import java.util.HashSet;
import java.util.Iterator;
public class basic {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        //insert
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);
        System.out.println("size of set is: "+set.size());
        System.out.println(set);

        //search
        if(set.contains(1)){
            System.out.println("set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("set not contains 6");
        }
        //delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("does not contain 1");
        }
        //iterater:it is a symbol e.g i in for loop is iterator
        Iterator it=set.iterator();
        //hashNext(true or false),Next(next value) functions
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }//order is not considerd in hash set
}
