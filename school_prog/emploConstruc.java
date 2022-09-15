public class emploConstruc {
    int empNum;
    String empName;
    public  emploConstruc(int num,String name) {
       empName=name;
       empNum=num;

    }
    public static void main(String[] args) {
        emploConstruc details=new emploConstruc(20, "Payal"); 
        System.out.println(details.empNum+" "+details.empName);   
    }

    
}
