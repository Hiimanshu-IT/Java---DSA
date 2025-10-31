public class mth{
    public static void main (String[]args){
        // 1. (Math max)
        System.out.println(Math.max(10,20));
        // 2. (Math min)
        System.out.println(Math.min(50,45));
        // 3. (Math sqrt)
        System.out.println(Math.sqrt(5));
        // 4. (Math abs)
        System.out.println(Math.abs(-56));
        // 5. (Math random)
        System.out.println(Math.random());
        // (Math random2)if we want certain value between 0 to 100.
        int randomNo = (int)(Math.random())*101;
       System.out.println("the random no. is "+randomNo);
       
    }
}