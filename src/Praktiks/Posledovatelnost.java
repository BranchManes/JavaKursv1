package Praktiks;

import java.util.Arrays;

public class Posledovatelnost {

    public static void main(String[] args) {

        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (89 + 1) + 10);
            System.out.print(Arrays.toString(array));

        }
        boolean flag = true;
        System.out.println(" ");
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1] ){
                flag = false;
                break;
            
            }
        }
        if(flag){
            System.out.println("Последовательность возрастающая");
           
        }
        else{
            System.out.println("Последовательность убывающая");
        }
    }
}
