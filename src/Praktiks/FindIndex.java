package Praktiks;

import java.util.Arrays;
import java.util.Scanner;

public class FindIndex {

    public static int abc(int[] array, int c) {
        int i = 0;
        while (i < array.length) {

            if (array[i] == c) {

                return i;

            } else {
                i += 1;
            }

        }
        return -1;

    }
}

class Test50 {

    public static void main(String[] args) {
        int[] array1 = {1, 5, 6, 8};
        System.out.println("Индекс элемента: " + FindIndex.abc(array1, 10));
    }
}
