
package Praktiks;

import java.util.Scanner;
public class Zadachka3 {
    public static void main(String[] args) {
        System.out.println("Введите слово: ");
        Scanner sc1 = new Scanner(System.in);
        String n = sc1.nextLine();
        System.out.print(n.toUpperCase()+n.toLowerCase());
        
    }
}
