package Homework11;

public class Lesson11 {

}

class Car {

    public String color;
    public String engine;
    public int nfd;

    public Car(String color, String engine, int nfd) {
        this.color = color;
        this.engine = engine;
        this.nfd = nfd;

    }
}

class CarTest {

    int returnNfd(Car c, int nfd1) {
        return c.nfd = nfd1;
    }

    public static void main(String[] args) {

        CarTest c1 = new CarTest();
        Car car1 = new Car("Blu", "V8", 8);
        Car car2 = new Car("Red", "V6", 6);
        System.out.println("Количество дверей машины " + car1.nfd );
        System.out.println("Количество дверей машины после замены: " + c1.returnNfd(car1, 5) );

    }
}
