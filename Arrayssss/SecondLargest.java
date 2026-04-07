package Arrayssss;

public class SecondLargest {
    public static int FindSecondLargest(int arr[]){
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        //now we have to apply the loop for the whole array
        for(int nums:arr){
            //now we have to check the condition for the secondlargest
            if(nums>largest){
                secondlargest=largest;
                largest=nums;
            }else if(nums>secondlargest &&nums!=largest){
                secondlargest=nums;
            }            
        }
        return secondlargest;
    }
    public static void main(String[]args){
        int arr[]={12,45,56,78,69};
        System.out.println(FindSecondLargest(arr));
    }
}
