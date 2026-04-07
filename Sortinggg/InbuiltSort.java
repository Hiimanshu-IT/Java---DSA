package Sortinggg;
import java.util.*;

public class InbuiltSort {
    public static void PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[]args){
        int arr[]={2,4,5,1,3};
        Arrays.sort(arr);
        PrintArr(arr);
    }
}
