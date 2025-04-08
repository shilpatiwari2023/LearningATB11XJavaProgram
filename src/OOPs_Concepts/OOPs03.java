package OOPs_Concepts;

public class OOPs03 {
    public static void main(String[] args) {
         Student s1 = new Student();
         //Student = class
        //s1 = object reference variable
        // new Student() = Object creation
        System.out.println(s1.Sleep());

    }
}

class Student{
    String name;
    int age;

    String Sleep(){
        return "I am sleeping";
    }
}