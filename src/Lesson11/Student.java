
package Lesson11;


public class Student {
    public  String name;
    public int course;
    public double grade;
   
   
    
    public Student (String name, int course, double grade){
        this.name = name;
        this.course =course;
        this.grade = grade;
        
    }
   
     
     public static void main(String[] args) {
         
        Student st1 = new Student( "Ivan", 3,2.5);
        Student st2 = new Student( "Jim", 2,2.3);
        System.out.println(st1.name);
        System.out.println(st2.name);
        
        
     }
}

