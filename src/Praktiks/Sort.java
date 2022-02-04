package Praktiks;
import java.util.ArrayList;
import java.util.Arrays;
public class Sort {
    public  void   sortList(ArrayList <String> list,SortArrays sa){
        list.forEach(s->{
           if( sa.sort(s)){
               System.out.println(s);
           };
        });
    }
}



interface  SortArrays{
    boolean sort(String s);
}
class SortTest{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        Sort s = new Sort();
        s.sortList(list, sy-> sy.equals("a"));
    }
}