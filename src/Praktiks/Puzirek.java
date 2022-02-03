
package Praktiks;

import java.util.Arrays;
public class Puzirek {
    public static void main(String[] args) {
        int [] array1 = {1,2,10,5,11,20,35,7,37};
        System.out.println("Массив перед сортировкой: " + Arrays.toString(array1));
        int container;
        boolean flag = true;
        while(flag){
            flag = false;
        for(int i=0;i<array1.length-1;i++){
            if(array1[i]>array1[i+1]){
                container = array1[i];
                array1[i]= array1[i+1];
                array1[i+1]=container;
                flag = true;
            }
        }
    }
        System.out.println("Массив после сортировки: " + Arrays.toString(array1));
}
}