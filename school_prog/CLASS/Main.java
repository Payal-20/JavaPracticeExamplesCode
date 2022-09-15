package CLASS;

abstract class Main {//abstract class
    public String fname="payal";
    public int age=21;
    public abstract void study(); //abstract method
}
//sub class(inherit from main)
class Student extends Main{
    public int gradutatioYear=2023;
    public void study(){//body of abstract method
        System.out.println("studying all day long");
    }
}
