package Lesson18;

import java.util.Arrays;

public class Test3 {

    public static void main(String[] args) {
        int array[] = {1, 5, 6, 7, 8, 6, 5, 8};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println(" ");
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }

    }
}
