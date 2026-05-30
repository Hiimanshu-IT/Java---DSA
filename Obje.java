class Student{
    int rollno;
    String name;
    int marks;
}
public class Obje {
    public static void main(String[]a){
        //First  object creation 
        Student obj=new Student();
        obj.rollno=65;
        obj.name="romeo";
        obj.marks=88;

       // second object creation 
        Student obj1=new Student();
        obj1.rollno=01;
        obj1.name="don";
        obj1.marks=90;

        //third object creation 
         Student obj2=new Student();
        obj2.rollno=55;
        obj2.name="john";
        obj2.marks=91;

        //fourth object creation
         Student obj3=new Student();
        obj3.rollno=57;
        obj3.name="zoya";
        obj3.marks=10;

        // now we have to create the array for all the object
        Student Students[]=new Student[4];
        //now we are assiging the values of object inside the array 
        Students[0]= obj;
        Students[1]= obj1;
        Students[2]= obj2;
        Students[3]= obj3;

        // now we have to print the array 
        // for(int i =0;i<Students.length;i++){
        //     System.out.println(Students[i].name+":"+Students[i].marks+" Rollno."+Students[i].rollno);
        // }
        //now we are using the enhanced for loop 
        for(Student stud :Students){
          System.out.println(stud.name +":"+stud.marks);
        }
    }
}
