public class ifelsereal {
    public static void main(String[]args){
      //This example shows how you can use if..else to find out if a number is positive or negative:
     int mynum =0;
     if(mynum>0){
        System.out.println("this no. is positive");
     }
     else if(mynum>0){
        System.out.println("this no. is not positive");
     }
     else{
        System.out.println("the value is zero");
      }
       //Find out if a person is old enough to vote:
      int myAge = 25;
      int votingAge = 18;
      if (myAge >= votingAge) {
         System.out.println("Old enough to vote!");
      }
      else{
         System.out.println("Not old enough to vote.");
      }
      //Find out if a number is even or odd:
      int myNum =5;

    if (myNum % 2 == 0) {
        System.out.println(myNum + " is even");
     }   
    else{
        System.out.println(myNum + " is odd");
      } 
   }
}
