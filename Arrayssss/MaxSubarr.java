package Arrayssss;

public class MaxSubarr {
    public static void MaxArrSum(int nums[]){
        int CurrSum=0;
        int Max=Integer.MIN_VALUE;
  
        //now we find the start of Ar
        for(int i=0;i<nums.length;i++){
            int start=i;
            //now we find the end of Arr
            for(int j=i;j<nums.length;j++){
                int end=j;
                CurrSum=0;
                //now we print the sum of array
                for(int k=start;k<=end;k++){
                 //subarray sum
                  CurrSum+=nums[k];
                    
                }
                }
                System.out.println(CurrSum);
                if(CurrSum>Max){
                 Max=CurrSum;
            }
            System.out.println("Max sum is "+Max);
        }
    }
    public static void main(String[]args){
        int nums[]={2,4,6,8,10};
       MaxArrSum(nums);
    } 
}
