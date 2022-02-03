package Lesson22;

public class Employee {

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

class Doctor extends Employee {
    String spesializacia;
    void leshit(){
        System.out.println("leshit");
    }

}
class Driver extends Employee{
String markamashihi;
void vodit(){
    System.out.println("Rabotaet");
}
}
class Teacher extends Employee{
    int kolichesnvoUchenikov;
    void uchit(){
        System.out.println("Ushit");
    }
}
class Test36{
    public static void main(String[] args) {
        Doctor d = new Doctor();
        d.age=53;
        d.expereence = 20;
        d.name="Jacob";
        d.spesializacia="Hirurg";
        d.leshit();
        System.out.println(d.age+" "+d.expereence+ " "+d.name);
    }
}