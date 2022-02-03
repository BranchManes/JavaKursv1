
package Lesson17;


public class Test1 {
    public static void main(String[] args) {
        
    
    StringBuilder sb1 = new StringBuilder();
    StringBuilder sb2 = new StringBuilder("Good day!");
    System.out.println(sb2);
    StringBuilder sb3 = new StringBuilder();
    System.out.println(sb2.length());
    System.out.println(sb2.charAt(3));
    System.out.println(sb2.indexOf("o",2));
    String s = sb2.substring(2);
    System.out.println(s);
    System.out.println(sb2.subSequence(2, 6));
   // sb2.append(50);
   // System.out.println(sb2);
  // System.out.println(sb2.insert(4, " hello "));
  System.out.println(sb2.deleteCharAt(2));
  
  StringBuilder sb4 = new StringBuilder("Hello,friend!");
  String s1 = null;
  s1= sb4.append("How are you?").substring(sb4.indexOf("f"),sb4.indexOf("!"));
  System.out.println(s1);
  
 
}
}
