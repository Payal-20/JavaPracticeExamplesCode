package CLASS;

class outerClass {
    int x=9;
    class innerClass{
        int y=6;
    }
}
public class mainClass{
    public static void main(String[] args) {
        outerClass myOuter=new outerClass();
        outerClass.innerClass myInner =myOuter.new innerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}
