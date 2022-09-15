package abstrac;

interface animal{
    public void animalSound();
    public void sleep() ;
}
class Pig implements animal{
    public void animalSound() {
        System.out.println("weee weeee");
    }
    public void sleep() {
        System.out.println("zzzzz");
    }
}
public class interfaceAnimal {
    public static void main(String[] args) {
        Pig myPig= new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
    
}
