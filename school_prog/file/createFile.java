package file;

import java.io.File;
import java.io.IOException;

public class createFile {
    public static void main(String[] args) {
        try{
            File myObj= new File("payal.txt");
            if(myObj.createNewFile()){
                System.out.println("file Created: "+ myObj.getName());
            }else{
                System.out.println("file already exist");
            }
        }catch(IOException e){
            System.out.println("an error occured");
            e.printStackTrace();
        }
    }
}
