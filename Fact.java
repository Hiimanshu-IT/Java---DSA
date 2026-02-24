import java.util.*;
public class Fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int fact = 1;
        System.out.println("enter any positive no.");
        num = sc.nextInt(); 
        for(int i = 1;i<=num;i++){
            fact *= i;
        }
        System.out.println("The factorial is : "+ fact);
    }
}
