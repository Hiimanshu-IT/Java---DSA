package Arrayssss;

public class TwoSum {
    public static int[] TwoSumArr(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                //now we will compare it
                if(nums[i]+nums[j]==target){
                     
                    return new int[]{i,j};

                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[]args){
        int nums[]={1,2,3,4};
        int target=5;
        
    int result[]= TwoSumArr(nums, target);
    System.out.print("The target is : "+result[0]+","+result[1]);
    }
}
