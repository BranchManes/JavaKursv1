
package Lesson6;

public class MetodOverLoading {
    
    void Show(int i1){
        System.out.println(i1);
        
       
    }
    
    void Show(boolean b1){
    System.out.println(b1);
    }
}

class MetodOverLoadingTest {
    
    public static void main(String[] args) {
        
        MetodOverLoading m0 =  new MetodOverLoading();
        int  a=500;
        m0.Show(a);
        boolean b = true;
        m0.Show(b);
        
    }





}