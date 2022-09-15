package inheritance;

class polymorphisam {
    public void firstPoly() {
        System.out.println("polymorphisam for animal sounds");
    }
}
class animal extends polymorphisam{
    public void firstPoly() {
        System.out.println(" animals makes sound");
    }
}
class dog extends animal{
    public void firstPoly() {
        System.out.println("dog says: bow bow");
    }
}
class main{
    public static void main(String[] args) {
        polymorphisam poly=new polymorphisam();
        polymorphisam animals= new animal();
        polymorphisam myDog=new dog();

        poly.firstPoly();
        animals.firstPoly();
        myDog.firstPoly();
    }
}//diffrent classes same method