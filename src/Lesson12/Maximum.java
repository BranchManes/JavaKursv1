
package Lesson12;


public class Maximum {
    
    void maximumn(int i1, int i2, int i3){
        if (i1>i2 && i1>i3){
            System.out.println("Maximum:" + i1);
        }
        else if (i2>i1 && i2>i3){
            System.out.println("Maximum: " + i2);
        }
        else {
            System.out.println("Maximum:" + i3);
        }
    }
    
}
class maximumTest{
public static void main(String[] args) {
Maximum m1 = new Maximum ();
m1.maximumn(5, 20, 35);
}
}
