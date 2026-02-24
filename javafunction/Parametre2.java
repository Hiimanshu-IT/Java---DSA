package javafunction;
import java.util.*;
public class Parametre2 {
    //In this we use int type...*return is nessary for the int type...
    public static int Calculatesum(int num1,int num2){//this is called the formal parametre or parametre
        int sum = num1+num2;
        return sum;
 }
    public static void main(String[]args){
        System.out.println("Enter your numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = Calculatesum(a, b);//this is called arguments or actual parametre which we use while calling.
        System.out.println("The sum is:"+sum);

    }
}

