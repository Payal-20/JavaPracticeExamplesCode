import java.util.ArrayList;
import java.util.Iterator;

public class NextHash {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        numbers.add(20);
        numbers.add(26);
        numbers.add(14);
        numbers.add(1);
        numbers.add(15);
        Iterator<Integer> it= numbers.iterator();
        while(it.hasNext()){
            Integer i=it.next();
            if(i<10){
                it.remove();
            }
        }
        System.out.println(numbers);
    }
}
