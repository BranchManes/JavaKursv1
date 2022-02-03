package Homework13;

public class Mounth {

    static void metod1(int number) {
        switch (number) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("В этом месяце 31 день");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("В этом месяце 30 день");
                break;
            case 2:
                System.out.println("В этом месяце 28 день");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }

    }

}

class Teast {

    public static void main(String[] args) {
        Mounth.metod1(2);
    }
}
