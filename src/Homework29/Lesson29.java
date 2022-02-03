package Homework29;

import java.time.*;
import java.time.format.*;

public class Lesson29 {

    DateTimeFormatter f = DateTimeFormatter.ofPattern("YYYY,MMMM-dd!!h:mm");
    DateTimeFormatter f2 = DateTimeFormatter.ofPattern("h:mm,dd/MMM/YY");


    public void smena(LocalDateTime nachalo, LocalDateTime konec, Period p, Duration d) {
        LocalDateTime date = nachalo;
        while (date.isBefore(konec)) {
            date = date.plus(p);
            System.out.println("Работаем с:" + date.format(f));
            System.out.println("До:" + date.format(f2));
            System.out.println("Отдыхаем с:" + date.format(f2));
            date = date.plus(p);
            System.out.println("До:" + date.format(f2));

        }

    }

}

class TestLesson29 {
    public static void main(String[] args) {
        LocalDateTime nachalo = LocalDateTime.of(2016, Month.JANUARY, 1, 9, 00);
        LocalDateTime konec = LocalDateTime.of(2017, Month.FEBRUARY, 3, 9, 00);
        Period p =Period.ofMonths(1);
        Duration d = Duration.ofHours(5);
        Lesson29 l = new Lesson29();
        l.smena(nachalo,konec,p,d);
    }
}

