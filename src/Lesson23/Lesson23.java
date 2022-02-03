package Lesson23;

public class Lesson23 {

    public static void main(String[] args) {
        Employee em1 = new Employee();
        em1.eat();
        Teacher t = new Teacher();
        t.eat();
    }

}

class Eda {

}

class Frukts extends Eda {

}

class Employee {

    int age;
    String name;
    int expereence;

    Eda eat() {
        System.out.println("Kushat");
        Eda e = new Eda();
        return e;

    }

    void sleap() {
        System.out.println("Spat");
    }
}

class Teacher extends Employee {

    int kolichesnvoUchenikov;

    void uchit() {
        System.out.println("Ushit");
    }

    Frukts eat() {
        System.out.println("Kushaet uchitel");
        Frukts f = new Frukts();
        return f;

    }
}
