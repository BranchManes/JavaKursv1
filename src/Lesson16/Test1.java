package Lesson16;

public class Test1 {

    public static void main(String[] args) {

        String s1 = new String("privet");
        int a = s1.length();
        System.out.println(a);
        char c1 = s1.charAt(3);
        System.out.println(c1);
        int i1 = s1.indexOf("t");
        System.out.println(i1);
        String s2 = new String("Jimi");
        String s3 = s2.replace('J', 'Z');
        System.out.println(s3);
        String s5 = "Privet ";
        String s6 = "Poka";
        System.out.println(s5.concat(s6));
        String s7 = new String("ZHJKJDF");
        String s8 = s7.toLowerCase();
        System.out.println(s8);
        String s9 = new String("zdsfsdfsd");
        String s10 = s9.toUpperCase();
        System.out.println(s10);

    }
}
