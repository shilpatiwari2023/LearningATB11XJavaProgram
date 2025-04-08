package OOPs_Concepts;

public class OOPs04 {
    public static void main(String[] args) {
     Cat c = new Cat();
     c.running();

    }
}

class Cat{
    String name;
    void running() {
        System.out.println("Running");
    }
}