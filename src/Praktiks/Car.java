package Praktiks;

public class Car {

    private int speed;
    private double regularPrice;
    private String color;

    Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public double getSalePrice() {
        return regularPrice;
    }

}

class Truck extends Car {

    int weigth;

    Truck(int speed, double regularPrice, String color, int weigth) {
        super(speed, regularPrice, color);
        this.weigth = weigth;
    }

    public double getSalePrice() {
        if (weigth > 2000) {
            return super.getSalePrice() - (0.1 * super.getSalePrice());
        } else {
            return getSalePrice();
        }
    }

}

class Ford extends Car {

    int year;
    double manufacturingDiscount;

    Ford(int speed, double regularPrice, String color, int year, double manufacturingDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturingDiscount = manufacturingDiscount;
    }

    public double getSalePrice() {
        return (super.getSalePrice() - manufacturingDiscount);
    }
}

class Sedan extends Car {

    int length;

    Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;

    }

    public double getSalePrice() {
        if (length > 20) {
            return super.getSalePrice() - (0.05 * super.getSalePrice());

        } else {
            return super.getSalePrice() - (0.1 * super.getSalePrice());
        }
    }
}

class CarTest {

    public static void main(String[] args) {
        Sedan s = new Sedan(50, 2500, "Blue", 4);
        Ford f1 = new Ford(90, 5000, "Black", 1950, 3600);
        Ford f2 = new Ford(110, 9000, "Black", 2000, 7500);
        Car c1 = new Car(65, 2200, "White");

        System.out.println(s.getSalePrice());
        System.out.println(f1.getSalePrice());
        System.out.println(f2.getSalePrice());
        System.out.println(c1.getSalePrice());
    }
}
