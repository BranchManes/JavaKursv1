
package Lesson5;


public class Car2 {
    
    String color;
    String engine;
    int speed;
    
    int gas(int skorost){
        speed += skorost;
        return speed;
        
       } 
        
     int tormoz(int skorost){
        speed -= skorost;
        return speed;
     } 
     String modele(String cvet){
         color = cvet;
         return color;
     }
    
     
    
   
    void ShowInfo(){
        System.out.println("Cvet: "+ color +",motor " + engine + " ,skorost: " +speed );
        
    } 
}
     
     
  class Car2Test{
      
          public static void main(String[] args){
              
              Car2 c1= new Car2();
              c1.color = "Blu";
              c1.engine ="V6";
              c1.speed = 60;
              c1.gas(60);
              c1.ShowInfo();
              c1.modele("pink");
              c1.ShowInfo();
              
              
          }     
     
}

