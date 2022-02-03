package Lesson30;
import Lesson10.A;

import  java.util.ArrayList;
public class Test3 {

}
class Employee{
    String name;
    char sex;
    int age;
    Employee(String name,char sex,int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
}

class ShowEmployee{
    public void show(Employee e){
        System.out.println("Имя работника:" +e.name+",возраст работника:"+e.age);
    }

    void def(ArrayList<Employee> e,ChekEmpoyee c){
        for(Employee em:e){
            if(c.abc(em)){
                show(em);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList <Employee> list = new ArrayList<>();
        Employee s1 = new Employee("Ivan", 'm', 22);
        Employee s2 = new Employee("Vova", 'm', 21);
        Employee s3 = new Employee("Uri", 'm', 20);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        ShowEmployee sh = new ShowEmployee();
        sh.def(list,  em10-> em10.age>20);
    }
}






interface ChekEmpoyee{
    boolean abc(Employee s);
}