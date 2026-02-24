package javafunction;

public class FuncOver {
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a, float b, float c){
        return a+b+c;
    }
        public static void main(String[]args){
           System.out.println(sum(5, 6)); 
            System.out.println(sum(5f, 6f, 2f));;


    }
}
