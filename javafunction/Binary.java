package javafunction;

public class Binary {
   public static void BinToDeci(int binNum){
      int mynum=binNum;
      int pow=0;
      int deciNo=0;

      while(binNum>0){
         int lastdigit=binNum%10;
         deciNo=deciNo+lastdigit*(int)Math.pow(2, pow);
           
         pow++;
         binNum=binNum/10;
      }
      System.out.println("decimal of "+mynum+" = "+deciNo);
   }
   public static void main(String[] args) {
      BinToDeci(101);
   }
}

