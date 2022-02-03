
package Praktiks;


public class Vino {
    String name;
    String tredemark;
    String contry;
   
    
    public String name(String name){
        this.name= name;
        return name;
    }
    public String tredemark(String tredemark){
        this.tredemark = tredemark;
        return tredemark;
    }
    public String contry (String country){
        this.contry = country;
        return country;
    }
}

class Test35{
    public static void main(String[] args) {
        
    
    Vino v1 = new Vino();
    v1.name("Bruno Visconti");
    v1.tredemark("JOJI");
    v1.contry("Italia");
    
    System.out.println(v1.name + " "+ v1.contry + " " + v1.tredemark );
}
}