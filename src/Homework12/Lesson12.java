package Homework12;

import Lesson11.Student;

public class Lesson12 {

}

class StudentTest {

    public static void metod1(Student st1, Student st2) {
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st1.grade) {
            System.out.println("Студенты равны");
        } else {
            System.out.println("Студенты разные");

        }
    }

    public static void metod2(Student st1, Student st2) {
        if (st1.name.equals(st2.name)) {
            if (st1.course == st2.course) {
                if (st1.grade == st2.grade) {
                    System.out.println("Студенты полностью совпадают");

                } else {
                    System.out.println("У студентов одинаковые имена и курс, но разные оценки");
                }
            } else {
                System.out.println("У студентов одинаковое имя, но разный курс ");
            }
        } else {
            System.out.println(" Студенты полностью отличаются");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ivan", 4, 5.5);
        Student s2 = new Student("Ivan", 5, 5.5);
        metod1(s1, s2);
        metod2(s1, s2);

    }
}
