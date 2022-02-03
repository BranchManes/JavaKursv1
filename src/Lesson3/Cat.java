
package Lesson3;

public class Cat {
   
    String name;
    int age;
    String breed;
    
   
    public static void main(String[] args) {
        
        Cat cat1 = new Cat();
        cat1.age = 10;
        cat1.name = "Barsik";
        cat1.breed = "British";
        
        Cat cat2 = new Cat();
        cat2.age = 2;
        cat2.name = "Felix";
        cat2.breed = "Abesin";
        
        System.out.println(" Кличка: " + cat1.name + ",возраст:" +cat1.age + ",порода:" +cat1.breed + ".");
        System.out.println(" Кличка: " + cat2.name + ",возраст:" +cat2.age + ",порода:" +cat2.breed + ".");



}
    
    
}   
   

