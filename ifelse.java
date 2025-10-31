public class ifelse {
    public static void main (String[]args){
        int time =5;
        if(time>12){
            System.out.println("Good Evening");
        }
        else{
            System.out.println("good afternoon");
        }
        //now we use ( else if)
        int time2 =10;
        if(time2>10){
            System.out.println("its an afternoon");
        }
        else if(time2==30){
            System.out.println("its a night");
        }
        else{
            System.out.println("good");
        }
        //now  we use (Short Hand if...else)
        int time3 =52;
        String result = (time3 < 15) ? "good evening" : "good afternoon";       
        System.out.println(result);
     }
}


