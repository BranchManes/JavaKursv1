package Praktiks.newpraktis;

public class Employee {

    private String name;
    private String lastname;
    private double mounthsalary;

    Employee(String name, String lastname, double mounthsalary) {
        if (name != null) {
            this.name = name;
        } else {
            this.name = "Ошибка!";
        }
        if (lastname != null) {
            this.lastname = lastname;
        } else {
            this.lastname = "Ошибка!";
        }
        if (mounthsalary > 0) {
            this.mounthsalary = mounthsalary;
        } else {
            this.mounthsalary = 0.0;
        }
    }

    public String getName() {
        return name;
    }

    public String getlastneme() {
        return lastname;
    }

    public double getMounthsalary() {
        return mounthsalary;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            this.name = "Ошибка!";
        }

    }

    public void setLastname(String lastname) {
        if (lastname != null) {
            this.lastname = lastname;
        } else {
            this.lastname = "Ошибка!";
        }

    }

    public void setSalary(double mounthsalary) {
        if (mounthsalary > 0) {
            this.mounthsalary = mounthsalary;
        } else {
            this.mounthsalary = 0.0;
        }
    }

    public double getEearsSalary() {
        return mounthsalary * 12;
    }

    public double getEyers() {
        double b = (mounthsalary * 12 / 100) * 10;
        b = (mounthsalary * 12) + b;
        return b;
    }

}

class EmployeeTest {

    public static void main(String[] args) {
        Employee e1 = new Employee("Jacob", "Tenzor", 200);
        Employee e2 = new Employee("Janison", "Klerk", 500);
        System.out.println("Имя работника:" + e1.getName() + ",фамилия работника:" + e1.getlastneme() + ",зарплата работника:" + e1.getMounthsalary());
        System.out.println("Годовая зарплата:" + e1.getEearsSalary());
        System.out.println("Повышенная годовая зарплата работника:" + e1.getEyers());
        System.out.println("Имя работнки:" + e2.getName() + ",фамилия работника" + e2.getlastneme() + ",зарплата работника:" + e2.getMounthsalary());
        System.out.println("Годовая зарплата:" + e2.getEearsSalary());
        System.out.println("Повышенная годовая зарплата работника:" + e2.getEyers());
    }
}
