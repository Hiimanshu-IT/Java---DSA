import java.util.*;
public class PrimeEx {
    public static void main(String[]args){
        System.out.println("enter your no. : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 2){
            System.out.println("N is the prime no. ");
        } else {
        boolean isprime = true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i == 0){// n is a multiple of i & (i is not equal to 1 or n)
               isprime=false;
            }
        }
        if(isprime == true){
            System.out.println("N is the prime no. ");
        }
        else{
            System.out.println("N is not the prime no. ");
        }
        }
    }
    
}
