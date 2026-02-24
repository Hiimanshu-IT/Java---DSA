package Arrayssss;
public class BinarySearch {
    public static int Binary(int numbers[],int key){
        int start =0;int end = numbers.length-1;

        while (start<=end) {
            int mid=(start+end)/2;
            //compare the key with mid
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start=mid+1;//Right side of the array
            }else{
                end=mid-1;//Left side of the array
            }
               
            }
            return -1;  
        }
        public static void main(String[]args){
        int numbers[]={2,4,6,8,10,12,14};
        int key=10;
        System.out.println("the index of the key:"+Binary(numbers, key));
        }
    }
    
    

