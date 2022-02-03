
package Praktiks;

import java.util.Arrays;
public class Test10 {
    public static void main(String[] args) {
        int [] array = new int [20];
        for(int i=0;i<array.length;i++){
            if(i<2){
                array[i]=1;
            }
            else {
                array[i]= array[i-2]+array[i-1];
            }
        }
        System.out.println(Arrays.toString(array));
    }
    
}
