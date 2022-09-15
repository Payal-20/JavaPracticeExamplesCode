public class student {
    String name;
    int age;

    public void getInfo() {
        System.out.println("age of the student is"+ age);
        System.out.println("Name of the studen is"+name);
    }
    public static void main(String args[]) {
        System.out.println("fist student info:");
        student s1=new student();
        s1.name="Payal";
        s1.age=20;
        s1.getInfo();

        System.out.println("second student info:");
        student s2=new student();
        s2.age=21;
        s2.name="sharawn";
        s2.getInfo();

    }
}
