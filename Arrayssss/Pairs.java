package Arrayssss;
public class Pairs {
    public static void Pairss(int numbers[]){

        //for finding the no. of pairs are created
            int tp=0;

        //outer loop for the complete array
        for(int i = 0;i<numbers.length;i++){

            //creating current variable
            int curr=numbers[i];//(2,4,6,8,10)

            //inner loop for printing the pairs in the array
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+curr+","+numbers[j]+")");
                tp++;
                
            }
            System.out.println();
         }
         System.out.println("the total no. of pairs are :"+tp);
    }
       
    public static void main(String[]args){
        int numbers[]={2,4,6,8,10};
        Pairss(numbers);
        
    }    
}
