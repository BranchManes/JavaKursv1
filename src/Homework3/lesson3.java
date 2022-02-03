
package Homework3;
public class lesson3 {
    public static void main(String[] args) {
       int i1 =5;
       int i2 =11;
       double d1 =5.5;
       double d2 = 1.3;
       long l =20L;
       double result =0;
       result =i2/d1+d2%i1-l;
       System.out.println(result);
       
       int a =5, b=8;
       int c = a-- - --a+ ++a+a++ +a;
       int z = ++b- b++ + ++b- --b;
       System.out.println(c);
       System.out.println(z);
       
       boolean V = true;
       boolean N = false;
       System.out.println("X = " + (V&N));
       
       System.out.println("B = "+ (false & true));
       
       
    }
}
