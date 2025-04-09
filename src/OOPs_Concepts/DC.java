package OOPs_Concepts;

public class DC {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1.name);
        System.out.println(c1.year);
        System.out.println(c1.model); //if value not assigned then Null and for integer 0
        // if value assigned through Default constructor then that will be displayed
        System.out.println("------------------------------------");
        Car c2 = new Car();
        System.out.println(c2.name);
        System.out.println(c2.year);
        System.out.println(c2.model);
        // every object will take same value if not assigned separate values

    }
}
class Car{
    String name;
    int year;
    String model;
//DC
    Car(){
        name = "unknown car";
        year = 1995;
        model = "Ascent";
    }

}