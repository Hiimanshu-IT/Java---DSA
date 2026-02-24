package Arrayssss;

public class LargestArr {
    public static int LarArr(int nums[]){
    int max = nums[0];

    for(int i = 1; i < nums.length; i++){
        if(nums[i] > max){
            max = nums[i];
        }
    }
    return max;
}

    public static void main(String[]args){ 
        int nums[]={3,3,6,1};
        int result = LarArr(nums);
        System.out.println("The largest element is: " + result);

    }
}
