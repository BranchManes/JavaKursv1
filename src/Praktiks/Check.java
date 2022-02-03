package Praktiks;

import java.util.Arrays;

public class Check {

    public static void main(String[] args) {
        int[] array1 = {1, 5, 6, 6, 9,7,8,8};
        int n=array1.length;
        for (int i = 1; i < array1.length; i++) {
            if (array1[i] == array1[i - 1]) {
                System.out.println("Элементы совпадают");

            }

        }
        for(int i=2;i<array1.length;i++){
            if(array1[i]==array1[i-2]){;
            System.out.println("Есть совпадения через один элемент");
        }
    }
}
}
