package Praktiks;

import java.util.Arrays;

public class Maximum {

    public static void main(String[] args) {

        int[][] array = new int[5][8];
        int max = array[0][0];
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 198) - 99;
            }
            System.out.println(Arrays.toString(array[i]));
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];

                }

            }

        }
        System.out.println("Наибольшее число в массиве: " + max + ", ");

    }
}
