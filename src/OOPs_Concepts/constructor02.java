package OOPs_Concepts;

public class constructor02 {
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        Person1 p2 = new Person1("Shilpa", "Mumbai", 452155555);
        System.out.println(p2.name);
        System.out.println(p2.address);
        System.out.println(p2.phone);
        System.out.println("--------------------------------");
        Person1 p3 =new Person1("Sumit", "Kanpur");
        System.out.println(p3.name);
        System.out.println(p3.address);


    }
}
class Person1{
    String name;
    String address;
    long phone;
   Person1(){
       System.out.println("Default constructor");
   }
   Person1(String name_arg, String address_arg, long phone_arg){
       this.name = name_arg;
       this.address = address_arg;
       this.phone = phone_arg;
   }
   //constructor overloading - constructor with lesser number of parameter
    Person1(String name_arg, String address_arg){
       this.name = name_arg;
       this.address = address_arg;
    }
}
