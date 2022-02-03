package Praktiks;

import java.util.Arrays;
import java.util.Scanner;

public class Inverting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 0;
        int container = 0;
        int[] array1 = new int[n];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * (n + 1));
        }
        int min = array1[0];
        int max = array1[0];
        System.out.println("Ваш сгенерированный массив: " + Arrays.toString(array1));

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > max) {
                max = array1[i];

            }
            if (array1[i] < min) {
                min = array1[i];
            }

        }
        System.out.println("Наибольшее число в массиве: " + max + "," + "Наименьшее число в массиве: " + min);
        for (int i = 0; i < array1.length; i++) {
            container += array1[i];
        }
        container = container / array1.length;
        System.out.println("Среднее арифметическое массива: " + container);

        for (int i = 0; i < (array1.length) / 2; i++) {
            temp = array1[array1.length - i - 1];
            array1[array1.length - i - 1] = array1[i];
            array1[i] = temp;

        }
        System.out.println("Ваш инвертированный массив: " + Arrays.toString(array1));

    }

}
