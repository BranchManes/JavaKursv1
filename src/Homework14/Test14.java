package Homework14;

public class Test14 {

    
  public  static void chas() {
      OUTER:
        for (int chas = 0; chas <= 6; chas++) {
            MIDDLE:
            for (int minuta = 0; minuta <= 60; minuta++) {
                if(chas>1 && minuta%10==0){
                    break;
                }
                INNER:
                for (int secunda = 0; secunda <= 60; secunda++) {
                    System.out.println("Время: " + chas + ":" + minuta + ":" + secunda);
                    if (secunda*chas>minuta){
                        continue;
                    }
                }
            }
        }
    }

public static void main(String[] args) {
    Test14.chas ();
}
}

