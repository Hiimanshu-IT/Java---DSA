public class narrow{
    public static void main(String[]args){
        double myDouble=9.78d;
        int myInt=(int)myDouble;//it is manualy casted!
        System.out.println(myDouble);
        System.out.println(myInt);
        //example of narrow casting
        int maxScore=500;
        int userScore=425;
        //now we calculate the percentage of the user,in this we convert userscore to float for accurate answer.
    float percentage =(float)userScore / maxScore *100f;
    System.out.println("user percentage is "+percentage);
    }
}
