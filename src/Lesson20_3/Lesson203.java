
package Lesson20_3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Lesson203 {
    
    public static void main(String[] args) {
        ArrayList <String> a1 = new ArrayList <>();
        a1.add("one");
        a1.add("two");
        a1.add("three");
        System.out.println(a1);
        String [] array1 = a1.toArray(new String [5]);
        System.out.println("Ваш созданный массив из ArrayList " + Arrays.toString( array1));
        //List <String> l1 = a1.subList(0, 2);
      //  System.out.println(l1);  // создан лист с элементами A.L.1 с 0 по 2 индекс (не включистельно) 
      //  ArrayList <String> a2 = new ArrayList <>();
        //a2.add("one");
        //a2.add("two");
      // boolean result=  a2.containsAll(a1);
       
        //System.out.println(result);
        
       
       
    }
}
