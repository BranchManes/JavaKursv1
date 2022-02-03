package Homework8;

public class Test1 {

    static int Proizvd(int a, int b, int c) {

        return a * b * c;
    }

    static void Delenie(double a, double b) {

        System.out.println("Результат деления чисел: " + (a / b) + " остаток: " + (a % b));
    }
}

class Otvet {

    public static void main(String[] args) {
        
        System.out.println(Test1.Proizvd(1, 5, 10));
        Test1.Delenie(10, 20);

    }

}
