package OOPs_Concepts;

public class Parameterised_Constructor {
    public static void main(String[] args) {
        Car1 c1 = new Car1();
        System.out.println(c1.name);
        System.out.println(c1.model);
        System.out.println(c1.year);



    }


}
class Car1{
    String name;
    String model;
    int year;
    // DC
    Car1(){
        name = "unknown";
        year = 1990;
        model = "Ascent";
    }
    Car1(String name,String model, int year){
        this.name = "tesla";
        this.model = "XXX";
        this.year = 2000;
    }
}