package Lesson30;

import java.util.ArrayList;
import java.util.Arrays;

public class Test1 {
}

class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class ShowInfo {
    void abc(Student s) {
        System.out.println("Имя студента:" + s.name + ", пол студента:" + s.sex + ", возраст:" + s.age +
                ", курс:" + s.course + ", средняя оценка студента:" + s.avgGrade);
    }

    void printSdudentOverGrade(ArrayList<Student> al, double avgGrade) {
        for (Student s : al) {
            if (s.avgGrade > avgGrade) {
                abc(s);
            }
        }

    }

    void printSdudentUnderGrade(ArrayList<Student> al, double avgGrade) {
        for (Student s : al) {
            if (s.avgGrade < avgGrade) {
                abc(s);
            }
        }

    }

    void printSdudentOverAge(ArrayList<Student> al, int age) {
        for (Student s : al) {
            if (s.age > age) {
                abc(s);
            }
        }

    }

    void printSdudentUnderAge(ArrayList<Student> al, int age) {
        for (Student s : al) {
            if (s.age < age) {
                abc(s);
            }
        }

    }

    void printSdudentbySex(ArrayList<Student> al, char sex) {
        for (Student s : al) {
            if (s.sex == sex) {
                abc(s);
            }
        }

    }

    void printSdudentMixCondition(ArrayList<Student> al, double avgGrade, int age, char sex) {
        for (Student s : al) {
            if (s.avgGrade > avgGrade && s.age < age && s.sex == sex) {
                abc(s);
            }
        }

    }

    public static void main(String[] args) {
        ArrayList<Student> lest = new ArrayList<>();
        Student s1 = new Student("Ivan", 'm', 22, 4, 8.3);
        Student s2 = new Student("Vova", 'm', 21, 4, 7);
        Student s3 = new Student("Uri", 'm', 20, 3, 5);
        Student s4 = new Student("Saha", 'f', 21, 4, 8.5);
        Student s5 = new Student("Uly", 'f', 22, 4, 7.3);
        Student s6 = new Student("Dasha", 'f', 20, 3, 7.6);
        lest.add(s1);
        lest.add(s2);
        lest.add(s3);
        lest.add(s4);
        lest.add(s5);
        lest.add(s6);
        ShowInfo s = new ShowInfo();
        s.printSdudentOverGrade(lest, 7);
        System.out.println("-------------------------------------------------------------------------------------------");
        s.printSdudentUnderGrade(lest,8);


    }
}