import java.util.Scanner;
public class websitetype {
    public static void main(String[] args) {
        System.out.println("enter your website name");
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if(website.endsWith(".org")){
            System.out.println("this is an organizal website");
        }
        else if(website.endsWith(".com")){
            System.out.println("this is a comertial website");

        }
        else if (website.endsWith(".in")){
            System.out.println("this is an indian website");
        }

        }
    }
    

