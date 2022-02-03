package Homework22;

public class Animal {

    int eyes;

    public Animal() {
        System.out.println("I'am animal!");
    }

    public void eat() {
        System.out.println("Animal eats");
    }

    public void drink() {
        System.out.println("Animal drinks");
    }
}

class Pet extends Animal {

    Pet() {
        System.out.println("I am pet");
        eyes = 2;
    }
    String name;
    int tail = 1;
    int paw = 4;

    public void run() {
        System.out.println("Pet runs");

    }

    public void jump() {
        System.out.println("Pet jump");
    }

}

class Dog extends Pet {

    Dog(String name) {
        this.name= name;
        System.out.println("I am dog  its my name: " + name);
    }

    public void play() {
        System.out.println("Dog play");
    }
}

class Cat extends Pet {

    Cat(String name) {
        this.name = name;
        System.out.println("I am cat ints my name: " + name);

    }

    public void sleep() {
        System.out.println("Cat sleep");
    }
}

class Test45{
    public static void main(String[] args) {
        
    
    Dog d = new Dog("Riki");
    System.out.println("Количество лап у собаки:" + d.paw);
    Cat c = new Cat("Pushistic");
    c.sleep();
    
    
}
}