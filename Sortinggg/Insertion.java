package Sortinggg;

public class Insertion {
    public static void PrintArr(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void InsertionSort(int arr[]){
        //now we have to apply the outer loop.
        for(int i =1;i<arr.length;i++){
            int curr=arr[i];//current element
            int pre=i-1;

            //now we have to check condition 
            while(pre>=0&&arr[pre]>curr){
                arr[pre+1]=arr[pre];
                pre--;
            }
            arr[pre+1]=curr;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,4,5,2,3};
        InsertionSort(arr);
        PrintArr(arr);
    }
}
