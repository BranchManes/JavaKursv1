package Lesson20;

import java.util.ArrayList;

public class Test2 {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("poka");
        list1.add("ok");
        list1.add("privet");
        list1.add(1, "Hello");
        for (String s : list1) {
            System.out.print(s + " ");
        }
        System.out.println(" ");
        System.out.println("Элемент находящийся на введеном вашем индексе: " + list1.get(1));
        list1.set(2, "Good nigth");
        for (String s : list1) {
            System.out.print(s + " ");
        }
        System.out.println(" ");
        //   list1.remove(3);
        //   for (String s : list1) {
        //     System.out.print(s + " ");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Day");
        list2.add("nigth");
        list1.addAll(list2);
        for (String s : list1) {
            System.out.print(s + " ");
        }
        System.out.println(" ");
       System.out.println(list1.indexOf("Day"));
        
        }
    }

