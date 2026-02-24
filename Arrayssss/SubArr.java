package Arrayssss;

public class SubArr {
    public static void SubArray(int numbers[]){
        //from tp we find no. of subarrays are present in the array
        int tp=0;

        //now we have to find the start 
        for(int i=0;i<numbers.length;i++){
            int start=i;

            //now we have to find the end 
            for(int j=i;j<numbers.length;j++){
                int end = j;

                //now we have to print the subarrays
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+" ");
                }
                tp++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("the total subarrays are: "+tp);
    }
    public static void main(String[]args){
        int numbers[]={2,4,6,8,10};
        SubArray(numbers);
    }
}
