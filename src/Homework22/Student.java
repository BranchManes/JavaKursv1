package Homework22;

public class Student {

    private StringBuilder name;
    private int course;
    private int grade;

    public StringBuilder getName() {;
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }

    public void setName(StringBuilder s) {
        if (s.length() <= 3) {
            name = s;
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int c) {
        if (c>=1 && c <= 5) {
            course = c;
        }
    }

    public int getGrade() {

        return grade;
    }

    public void setGrade(int g) {
        if (g>=1&&g <= 11) {
            grade = g;
        }
    }
    public void showInfo(){
        System.out.println("Имя студента:" + getName() + ",курс студента:" + getCourse() + ",его оценка:" + getGrade());
    }
}

class TestStudent{
    public static void main(String[] args) {
        
    
 Student s = new Student();
 s.setName(new StringBuilder("Jak"));
 s.setCourse(5);
 s.setGrade(10);
 s.showInfo();
 
}
}