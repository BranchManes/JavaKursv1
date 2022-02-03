package Lesson9;

public class Car {

    String color;
    String engine;
    static int count;

    public Car(String color2, String engine2) {
        count++;
        color = color2;
        engine = engine2;
    }

    public void showColor() {

        System.out.println("Цвет машины " + color);
    }

    public void changecolor(String color3) {
        System.out.println("Цвет машины изменился");
        int cena = 5000;
        Car c2 = new Car("Blu", "V10");
        color = color3;
        cena += 1000;
    }

}
