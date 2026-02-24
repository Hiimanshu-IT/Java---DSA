package patterns;

public class SolidRhom {
    public static void SolidRhombus(int n){
        //outer loop for how many lines we have to print
        for(int i = 1;i<=n;i++){
            //inner loop for first spaces
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            //now we have to print stars
            for(int j = 1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
       }
       public static void main(String[] args) {
        SolidRhombus(5);
       }
}
