package Homework4;

public class Student {

    int Idnumber, Yearfstudy;
    String Name, surname;
    int grademath, gradeeconmiks, gradelanguage;

    Student(int Idnumber2, String Name2, String surname2, int Yearfstudy2,int grademath2, int gradeeconmiks2, int gradelanguage2){
        Name = Name2;
        surname = surname2;
        Yearfstudy = Yearfstudy2;
        grademath = grademath2;
        gradeeconmiks = gradeeconmiks2;
        gradelanguage = gradelanguage2;
        
        

    }

    Student(int Idnumber3, String Name3, String surname3) {
        this(Idnumber3, Name3, surname3, 0,0,0,0);
    }

    Student() {
    }
}

class StudentTest {

    double sredArifmOcenka(Student st) {
        double sredOcenka = (st.grademath + st.gradeeconmiks + st.gradelanguage) / 3;
        System.out.println("Srednya ArifOcenka Studenta: " + st.Name + " " + st.surname + " " + sredOcenka);
        return sredOcenka;

    }

    public static void main(String[] args) {

        Student st1 = new Student(1, "Nikolay", "Petrov", 3,5,4,5);
       
        Student st2 = new Student(2, "Jino", "Grapskiy");
        st2.Yearfstudy = 3;
        st2.gradeeconmiks = 4;
        st2.gradelanguage = 4;
        st2.grademath = 4;

        Student st3 = new Student();
        st3.Idnumber=3;
        st3.Name = "Klink";
        st3.surname = "Niks";
        st3.Yearfstudy = 3;
        st3.gradeeconmiks = 5;
        st3.gradelanguage = 5;
        st3.grademath = 5;

        StudentTest sTest = new StudentTest();
        sTest.sredArifmOcenka(st1);
        sTest.sredArifmOcenka(st2);
        sTest.sredArifmOcenka(st3);

    }

}
