package Homework10.p4;

import Homework10.p1.A;
import Homework10.p1.p2.B;
import Homework10.p1.p2.p3.*;
import Homework10.p4.p5.E;
import static Homework10.p1.p2.B.*;

public class D {

    public static void main(String[] args) {
        A a1 = new A(300, "V8");
        System.out.println("Скорость машины: " + a1.speed + " Двигатель: " + a1.Engine);
        System.out.println(B.Sum(1, 2));

        C c1 = new C();
        System.out.println(c1.c);
        
        E e1 = new E();
        System.out.println(e1.v);
        

    }

}
