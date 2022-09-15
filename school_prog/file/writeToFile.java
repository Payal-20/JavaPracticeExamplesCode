package file;

import java.io.FileWriter;
import java.io.IOException;

public class writeToFile {
    public static void main(String[] args) {
        try{
            FileWriter myWriter = new FileWriter("payal.txt");
            myWriter.write("its fun coding");
            myWriter.close();
        }catch(IOException e){
            System.out.println("error occured");
            e.printStackTrace();
        }
    }
}
