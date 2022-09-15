import java.util.Scanner;
interface Test{
    void test1(int m1);
    void test2(int m2);
    void test3(int m3);
}
class Student{
    private int rollNo;
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
class Result extends Student implements Test{
    float avgRes;
    @Override
    public void test1(int m1) {
        System.out.println("Test 1 Marks : "+m1);
    }
    @Override
    public void test2(int m2) {
        System.out.println("Test 2 Marks : "+m2);
    }
    @Override
    public void test3(int m3) {
        System.out.println("Test 3 Marks : "+m3);
    }
    public void averageResult(int m1,int m2,int m3){
        avgRes = (m1+m2+m3)/3f;
        System.out.println("Average Result : "+avgRes+"%");
    }

    public void show(){
        System.out.println("Show Method : ");
        System.out.println("Student Roll No : "+getRollNo());
        System.out.println("Student Name : "+getName());
    }
    public void displayAll(){
        System.out.println("Display all Method : ");
        show();
        System.out.println("Average Result : "+avgRes);
    }
}
class InterfaceProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Result r1 = new Result();
        System.out.print("Enter Student Roll.No : ");
        int rollNo = sc.nextInt();
        System.out.print("Enter Student Name : ");
        String name = sc.next();
        System.out.print("Enter Test 1 Marks : ");
        int m1 = sc.nextInt();
        System.out.print("Enter Test 2 Marks : ");
        int m2 = sc.nextInt();
        System.out.print("Enter Test 3 Marks : ");
        int m3 = sc.nextInt();
        System.out.println();
        r1.test1(m1);
        r1.test2(m2);
        r1.test3(m3);
        System.out.println();
        r1.setRollNo(rollNo);
        r1.setName(name);
        r1.show();
        System.out.println();
        r1.averageResult(m1,m2,m3);
        System.out.println();
        r1.displayAll();
    }
}

