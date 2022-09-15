package inheritance;

public class example {
    protected String brand="Ford";//example attribute
    public void honk() {//example method
        System.out.println("tuut, tuut!!");
    }
}
class Car extends example{
    private String modelName="Muatang";//car attribute
    public static void main(String[] args) {
        //object creation
        Car myObj= new Car();
        myObj.honk();//method call
        System.out.println(myObj.brand+" "+myObj.modelName);
    }
}