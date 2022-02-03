package Praktiks;
import java.time.*;
 abstract class Magazine {
    int cena;
    int kolichestvo;
    String tipTovara;
    Magazine(int cena,int kolichestvo,String tipTovara){
        this.cena = cena;
        this.kolichestvo = kolichestvo;
        this.tipTovara =  tipTovara;
    }
    abstract  void prodaja ()throws Exception;
}
class Tovar extends Magazine{
    Tovar(int cena,int kolichestvo,String tipTovara){
        super(cena,kolichestvo,tipTovara);
    }
    public void prodaja() throws  CenaException{
        if(cena<0){
            throw new CenaException("Цена отрицательная,пожалуйста,введите корректное значение");
        }
       else System.out.println("Товар:"+tipTovara+"-продан"+",цена товара:"+cena+",оставшееся количество товара: "+ (kolichestvo-1)  +",время и дата покупки:"+LocalDateTime.now() );
    }

}
class CenaException extends Exception{
     CenaException(String message){
         super(message);
     }
}
class TovarException extends Exception{
     TovarException(String message){
         super(message);
     }
}

class TestMagazine{
    public static void main(String[] args) {
        Tovar t1 = new Tovar(500,5,"Voda");
        try {
            t1.prodaja();
        }
        catch (CenaException c){
            System.out.println(c.getMessage());
        }
    }
}