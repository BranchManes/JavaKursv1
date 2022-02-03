package Homework31;
import java.util.ArrayList;
import java.util.List;
public class Methods {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("cat");
        list.add("dog");
        list.add("milk");
        list.forEach(s -> System.out.println(s));
        System.out.println("--------------------");
        list.remove(0);
        list.forEach(s-> System.out.println(s));
        }
    }

