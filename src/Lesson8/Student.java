package Lesson8;

public class Student {

    String Name;
    int course;
    static int count;

    public Student(String Name2, int course2) {
        count++;
        Name = Name2;
        course = course2;
        System.out.println("Student № " + count);
    }
}

class StudentTest {

    public static void main(String[] args) {

        Student st1 = new Student("Ivan", 2);
        Student st2 = new Student("Petr", 3);
        Student st3 = new Student("Nik", 1);

    }

}
