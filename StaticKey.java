class Mobile{
    String brand;
    int Price;
    static String name;//in this we declare the name to static 

    public void show(){
        System.out.println(brand+":"+Price+":"+name);
    }
}

public class StaticKey {
    public static void main(String[]a){
        //the first object
       Mobile obj1=new Mobile();
       obj1.brand="Apple";
       obj1.Price=1500;
       Mobile.name="SmartPhone";//we can call the object with the same name of class because it is static
        //the second object
        Mobile obj2=new Mobile();
        obj2.Price=1400;
        obj2.brand="Samsung";
        Mobile.name="Smartphone";
 //so if we change the value of static variable it will affect both the objects
        Mobile.name="Phone";
        //below we are just calling the show method 
        obj1.show();
        obj2.show();
        }    
    }

