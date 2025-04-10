package OOPs_Concepts;

public class Parameterised_Constructor {
    public static void main(String[] args) {
        Car1 c1 = new Car1();
        System.out.println(c1.name);
        System.out.println(c1.model);
        System.out.println(c1.year);
        System.out.println("-----------------------------");
        Car1 c2 = new Car1("tesla","xxx",2010);
        System.out.println(c2.name);
        System.out.println(c2.model);
        System.out.println(c2.year);

        System.out.println("----------------------------------");
        Car1 c3 = new Car1("wagonr", "madhvan", 2013);
        System.out.println(c3.name);
        System.out.println(c3.model);
        System.out.println(c3.year);







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
        this.name = name;
        this.model = model;
        this.year = year;
    }
}