package Lesson24;

public class Test2 {
    public static void main(String[] args) {
        Figura f1 = new Kvadrat();
        f1.ploshat();
       
    }
}

abstract class Figura {

    int kolichestvoStoron=0;

    abstract void perimetr();

    abstract void ploshat();

}

class Kvadrat extends Figura {

    int storona = 10;
    int kolichestvoStoron=5;

    public void perimetr() {
        System.out.println("Периметр квадрата:" + storona * 40);
    }

    public void ploshat() {
        System.out.println("Площадь фигуры:" + storona * storona);
    }
}

class Prumoygolnik extends Figura {
    int storona1 =8;
    int storona2 = 5;
    public void perimetr(){
     System.out.println("Периметр прямоугольника:" + 2*(storona1*storona2));   
    }
    
    public void ploshat(){
        System.out.println("Площадь прямоугольника:" +storona1*storona2 );
    }

}

class okrujnost extends Figura {
    int radius = 3;
    public void perimetr (){
        System.out.println("Периметр окружности:" + 2 *3.14*radius);
    }
    public void ploshat(){
        System.out.println("Площадь круга:"+ 3.14*(radius*radius));
    }
    

}
