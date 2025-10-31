import java.util.Scanner;
public class marks_if_else {
    public static void main(String[] args) {
        int totalmarks=500;
        System.out.println("Enter your English Marks");
        Scanner sc = new Scanner(System.in);
        int English= sc.nextInt();

        System.out.println("Enter your Hindi marks Marks");
        Scanner sc2 = new Scanner(System.in);
        int Hindi = sc2.nextInt();

        System.out.println("Enter your Maths Marks");
        Scanner sc3 = new Scanner(System.in);
        int Maths= sc3.nextInt();

        System.out.println("Enter your Physics Marks");
        Scanner sc4 = new Scanner(System.in);
        int Physics = sc4.nextInt();

        System.out.println("Enter your Chemistry Marks");
        Scanner sc5 = new Scanner(System.in);
        int Chemistry = sc5.nextInt();

        float sum = English+Hindi+Maths+Physics+Chemistry;
        float Percent = sum/totalmarks*100;
        System.out.println("your percentage is "+Percent);

        if(Percent>33){
            System.out.println("the student is pass");
         }  
       else{
        System.out.println("the student is fail");
           }

    }
}
    

