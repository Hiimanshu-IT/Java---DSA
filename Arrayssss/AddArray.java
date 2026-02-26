package Arrayssss;
public class AddArray {

    public static int[] SumArr(int new1[],int new2[]){
        int result[]=new int[new2.length];
        //for adding one by one we have to apply the loop 
        for(int i=0;i<new1.length;i++){
            result[i]=new1[i]+new2[i];
        }
        return result;

    }
    public static void main(String[]args){
        
        int new1[]={1,2,3,4};
        int new2[]={1,2,3,4};

       int result[]=SumArr(new1,new2);
        
        //for printing the array we will apply the loop
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+"  ");
        }
    }
}
