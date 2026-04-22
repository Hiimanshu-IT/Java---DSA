package Arrayssss;

public class Spiral {
    public static void PrintSpiral(int matrix[][]){
        int startrow =0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcoll=matrix[0].length-1;
         
        while(startrow<=endrow &&startcol<=endcoll){
            //now we have to print the top layer 
            for(int j=startcol;j<=endcoll;j++){
                System.out.print(matrix[startrow][j]+" ");
            }
            //now we have to print the right layer 
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcoll]+" ");
            }
            //now we have to print the bottom layer 
            for(int j=endrow-1;j>=startrow;j--){
                System.out.print(matrix[endrow][j]+" ");
            }
            //now we have print the left layer
            for(int i=endrow-1;i>=startrow+1;i--){
                System.out.print(matrix[i][startcol]+" ");
            }
            startcol++;
            startrow++;
            endcoll--;
            endrow--;
        }
    }
    public static void main(String[]a){
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
                       PrintSpiral(matrix);
    }
}
