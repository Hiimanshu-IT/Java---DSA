package patterns;

public class Diamon {
    public static void Diamond(int n){
        //outer loop for no. of line we have to print 
        for(int i =1;i<=n;i++){
            //for spaces
            for(int j =1;j<=(n-i);j++){
                System.out.print(" ");
            } 
            //for the stars 
            for(int j =1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //for the inverted images
        for(int i=n-1;i>=1;i--){
            //spaces
             for(int j =1;j<=(n-i);j++){
                System.out.print(" ");
            } 
            //for the stars 
            for(int j =1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Diamond(5);
    }
}
