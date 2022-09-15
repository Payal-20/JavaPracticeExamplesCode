public class getSet {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String newName) {
        this.name=newName;
    }
    public static void main(String[] args) {
        getSet myObj=new getSet();
        // myObj.name="payal";
        // System.out.println(myObj.name);
        myObj.setName("Payal");
        System.out.println(myObj.getName());
    }
}
