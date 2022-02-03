package Lesson20;

import java.util.ArrayList;

public class Test3 {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList();
        list1.add("poka");
        list1.add("ok");
        list1.add("privet");
        list1.add(1, "Hello");
        for (String s : list1) {
            System.out.print(s + " ");
        }
        System.out.println(" ");
        System.out.println(list1.indexOf("privet"));
    }
}
