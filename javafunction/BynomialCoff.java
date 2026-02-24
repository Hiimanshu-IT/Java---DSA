package javafunction;

public class BynomialCoff {
    public static int Factorial1(int n){
        int f = 1;
        for(int i=1;i<=n;i++){
            f*=i;
         }
        return f;
    }
    public static int BynomialCoff1(int n,int r){
        int Fact_n = Factorial1(n);
        int Fact_r = Factorial1(r);
        int Fact_nmr= Factorial1(n-r);

        int NCR = Fact_n/( Fact_r*Fact_nmr);
        return NCR;

    }
    public static void main(String[]args){
      System.out.println(BynomialCoff1(5, 2));
      
    }
}
