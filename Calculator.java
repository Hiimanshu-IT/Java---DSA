import java.util.*;
public class Calculator {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your A");
        int a= sc.nextInt();

        System.out.println("enter your operator");
        char operator = sc.next().charAt(0);

        System.out.println("enter your B");
        int b = sc.nextInt();
        
        switch(operator) {
            case '+' : System.out.println(a+b);
            break;
            case '-': System.out.println(a-b);
            break;
            case '*': System.out.println(a*b);
            break;
            case '/': System.out.println(a/b);
            break;
            case '%': System.out.println(a%b);
            break;

        }

    }

}
