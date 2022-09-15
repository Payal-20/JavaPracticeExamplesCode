package twoDarrys;

import java.util.Scanner;

public class arrays {
    public static void main(String args[]) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("enter no of rows and columns:");
            int rows= sc.nextInt();
            int columns= sc.nextInt();
            int [][] number = new int [rows][columns]; 
            //input
            //rows
            System.out.println("enter elements:");
            for(int i=0;i<rows;i++){
                //coumns
                for(int j=0;j<columns;j++){
                    number[i][j]=sc.nextInt();
                }
            } 
            //output
            for(int i=0; i<rows; i++){
                for(int j=0;j<columns;j++){
                    System.out.print(number[i][j] +" ");
                }
                System.out.println();
            }
            
        }
    }
}
