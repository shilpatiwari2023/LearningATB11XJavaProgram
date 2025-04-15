package Inheritance;

public class single_inheritance {
    public static void main(String[] args) {
      Father f1 = new Father();
        System.out.println(f1.gold_f);
        f1.bhk2();

        Son s1 = new Son();
        s1.bhk3();
        System.out.println(s1.gold_f);
        s1.bhk2();
    }

static class Father{
    int gold_f = 1000;

    void bhk2(){
        System.out.println("Father- 2 bhk");
}
}

static class Son extends Father{
        void bhk3(){
            System.out.println("Son-3BHK");
        }
}
}