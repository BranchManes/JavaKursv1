package Lesson30;

import java.util.ArrayList;
import java.util.Arrays;

public class Test2 {

}

class Student2 {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    Student2(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class ShowInfo2 {
    void abc(Student2 s) {
        System.out.println("Имя студента:" + s.name + ", пол студента:" + s.sex + ", возраст:" + s.age +
                ", курс:" + s.course + ", средняя оценка студента:" + s.avgGrade);
    }

    void test(ArrayList<Student2> al, StudentCheks scf) {
        for (Student2 s : al) {
            if (scf.testStudent(s)) {
                abc(s);
            }
        }

    }


    public static void main(String[] args) {

        ArrayList<Student2> lest = new ArrayList<>();
        Student2 s1 = new Student2("Ivan", 'm', 22, 4, 8.3);
        Student2 s2 = new Student2("Vova", 'm', 21, 4, 7);
        Student2 s3 = new Student2("Uri", 'm', 20, 3, 5);
        Student2 s4 = new Student2("Saha", 'f', 21, 4, 8.5);
        Student2 s5 = new Student2("Uly", 'f', 22, 4, 7.3);
        Student2 s6 = new Student2("Dasha", 'f', 20, 3, 7.6);
        lest.add(s1);
        lest.add(s2);
        lest.add(s3);
        lest.add(s4);
        lest.add(s5);
        lest.add(s6);
        ShowInfo2 s = new ShowInfo2();
        FindStudentOverGrade fid = new FindStudentOverGrade();
        s.test(lest, fid);


    }


}

interface StudentCheks {
    boolean testStudent(Student2 s);
}

class FindStudentOverGrade implements StudentCheks {
    public boolean testStudent(Student2 s) {
        return s.avgGrade > 8;
    }
}