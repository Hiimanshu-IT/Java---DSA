package Arrayssss;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[]args){
         int Marks[]=new int[10];
         Scanner sc= new Scanner (System.in);
         System.out.println("Enter the marks of 3 subjects");
         Marks[0]=sc.nextInt();
         Marks[1]=sc.nextInt();
         Marks[2]=sc.nextInt();
         System.out.println("Maths"+Marks[0]+"Physics"+Marks[1]+"Chemistry"+Marks[2]);
    }
}
