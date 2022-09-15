public class staticPublic {
    //static method
    static void myStaticMethod(){
        System.out.println("this is ststic method direct call without creating object");
    }
    //public method
    public void myPublicMethod() {
        System.out.println("this is public method must be call after creating object");
    }
    //main method
    public static void main(String[] args) {
        myStaticMethod();//call the static method
        staticPublic myObj =new staticPublic();//create an object to call public method
        myObj.myPublicMethod();//call public method
    }
}
