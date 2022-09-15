public class constructure {//constructure class
    int x;//class attribute
    public  constructure() {//class constructor
        x=5;
    }
    public static void main(String[] args) {
        constructure myObj=new constructure();//object to call constructor
        System.out.println(myObj.x);
    }
}
