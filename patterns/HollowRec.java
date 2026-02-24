package patterns;
public class HollowRec {
    public static void hollow_Rec(int totalRow,int totalColum){
        for(int i=1;i<=totalRow;i++){
             
            for(int j=1;j<=totalColum;j++){
                
                if(i == 1 || i == totalRow || j == 1 || j == totalColum){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
             }
             System.out.println();
        }
    }
    public static void main (String[]args){
          hollow_Rec(4,5 );
    }
}
