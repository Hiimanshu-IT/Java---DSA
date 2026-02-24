package patterns;

public class HollowRhom {
    public static void HollowRhombus(int n){
        //outer loop for how many lines we have to print 
        for(int i = 1;i<=n;i++){
            //now we have to put some spaces 
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //now we have to print tilted rectangle
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
           System.out.println();
        }
    }
    public static void main(String[] args) {
        HollowRhombus(5);
    }
}
