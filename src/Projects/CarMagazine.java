package Projects;

import java.time.*;
import java.util.ArrayList;
import java.util.function.Predicate;

public class CarMagazine {
}

class Car {
    String model;
    String color;
    double price;

    Car(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    void buy() {
    };



    public void carCompare(ArrayList<Car> auto, Predicate<Car> pr) {
        for (Car car : auto) {
            if (pr.test(car)) {

            }
        }
    }
}

class Ferrary extends Car {
    Ferrary(String model, String color, double price) {
        super(model, color, price);
    }

    public void buy() {
        System.out.println("You bought a ferrari" + ",model:" + model + ",color:" + color + "." +
                "Время покупки:" + LocalTime.of(16, 50));
    }
}

class BMW extends Car {
    BMW(String model, String color, double price) {
        super(model, color, price);
    }

    public void buy() {
        System.out.println("You bought a bmw" + ", model" + model + ", color" + color + "." +
                "Время покупки:" + LocalTime.of(17, 37));
    }
}

class Mercedes extends Car {
    Mercedes(String model, String color, double price) {
        super(model, color, price);
    }

    public void buy() {
        System.out.println("You bought a mercedes" + ", model" + model + ", color" + color + "." +
                "Время покупки" + LocalTime.of(19, 56));
    }
}

class CarMagazineTest {
    public static void main(String[] args) {
        ArrayList<Car> car = new ArrayList<>();
        Car a = new Car("Car", "Car", 0);
        Car a1 = new Ferrary("F10", "White", 50000);
        Car a2 = new BMW("M5", "blu", 35000);
        Car a3 = new Mercedes("S", "grey", 37000);
        car.add(a1);
        car.add(a2);
        car.add(a3);
        a.carCompare(car, rac -> {
            if (rac.price > 35000) {
                System.out.println("Car is very expensive"+", model:"+rac.model);
            }
            return false;
        });


    }
}