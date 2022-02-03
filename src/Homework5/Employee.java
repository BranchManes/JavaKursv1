package Homework5;

public class Employee {

    Employee() {
        id = 1;
        surname = "Nikola";
        age = 35;
        salary = 500;
        department = "math";
    }

    int id;
    String surname;
    int age;
    double salary;
    String department;

    double popolnenieScheta(double popolnenie) {
        salary = 2 * popolnenie;
        return salary;

    }

}

class EmployeeTest {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        System.out.println("Фамилия работника: " + e1.surname + " ,отделение работника : " + e1.department + " ,возраст " + e1.age + " ,зарплата " + e1.popolnenieScheta(500) );

    }

}
