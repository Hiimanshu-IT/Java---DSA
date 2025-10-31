import java.util.Scanner;
import java.util.Random;

public class rockpaper {
    public static void main(String[] args) {
       // rock = 0;
       // paper=1;
       // sciccors=2;
        System.out.println("enter your value");
        Scanner sc = new Scanner(System.in);
      
        int userinput = sc.nextInt();
        Random rnd = new Random();
        int computerinput = rnd.nextInt(3);
        if (computerinput == userinput){
            System.out.println("match draw");
        }
        else if(computerinput == 0 && userinput == 1 || computerinput == 1 && userinput == 2 || computerinput == 2 && userinput == 0){
            System.out.println("human wins");
        }
        else{
            System.out.println("computer wins");
        }
        System.out.println("computer choice is following");
        if(computerinput == 0){
            System.out.println("computer choose ROCK");
        }
        else if (computerinput == 1){
            System.out.println("Computer choose Paper");
        }
        else {
            System.out.println("computer choose Sciccors");
        }
    }
}
