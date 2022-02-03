package Praktiks;

public class Replace {

    public static void main(String[] args) {

        String[] array = new String[]{"Каждый ", " охотник ", " желает ", " знать ", " где ", " сидит ",};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println(" ");
        String temp;
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            temp = array[n - i - 1];
            array[n - i - 1] = array[i];
            array[i] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

}
