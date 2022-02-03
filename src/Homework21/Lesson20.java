
package Homework21;
import java.util.*;

public class Lesson20 {
 
    public  ArrayList <String> abc (String... a){
        ArrayList <String> list1 = new ArrayList <>();
        for(String s:a){
            
                list1.add(s);
            }
        
        Collections.sort(list1);
        System.out.println(list1);
        return list1;
    }
    public static void main(String[] args) {
        Lesson20 ls = new Lesson20();
        ls.abc("Privet","Good nigth", " Poka","Good nigth", "Good iving");
    }
}
