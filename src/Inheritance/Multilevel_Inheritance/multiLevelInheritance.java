package Inheritance.Multilevel_Inheritance;

public class multiLevelInheritance {
    public static void main(String[] args) {
        Son s = new Son();
        s.f();
        s.gf();
        s.son();
        System.out.println("------------------------------");
        grandFather gf = new grandFather();
        gf.gf();
        System.out.println("-------------------------------");
        father f1 = new father();
        f1.f();
        f1.gf();

        //when grandfather was taking birth father and son can't be present so
        // Son s1 = new grandFather();
        //father f2 = new grandFather();
        // but grandfather will be present with father and son birth and father will be present
        //with son birth so
        System.out.println("-----------------------------");
        grandFather gf1 = new father();//this concept is called as dynamic dispatch
        gf1.gf();
        gf1.home();
        System.out.println("------------------------------");

        grandFather gf2 = new Son(); // this concept is called as dynamic dispatch
        gf2.gf();
        gf2.home();
        System.out.println("----------------------");

        father f2 = new Son(); // this concept is called as dynamic dispatch
        f2.f();
        f2.gf();
        f2.home();
    }
}
