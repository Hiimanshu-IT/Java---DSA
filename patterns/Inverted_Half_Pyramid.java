package patterns;

public class Inverted_Half_Pyramid {
   public static void HalfPyramid(int n){
    //outer loop
       for(int i = 1;i<=n;i++){
         //spaces
        for(int j = 1;j<=n-1;j++){
            System.out.print(" ");
        }
        //stars
        for(int j = 1;j<=i;j++ ){
            System.out.print("*");
        }
         System.out.println();
    } 
   
 }
    public static void main(String[]args){
        HalfPyramid(4);
    }
}
