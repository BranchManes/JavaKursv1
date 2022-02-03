package Homework31;

import java.util.ArrayList;

public class Djeneriks {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(60);
        list.add(70);
        int a = getMethods.getSecondElement(list);
        System.out.println(a);
        Info <String> t = new Info<>("Pingvinius");
        System.out.println(t);
    }
}

class getMethods {
    public static <T> T getSecondElement(ArrayList<T> t) {
        return t.get(1);
    }
}

class  Info <T>{
    private T Person;
    public Info(T person){
        this.Person = person;
    }

    @Override
    public String toString() {
        return "Info{" +
                "Person=" + Person +
                '}';
    }
}