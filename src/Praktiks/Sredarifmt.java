package Praktiks;

import java.util.Arrays;

public class Sredarifmt {

    public static int container1;
    public static int container2;

    public static void main(String[] args) {

        int[] array1 = new int[5];
        int[] array2 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * (6));
            container1 = (container1 + array1[i]);

        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * (6));
            container2 = (container2 + array2[i]);
        }
        container1 = container1 / array1.length;
        container2 = container2 / array2.length;
        System.out.println("Сгенирированный первый массив: " + Arrays.toString(array1));
        System.out.println("Сгенерированный второй массив: " + Arrays.toString(array2));
        if(container1>container2){
            System.out.println("Среднее арифметическое первого массива больше второго, " + "Среднее арифметическое первого массива: " + container1+ "," +
                    " cреднее арифметическое второго массива: " + container2);
        }
        else if ( container1<container2 ){
           System.out.println("Среднее арифметическое первого массива меньше второго, " + "среднее арифметическое второго массива: " + container2 + "," +
           " cреднее арифметическое первого массива: " + container1);
        }
        else {
            System.out.println("Среднее арифметическое двух массивов одинаковое " + container1 + "," + " " + container2);
        }
        
    }
}
