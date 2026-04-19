package Arrayssss;

import java.util.Scanner;

public class Matrix {
    public static boolean Search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
              if(matrix[i][j]==key){
                System.out.print("found at this index"+"("+i+","+j+")");
                return true;
              }
            }
        }
        System.out.println("Key not found ");
        return false;
    }
    public static void main(String[]a){
         int matrix[][]=new int[3][3];
         int n=matrix.length,m=matrix[0].length;
         //now we have to take the input from the user 
         Scanner sc=new Scanner(System.in);
         for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
             matrix[i][j]=sc.nextInt();
           }
         }
         //now the output
         for(int i=0;i<n;i++){
           for(int j =0;j<m;j++){
            System.out.print(matrix[i][j]+" ");
           }
            System.out.println(" ");    
         }
           Search(matrix, 9);
      }
   
}
