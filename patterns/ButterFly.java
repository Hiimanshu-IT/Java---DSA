package patterns;

public class ButterFly {
    public static void ButterFly1(int n ){
        //outer loop
        for(int i=1;i<=n;i++){
            //now we print for first part
            for(int j=1;j<=i;j++){
                System.out.print("*");
                }
                //now we print middle spaces
                for(int j =1;j<=2*(n-i);j++){
                    System.out.print(" ");
                }
                //now we print for second part
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                 //now we have to change the line...
               System.out.println();
               }
                 
               //for reverse we have to reverse the loop
                
               for(int i=n;i>=1;i--){
                //now we print stars for the lower first part
                for(int j=1;j<=i;j++){
                System.out.print("*");
                }

                //now we print the middle lower spaces..
                for(int j =1;j<=2*(n-i);j++){
                    System.out.print(" ");
                }
                //now we have to print the second part of lower half
                 
            for(int j=1;j<=i;j++){
                System.out.print("*");
                }
                System.out.println();
            }
    }
    public static void main(String[] args) {
        ButterFly1(4);
    }
}
