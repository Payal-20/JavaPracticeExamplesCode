public class classC {
    String color;
    int age;
    void run(String food){
        System.out.println("dog can eat"+ food);
    }
    public static void main(String[] args) {
        classC dog=new classC();
        dog.age=20;
        dog.color="black";
        dog.run("dog food");
    }
}
