package Praktiks;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner scy1 = new Scanner(System.in);
        int n = scy1.nextInt();
        System.out.println("Введите число:");
        Scanner scy2 = new Scanner(System.in);
        int n1 = scy2.nextInt();
        System.out.println("Введите операцию(+,-,*,/):");
        Scanner scy3 = new Scanner(System.in);
        String n3 = scy3.nextLine();
        int result;
        Summer s = (b, c) -> {
            switch (n3) {
                case "+":
                    System.out.println( (n + n1));
                break;

                case "-":
                    System.out.println(n - n1);
                    break;
                case "*":
                    System.out.println(n + n1);
                    break;
                case "/":
                    System.out.println(n / n1);
                    break;
            }

        };
        s.summer(n,n1);
    }
}

interface Summer {
    void summer(int a, int b);
}

