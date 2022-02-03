
package Lesson20;

import java.util.ArrayList;
public class Test1 {
    public static void main(String[] args) {
        
    ArrayList list = new ArrayList(); 
    list.add("privet");
    Car c = new Car();
    list.add(c);                        // так нельзя объявлять, ArrayList должен быть одного типа данных
    Student s = new Student();
    list.add(s);
    list.add(new StringBuilder("Hi"));
    
    
    ArrayList <String> list2  = new ArrayList (); // тут уже не сможем добавить объекты другого класса
    list2.add("privet");
    
}
}
    class Car{}
class Student{}

