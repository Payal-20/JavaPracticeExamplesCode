package abstrac;

abstract class animal {
    //method...no body
    public abstract void animalSound();
    //regular method
    public void sleep() {
        System.out.println("Zzzz");
    }
}
//subclass
class Pig extends animal{
    public void animalSound() {
        //body of animalSound()
        System.out.println("the pig says: weee weeee");
    }
}
class main{
    public static void main(String[] args) {
        Pig myPig = new Pig();//PIG OBJECT
        myPig.animalSound();
        myPig.sleep();
    }
}