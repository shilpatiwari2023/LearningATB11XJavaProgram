package OOPs_Concepts;

public class Constructor01 {
    public static void main(String[] args) {
        Baby b1 = new Baby();

    }
}
class Baby{
    String name;

    void sleep(){
        System.out.println("Sleeping");
    }

    void eat(){
        System.out.println("eating");
    }

    void cry(){
        System.out.println("Crying");
    }
    Baby(){
        System.out.println("I am default constructor, called with object creation");
    }
}
