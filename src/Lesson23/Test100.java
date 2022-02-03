package Lesson23;

public class Test100 {

    public static void main(String[] args) {
        V em1 = new C();
        em1.eat();
        em1.setAge(5);
        System.out.println(em1.getAge());
        V em2 = new V();
        em2.setAge(25);
        System.out.println(em2.getAge());

    }

}

class V {

    private int age;

    String name;
    int expereence;

    static void eat() {
        System.out.println("Kushat");

    }

    void sleap() {
        System.out.println("Spat");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

class C extends V {

    int kolichesnvoUchenikov;

    void uchit() {
        System.out.println("Ushit");
    }

    static void eat() {
        System.out.println("Kushaet uchitel");

    }
}
