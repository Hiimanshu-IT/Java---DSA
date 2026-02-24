package javafunction;
import java.util.*;
public class Parametre {
    // In this we use void  type....*return is not necessory for the void 
    public static void Calculatesum(int num1,int num2){
        int sum = num1+num2;
        System.out.println("The sum is:"+sum);
}
    public static void main(String[]args){
        System.out.println("enter your numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Calculatesum(a, b);

    }
}
