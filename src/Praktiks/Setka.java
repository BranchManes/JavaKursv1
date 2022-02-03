
package Praktiks;

import java.util.Arrays;
public class Setka {
    public static void main(String[] args) {
        char [] [] array1 =new char [10][10];
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                array1[i][j]= '-';
            }
        }
        for(int i=0;i<array1.length;i++){
            System.out.println(array1[i]);
        }
    }
    
}
