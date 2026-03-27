package Sortinggg;
public class Selection {
    public static void PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void SelectionSort(int arr[]){
         //now we create the outer loop.
         for(int i =0;i<arr.length-1;i++){
            int MinPos=i;
            //now we have to create the inner loop
            for(int j=i+1;j<arr.length;j++){
                //now we have to check the condition for the min/max.
                if(arr[MinPos]>arr[j]){
                MinPos=j;
            }
          }
          //now we have to apply the swap
          int temp = arr[MinPos];
          arr[MinPos]=arr[i];
          arr[i]=temp;
                
         }
    }
    
    public static void main(String[]args){
        int arr[]={2,4,1,3,6,5};
        SelectionSort(arr);
        PrintArr(arr);
    }
}
