package Lesson14;

public class Test6 {

    public void vremya() {
        OUTER:
        for (int chas = 0; chas <= 23; chas++) {
            INNER:
            for (int minuta = 0; minuta <= 59; minuta++) {
                System.out.println("Время: " + chas + ":" + minuta);
                if(minuta==20){
                    break INNER;
                }
            }
        }
    }

    public static void main(String[] args) {
        Test6 t6 = new Test6();
        t6.vremya();
    }

}
