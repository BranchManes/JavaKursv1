package Lesson29;
import  java.time.*;
public class Test25 {
    public static void main(String[] args) {
     LocalDate ld1 =LocalDate.of(2020,7,25);
     LocalDate ld2 = LocalDate.of(2020,11,25);
     Period p =Period.ofMonths(1);
        TestTest.SmenaDejurnogo(ld1,ld2,p);

    }
}
class TestTest{
    public static void SmenaDejurnogo(LocalDate nachalo,LocalDate konec,Period p){
        LocalDate data = nachalo;
        while(data.isBefore(konec)){
            System.out.println("Настала дата:" +data);
            data=data.plus(p);

        }
    }
}