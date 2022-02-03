package Lesson22;

public class Chelovek {

    private int vozrast;
    final String pol;
    private String name;
    private int ves;

    Chelovek(String pol) {
        this.pol = pol;
    }

    public String getName() {
        return name;
    }

    public void setName(String s) {
        name = s;
    }

    public int getVozrast() {
        return vozrast;
    }

    public void setVozrast(int v) {
        if (v > 0) {
            vozrast = v;
        }
    }

    public int getVes() {
        return ves;
    }

    public void setVes(int v2) {
        if (v2 > 0) {
            ves = v2;
        }
    }
}

class Test45 {

    public static void main(String[] args) {
        Chelovek c = new Chelovek("male");
        c.setName("Jakeb");
        c.setVozrast(50);
        c.setVes(-60);
        System.out.println("Имя: " + c.getName() + " ,возраст " + c.getVozrast() + " ,вес: " + c.getVes());

    }
}
