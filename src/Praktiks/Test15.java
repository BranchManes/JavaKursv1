
package Praktiks;

import java.util.Scanner;
import java.util.Arrays;
public class Test15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number=0;
        number = scan.nextInt();
        String [] array = new String [number];
        for(int i=0;i<array.length;i++){
            array[i] = "Hello";
        }
        System.out.println(Arrays.toString(array));
    }
    
}
