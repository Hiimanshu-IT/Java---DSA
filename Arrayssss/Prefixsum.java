package Arrayssss;

public class Prefixsum {
    public static void PrefixMaxSum(int numbers[]){

        int cursum=0;
        int Max=Integer.MIN_VALUE;
        int prefix[]= new int[numbers.length];
        
        prefix[0]=numbers[0];

        // now we have to find the prefix sum
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }

        //now we have to find the start of the array
        for(int i=0;i<numbers.length;i++){
            int start =i;

            //now we have to find the end of the array
            for(int j=i;j<numbers.length;j++){
                int end =j;

                //below we applied the method if the sum of first index in equal to the 0;
                cursum = start==0 ? prefix[end] : prefix[end]-prefix[start-1];

                //now we have to check the condition for the maxvalue
                if(cursum>Max){
                   Max=cursum;
                }

            }
        }
        System.out.println("The maximum sum is : "+Max);
    }
    public static void main(String []args){
    int numbers[]={1,-2,6,-1,3};
    PrefixMaxSum(numbers);
    }
}
