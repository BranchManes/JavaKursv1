package Praktiks;

import java.util.Scanner;

public class Zadachka {

    public static void main(String[] args) {
        int container1;
        int container2;
        System.out.println("Введите два числа: ");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        container1 = sc1.nextInt();
        container2 = sc2.nextInt();
        System.out.println("Вы ввели, " + "первое число: " + container1 + " второе число: " + container2);
        if (container1 > container2) {
            System.out.println("Первое число больше второго");
        } else if (container1 < container2) {
            System.out.println("Первое число меньше второго");
        } else {
            System.out.println("Числа равны");
        }
    }
}
