import java.util.Scanner;
public class convertor {
    public static void main(String []args){
        System.out.println("enter your kilometre value");
        Scanner sc= new Scanner(System.in);
        double kilometre = sc.nextDouble();
        double metre= kilometre*1000;
        System.out.println(kilometre+"kilometre is "+metre+"metre is");
    }
    
}
