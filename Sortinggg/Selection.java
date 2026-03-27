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
                //in below if condition we are checking for the minimum element.
                // So if we change the between sign then we can get the maximum element.
                if(arr[MinPos]>arr[j]){
                //if(arr[MinPos]<arr[j])for maximum element.
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
