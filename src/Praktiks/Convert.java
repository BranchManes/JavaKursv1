
package Praktiks;

import java.util.Arrays;
import java.util.ArrayList;
public class Convert {
    
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList <> ();
        list.add("Oracle");
        list.add("Good");
        list.add("Good nigth");
        String [] container = new String [list.size()];
        String [] array = list.toArray(container);
        System.out.println(Arrays.toString(array));
        
            
        }
    }

