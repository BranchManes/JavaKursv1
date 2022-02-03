
package Praktiks;


public class Perimetr {
    
   
    
    double Perimetr(double length, double width){
        double perimetr =2*(length*width);
      return perimetr;
    }
    
}

class Test1{
    public static void main(String[] args) {
        Perimetr p1 = new Perimetr();
        System.out.println(p1.Perimetr(2.5, 5));
    }
}
