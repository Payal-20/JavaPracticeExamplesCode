
public class pen {
    String color;
    
    public void printColor() {
        System.out.println("The color of the pen is:"+ this.color);
    }
    public static void main(String args[]) {
        pen p1=new pen();
        p1.color="blue";
        
        pen p2= new pen();
        p2.color="red";

        p1.printColor();
        p2.printColor();


        
    }
}
