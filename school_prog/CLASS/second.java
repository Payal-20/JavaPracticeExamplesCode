package CLASS;

class second {
    public static void main(String[] args) {
        Student myObj=new Student();//object of the second class
        System.out.println("Name:"+myObj.fname);
        System.out.println("Age:"+myObj.age);
        System.out.println("Graduation Year:"+myObj.gradutatioYear);
        myObj.study();//call abstract method
    }
    
}
