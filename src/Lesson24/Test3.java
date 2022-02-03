package Lesson24;

public class Test3 {

    public static void main(String[] args) {

        Help_ablee h = new Driver();
        h.pomosh();
        h.tushitpojar("voda");
        Driver d = new Driver();
        d.rabota();
        proverkaTetradi.Proverka();

    }
}

class Employee {

    int age;
    String name;
    int expereence;

    void eat() {
        System.out.println("Kushat");

    }

    void sleap() {
        System.out.println("Spat");
    }
}

class Driver extends Employee implements Help_ablee, mashina {

    String markamashihi;

    void vodit() {
        System.out.println("Rabotaet");
    }

    public void pomosh() {
        System.out.println("Driver okazyvaet pomosh");
    }

    public void tushitpojar(String s) {
        System.out.println("Driver tushit pojar " + s);
    }

}

class Teacher extends Employee implements Help_ablee, Swim_ablee, proverkaTetradi {

    int kolichesnvoUchenikov;

    void uchit() {
        System.out.println("Ushit");
    }

    public void pomosh() {
        System.out.println("Teacher okazyvaet pomosh");
    }

    public void tushitpojar(String s) {
        System.out.println(" Teacher tushit pojar()" + s);
    }

    public void swim() {
        System.out.println("Teacher plavaet");
    }
}

interface Help_ablee {

    void pomosh();

    void tushitpojar(String predmet);
}

interface Swim_ablee {

    void swim();
}

interface mashina {

    default void rabota() {
        System.out.println("Водитель водит");
    }
}

interface proverkaTetradi {

    static void Proverka() {
        System.out.println("Проверяет тетради");
    }
}
