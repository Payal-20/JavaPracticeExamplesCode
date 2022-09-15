package file;

import java.io.File;

public class fileInfo {
    public static void main(String[] args) {
        File myObj=new File("payal.txt");
        if(myObj.exists()){
            System.out.println("file name: "+myObj.getName());
            System.out.println("Absolute Path: "+myObj.getAbsolutePath());
            System.out.println("Writable "+myObj.canWrite());
            System.out.println("Readable " + myObj.canRead());
            System.out.println("File size in bytes " + myObj.length());
        } else {
            System.out.println("The file does not exist.");
        }
    } 
}
