package Homework8;

public class Zadanie2 {

    static final double pi = 3.14;


    public double Plosadkruga(double radius1) {

      
        double result = pi * radius1 * radius1;
        return result;
    }

    public static double Dlinaokr(double radius2) {
      
        double result1 = 2 * pi * radius2;
        return result1;

    }

    public void Info(double radius3) {

        System.out.println("Радиус: " + radius3  + ", Площадь круга: " +Plosadkruga(radius3) + " Длина окружности: " + Dlinaokr(radius3));
    }
}

 class TestZadanie2 {
 public static void main(String[] args) {
    
    Zadanie2 z1 = new Zadanie2();
    z1.Info(5);
    
 
}
}