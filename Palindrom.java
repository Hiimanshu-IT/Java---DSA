public class Palindrom {
    public static void main(String[]a){
        int n = 123;
        int reverse = 0;
        int originalNo = n;

       // Now we have to apply the loop for each digit we have to check
       while(n>0){
        //now first we have to reverse the no.
         int lastdigit=n%10;
         reverse=reverse*10+lastdigit;
         n=n/10;
       }
       //now we have to compare the original value and the reverse value 
       if(originalNo==reverse){
        System.out.println("this no. is palindrome");
       }else{
        System.out.println("This is not the palindrome");
       }
    }
}
