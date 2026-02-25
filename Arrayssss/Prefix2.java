package Arrayssss;

public class Prefix2 {
    public static int[] PrefixCreate(int numbers[]){
        
        int prefix[]=new int[numbers.length];
        prefix[0]=numbers[0];
      
        //now create the prefix
        for(int i = 1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        return prefix;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5};
        int result[]=PrefixCreate(numbers);
         
        for(int i=1;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}

