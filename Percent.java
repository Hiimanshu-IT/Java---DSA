import java.util.Scanner;
public class Percent {
    public static void main(String[] args) {
      System.out.println("The total marks of the students:");
      Scanner Sc = new Scanner(System.in);
        int marks= Sc.nextInt();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks in english:");
        Float a = sc.nextFloat();
        System.out.println("Enter the marks in maths:");
        float b = sc.nextFloat();
        float sum = a+b;
        float Percent= (sum/marks)*100; 

      System.out.println("the percentage is"+ Percent + "%"); 

    }
    
}
