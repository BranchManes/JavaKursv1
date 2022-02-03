package Praktiks;

import java.util.Arrays;
import java.util.Scanner;

public class SubMassiv {

    public static void main(String[] args) {
        System.out.print("Введите целое число больше трех: ");
        Scanner scan = new Scanner(System.in);
        int number = 0;
        while (number <= 3) {
            if (scan.hasNextInt()) {
                number = scan.nextInt();
                if (number <= 3) {
                    System.out.println("Ошибка! Вы ввели число меньше трех. Пожалуйста, введите число больше трех ");
                }
            }

        }

        int[] array = new int[number];
        int evenNums = 0; // переменная для хранения четных чисел
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (number + 1));
            if (array[i] % 2 == 0) {
                evenNums++;
            }
        }
        System.out.println("Ваш сгенерированный массив: " + Arrays.toString(array));
        int[] array2 = new int[evenNums];
        int index = 0; // переменная хранит текущий индекс элементов второго массива
        for (int i = 0; i < number; i++) {
            if (array[i] % 2 == 0) {
                array2[index] = array[i];
                index++; 
            }
        }
        System.out.println("Ваш новый сгенерированный массив: " + Arrays.toString(array2));
    }

}
