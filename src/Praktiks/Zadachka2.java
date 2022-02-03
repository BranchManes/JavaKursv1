package Praktiks;

import java.util.Scanner;
import java.util.Arrays;

public class Zadachka2 {

    public static int container;

    public static int averedge(int[] array) {
        for (int i = 0; i < array.length; i++) {
            container = container + array[i];

        }
        container = container / array.length;
        return container;

    }
}

class Test60 {

    public static void main(String[] args) {

        int[] array1 = new int[20];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Пожалуйста,ведите число: ");
            Scanner sc1 = new Scanner(System.in);
            int n = sc1.nextInt();
            array1[i] = n;
            if (array1[i] == -1) {
                break;
            }
        }
        System.out.println("Ваш массив: " + Arrays.toString(array1));

        System.out.println(Zadachka2.averedge(array1));
    }
}
