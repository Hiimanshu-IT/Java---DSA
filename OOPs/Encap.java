package OOPs;

class Human{
    private int age;
    private String name;
    // now we use Constructor
    public Human(){
        System.out.println("In Constructor");
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }  
}
public class Encap {
    public static void main(String[]a){
         Human obj = new Human();
         System.out.println(obj.getName()+":"+obj.getAge());// we are printing before assigning
         obj.setAge(30);
         obj.setName("John");
        //  System.out.println(obj.getName()+":"+obj.getAge());
    }
}
