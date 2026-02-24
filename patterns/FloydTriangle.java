package patterns;
public class FloydTriangle {
    public static void Triangle(int n){
        int counter= 1;
        //outer loop for how many lines we have to print
        for(int i= 1;i<=n;i++){
            //inner loop for what we have to write in the pattern
            for(int j = 1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
     public static void main(String[]args){
           Triangle(5);
    }
}
