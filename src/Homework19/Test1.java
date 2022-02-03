
package Homework19;


public class Test1 {
   public static int[] showMin(int [] array){
        
    int a;
    for(int i=1;i<array.length;i++){
        int min = array[i];
        int index = i;
        for (int j =1+i;j<array.length;j++){
            if(array[j]<min){
                min= array[j];
                index = j;
            }
        }
        if(i!=index){
            a=array[i];
            array[i] = min;
            array[index]=a;
        }
    }
    
  
 return array;       
}
}
 class Test{
 public static void main(String[] args) {
     int [] array1 = {5,-1,0,-5,9,-6};
    Test1.showMin(array1);
     for(int i=1;i<array1.length;i++){
         System.out.println(array1[i]);
     }
    

}
 }


