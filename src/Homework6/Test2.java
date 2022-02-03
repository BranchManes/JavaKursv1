package Homework6;

public class Test2 {

    int sum() {
        int result = 0;
        return result;

    }

    int sum(int a) {
        return a;
    }

    int sum(int a1, int b1) {

        return a1 + b1;

    }

    int sum(int a2, int b2, int c2) {

        return a2 + b2 + c2;
    }

    int sum(int a3, int b3, int c3, int d3) {

        return a3 + b3 + c3 + d3;

    }

}

class Test3 {

    public static void main(String[] args) {

        Test2 result = new Test2();
        System.out.println("Сумма чисел = " + result.sum());
        System.out.println("Сумма чисел = " + result.sum(1));
        System.out.println("Сумма чисел = " + result.sum(2,5));
        System.out.println("Сумма чисел = " + result.sum(3,5,6));
        System.out.println("Сумма чисел = " + result.sum(5,5,7,3));
                
    }

}
