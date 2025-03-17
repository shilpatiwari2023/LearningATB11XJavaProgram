package ex_02_JavaBasic;

public class All_Operators {
    public static void main(String[] args) {
       //assignment operator
        int a= 100;
        int b= 20;
        //arithmetic operator
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

       //unary operator
        int c= +100;
        int d= -200;
        System.out.println(c+d);
        System.out.println(c-d);
        System.out.println(c*d);
        System.out.println(c/d);

        //relational operator
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println(a!=b);

        //Logical operator
        int age = 10;
        System.out.println(age>=0 || age<=20);
        System.out.println(age>=0 && age<=10);

        // string concatenation

        String first_name = "Shilpa";
        String last_name = "Tiwari";

        System.out.println(first_name+ last_name + a + b);
        System.out.println(a+b+first_name+last_name);




    }
}
