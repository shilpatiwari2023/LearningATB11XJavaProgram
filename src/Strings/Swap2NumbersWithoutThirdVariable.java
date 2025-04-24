package Strings;

public class Swap2NumbersWithoutThirdVariable {
    public static void main(String[] args) {
        String a = "Shilpa";
        String b = "Tiwari";

        a = a+b; //
        System.out.println(a);
        b= a.substring(0,a.length()-b.length());
        a= a.substring(b.length());

        System.out.println("First String is a : " +a);
        System.out.println("Second String is b : " +b);


    }
}
