package Praktiks;

public class Fabinachi {

    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 1;
        int result = num1 + num2;
        System.out.println(num1 + " " + num2 + " ");
        while(result<150){
            num1=num2;
            num2=result;
            result= num1+num2;
            System.out.println(result);
            
        }

    }
}
