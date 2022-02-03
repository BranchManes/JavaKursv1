package Praktiks;

public class MaxMin {

    public static void abc(int a, int b, int c) {
        if (a < b && a < c) {
            System.out.println("Наименьшее значение: " + a);
        } else if (b < a && b < c) {
            System.out.println("Наименьшее значение: " + b);
        } else {
            System.out.println(c);
        }

    }
}
class Test20{
    public static void main(String[] args) {
        
    
    MaxMin n = new MaxMin();
    n.abc(5,2,10);
}
}