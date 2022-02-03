
package Praktiks;


public class Pelmen {
    
    static void iteraid(){
        for(int i=0;i<10;i++){
            if(i==4){
               System.out.println("Вот счастливый пельмень!");
                break;
            }
           System.out.println("Пельмень под номером: " + i);
            
        }
    }
    public static void main(String[] args) {
        Pelmen.iteraid();
    }
}
