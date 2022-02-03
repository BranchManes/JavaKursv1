package Praktiks;
import  java.util.Arrays;
import  java.util.Scanner;
public class Reserve {
    public void filling(int [] array){
        int n;
        int v;
        for(int i=0;i<array.length;i++){
            System.out.println("Введите число:");
            Scanner sc = new Scanner(System.in);
            n=sc.nextInt();
            array[i]=n;
        }
        System.out.println("массив:" + Arrays.toString(array));
        System.out.println("Введите число:");
        Scanner vs = new Scanner(System.in);
        v=vs.nextInt();
        Arrays.sort(array);
        System.out.println("Элемент находится на:"+Arrays.binarySearch(array,v)+" индексе");
    }

}



class ReserveTest{
    public static void main(String[] args) {
        Reserve r = new Reserve();
        int [] array = new int[10];
        r.filling(array);
    }
}
