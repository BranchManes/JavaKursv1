package Homework30;

public class Test5 {
    public static void main(String[] args) {
    Concat c =(str1,str2)->str1+str2;
        System.out.println("Result:" +c.stringConcat("World","Mars"));
    }
}


interface Concat{
    String stringConcat(String st1,String st2);
}