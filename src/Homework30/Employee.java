package Homework30;

import java.util.ArrayList;
import java.util.function.*;

public class Employee {
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

class TestEmployee {
    public void printEmployee(Employee e) {
        System.out.println("Имя работника:" + e.name + ",отделение работника" + e.department +
                ",зарплата работника:" + e.salary);
    }

    void filtracyaRabotnikov(ArrayList<Employee> el, Predicate<Employee> pr) {
        for (Employee es : el) {
            if (pr.test(es)) {
                printEmployee(es);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        Employee s1 = new Employee("Ivan", "IT", 500);
        Employee s2 = new Employee("Vova", "Vova", 350);
        Employee s3 = new Employee("Elena", "Desin", 700);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        TestEmployee t = new TestEmployee();
        t.filtracyaRabotnikov(list, eloy -> eloy.department.equals("IT") && eloy.salary > 200);
        System.out.println("-----------------------------------------------------------------");
        t.filtracyaRabotnikov(list, eloy -> eloy.name.startsWith("E") && eloy.salary != 450);
        System.out.println("--------------------------------------------------------------------");
        t.filtracyaRabotnikov(list, eloy -> eloy.name.equals(eloy.department));
    }


}
