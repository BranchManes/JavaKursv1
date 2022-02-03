package Praktiks;
import  java.util.Arrays;
import java.util.Scanner;
public class Massiv {
    public static void main(String[] args) {

        int[] array = new int[10];
        for (int i = 0; i < array.length;i++){
            array[i] = (int)(Math.random()*51);

        }
        System.out.println(Arrays.toString(array));
        System.out.println("Пожалуйста, введите число:");
        Scanner scy = new Scanner(System.in);
        int n = scy.nextInt();
        for(int i=0;i<array.length;i++){
            if(n==array[i]){
                System.out.println("Найденное число:"+array[i]);

            }


        }
    }
}