
package Praktiks;

import java.util.Arrays;
import java.util.Scanner;
public class Praktika {
    public static double s;
    public static void main(String[] args) {
        System.out.println("Введите, пжалуйста, целое число: ");
        Scanner scan = new Scanner(System.in);
        int container = scan.nextInt();
        double [] array = new double [container];
        for(int i=0;i<array.length;i++){
            array[i]=Math.random();
        }
        System.out.println("Ваш сгенерированный массив: " + Arrays.toString(array));
        double max = array[0];
        double min = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]> max){
                max=array[i];
          }
            if (array[i]<min){
                min=array[i];
                
            }
          s = s+ array[i]; 
        }
        s = s/array.length;
         System.out.println("Максимальное число в массиве: " + max + ", " + "минимальное число в массиве: " + min + ", " + 
                 "Среднее значение массива: " + s);
    } 
    
    
    
}
