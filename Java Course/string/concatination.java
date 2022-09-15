package string;

public class concatination {
    public static void main(String args[]) {
        
    //concatination 
        String firstname="Payal";
        String lastname=" Bhor";
        String fullname=firstname + lastname;
        System.out.println(fullname.length());
        //charAt
        for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }
    }    
}
