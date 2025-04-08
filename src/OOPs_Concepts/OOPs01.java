package OOPs_Concepts;

public class OOPs01 {
    public static void main(String[] args) {
       Person p1;
       Person p2 = new Person();
        System.out.println(p2.name = "Lucky");
        Person p3 = new Person();
        p3.name = "Pramod";
        System.out.println(p3.name);
    }
}
class Person{
    //Attribute/properties/ instance variables/data member
    String name;
    String phone;
    String color_eyes;
    int legs;
    double salary;
    byte age;
    double weight;
    boolean isMale;

    //Method/function/behaviour
    void sleep(){
        System.out.println("I am sleeping");
    }

    String greet(String name){
        return "Hello " + name;
    }
    void talk(){
        System.out.println("talking");
    }
    int remaining_salary(int salary,int tax){
        return salary-tax;
    }
}