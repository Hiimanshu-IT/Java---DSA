package Sortinggg;

public class Counting {
    //Function for printing the array
    public static void PrintArr(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
 //function for the solution
 public static void CountingSort(int arr[]){
    int largest=Integer.MIN_VALUE;
    //now we have to apply the loop.
    for(int i =0;i<arr.length;i++){
        largest=Math.max(largest, arr[i]);
    }
    int count[]=new int[largest+1];
    for(int i=0;i<arr.length;i++){
        count[arr[i]]++;
    }
    //now function for the sorting
    int j=0;
    for(int i=0;i<count.length;i++){
         while(count[i]>0){
         arr[j]=i;
         j++;
         count[i]--;
         }

    }
}
public static void main(String[] args) {
    int arr[]={1,3,1,5,3,4,2,5};
    CountingSort(arr);
    PrintArr(arr);
}
}