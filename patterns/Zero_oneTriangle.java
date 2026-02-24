package patterns;
public class Zero_oneTriangle {
    public static void zero_one_triangle(int n){
        //outer loop fo the no.of lines
        for(int i = 1;i<=n;i++){
            //inner loop- What we have to write in the pattern
            for(int j =1;j<=i;j++){
                //now we check the condition for even and odd
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
      zero_one_triangle(5);
       }
}
