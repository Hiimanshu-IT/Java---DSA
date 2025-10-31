import java.util.ArrayList;
import java.util.Collections;
public class Arraylist {
   public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>();   
     
    //add element
    list.add(0);
    list.add(2);
    list.add(3);
    System.out.println(list);

    //get elment 
    int element = list.get(1);
    System.out.println(element);

    //add element in between 
    list.add(1,1);
    System.out.println(list);

// set element
list.set(0,5); 
System.out.println(list);

//remove or delete
list.remove(3);
System.out.println(list);
 
//size of arraylist
int size = list.size();
System.out.println(size);

//loops in arraylist
for(int i=0; i<list.size(); i++){
   System.out.print(list.get(i));
}
System.out.println();
// sorting 
Collections.sort(list);
System.out.println(list);
 }
}
