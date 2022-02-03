
package Praktiks;
import java.util.Arrays;
import java.util.Scanner;
public class Search {
  public static  Scanner sc = new Scanner (System.in);
    public static int n =sc.nextInt();
    public static boolean toSearch (int []array ){
        for(int b:array){
            if(b==n){
                System.out.println(" ");
                System.out.println("Введеное число совпало с элементом массива");
                
                return true;
                
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int [] array1 = new int [n];
        for(int i = 0;i<array1.length;i++){
            array1[i]= (int)(Math.random()*(n+1));
        }
        System.out.print("Ваш сгенированный массив: " + Arrays.toString(array1) );
        Search.toSearch(array1);
    } 
    
}
