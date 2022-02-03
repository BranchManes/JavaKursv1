
package Praktiks;
import java.util.Scanner;
import java.util.Arrays;

public class Search2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        int [] array1 = new int[n];
        for(int i=0; i<array1.length;i++){
            array1[i] =(int)(Math.random()*(n+1));
        }
        System.out.print("Ваш сгенерированный массив: " + Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Ваш отсартированный массив: " + Arrays.toString(array1));
       System.out.println("Введенное число совпадает с элементом массива: " +  Arrays.binarySearch(array1,n));
    }
    
}
