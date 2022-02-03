package Praktiks;

import java.util.Arrays;

public class ReplaceString {

    public static String[] abc(String[]... array) {
        int length = 0;
        for (String[] array2 : array) {
            length += array2.length;
        }
        int count = 0;
        String[] array3 = new String[length];
        for (String[] array2 : array) {
            for (String s : array2) {
                array3[count] = s;
                count++;

            }
        }
        return array3;
    }

    public static void main(String[] args) {
        String[] array = abc(new String []{"Privet","poka","Good day","good nigth"},new String []{"Day","nigt","morning"});
        System.out.println("Массив: " + Arrays.deepToString(array));
        int n = array.length;
        String container;
        for (int i = 0; i < n / 2; i++) {
            container = array[n - i - 1];
            array[n - i - 1] = array[i];
            array[i] = container;
        }
        System.out.println("Инвертированный массив: " + Arrays.toString(array));
    }

}
