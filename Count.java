public class Count {
    public static void main(String[]a){
            int  digit = 1234;
            int  Count=0;
            
            while(digit>0){
                digit=digit/10;
                Count++;
            }
            System.out.println("The digit is "+Count);
    }
}
