package list;

import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Thar");
        cars.add("swift");
        System.out.println(cars.getLast());
    }
}
