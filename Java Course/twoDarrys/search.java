package twoDarrys;

import java.util.Scanner;

public class search {
    public static void main(String args[]) {
        try( Scanner sc= new Scanner(System.in)){
            System.out.println("enter no. rows and columns:");
            int rows= sc.nextInt();
            int columns=sc.nextInt();
            int number[][]=new int [rows][columns];
            //input
            //rows
            System.out.println("enter elements of rows and columns:");
            for(int i=0; i<rows; i++){
                //columns
                for(int j=0;j<columns;j++){
                    number[i][j]=sc.nextInt();
                }

            }
            System.out.println("enetr a number to search:");
            int x=sc.nextInt();
            for(int i=0; i<rows;i++){
                for(int j=0;j<columns;j++){
                    if(number[i][j]==x){
                        System.out.println("element found at index:"+ i + " "+j);
                    }
                }
            }
        }
    }
}
