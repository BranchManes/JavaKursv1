package Homework17;

public class Lesson17 {

    public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
        boolean result = true;
        if (sb1.length() == sb2.length()) {
            for (int i = 0; i < sb1.length(); i++) {
                if (sb1.charAt(i) != sb2.charAt(i)) {
                    result = false;
                    break;
                }

            }
        } else {
            result = false;
        }

        return result;
    }
}

class test1 {
    public static void main(String[] args) {
        StringBuilder sb3 = new StringBuilder("good");
        StringBuilder sb4 = new StringBuilder("gooh");
        
        boolean a =Lesson17.ravenstvo(sb3, sb4);
        System.out.println(a);
    }
}
