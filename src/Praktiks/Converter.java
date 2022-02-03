package Praktiks;
import  java.util.Scanner;
public class Converter {
    public static void main(String[] args) {
        Scanner syc = new Scanner(System.in);
        System.out.println("Выберите операцию преобразования:F->C(1)/C->F!(2)");
        String n = syc.nextLine();

        Scanner syc2 = new Scanner(System.in);
        double result;
        int n2 = syc2.nextInt();
        System.out.println("Введите число");
        switch (n){
            case "1":
                result=n2-32/1.8;
                System.out.println("С:"+result);
                break;


        }
    }


}
