import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number  ;
        int choice ;
        int evensum=0;
        int oddsum =0;
 
        do{
            System.out.println("enter your no. ");
             number = sc.nextInt();
             if(number %2 == 0){
                evensum += number;
                
             }else {
                oddsum+= number;
             }
             System.out.println("if you want to continue press 1 for yes and 0 for no");

             choice = sc.nextInt();
        }while(choice == 1);
        System.out.println("sum of even no."+evensum);
        System.out.println("sum of odd no."+oddsum);
        }
    }
    
    

