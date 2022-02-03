
package Praktiks;


public class Kratnost {
    public static void main(String[] args) {
        
    int k=0;
    int [] array = new int  [8];
    for(int i=0; i<array.length;i++){
        array[i]=k;
        k++;
        System.out.print(array[i] + " ");
        if(array[i]%2!=0){
            array[i]=0;
        }
    }
    System.out.print(" ");
     for(int i=0; i<array.length;i++){
         System.out.print(array[i]+ " ");
     }
}
}
