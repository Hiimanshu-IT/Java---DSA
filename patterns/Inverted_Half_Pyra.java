package patterns;
public class Inverted_Half_Pyra {
    public static void Inverted_Half_Pyra_With_Numbers(int n){
        //outer loop for the no. of lines
        for(int i =1;i<=n;i++){
        //inner loop for what we have to write
        for(int j = 1;j<=n-i+1;j++){
            System.out.print(j+" ");
        }
         System.out.println();
        }
       
    }
    public static void main(String[]args){
        Inverted_Half_Pyra_With_Numbers(5);

    }
}
