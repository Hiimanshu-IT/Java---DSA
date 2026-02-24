package Arrayssss;
public class ReverseArr {
    public static void Reverse(int numbers[]){
        int First =0;int Last=numbers.length-1;

        while(First<Last){
            // now we swap the array values
             int temp=numbers[Last];
             numbers[Last]=numbers[First];
             numbers[First]=temp;

             First++;
             Last--;

        }
    }
    public static void main(String[]args){
        int numbers[]={2,4,6,8,10};
        Reverse(numbers);
        //Now print the array
        for(int i = 0;i<numbers.length;i++ ){
            System.out.print(numbers[i]+",");
        }
        System.out.println();
    }
}
