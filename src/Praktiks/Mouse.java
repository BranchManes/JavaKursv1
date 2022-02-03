package Praktiks;

public class Mouse {

    public static void main(String[] args) {
        int[][] array = new int[3][3];
        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = k;
                k++;

            }

        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}
