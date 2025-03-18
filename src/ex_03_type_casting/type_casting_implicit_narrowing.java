package ex_03_type_casting;

public class type_casting_implicit_narrowing {
    public static void main(String[] args) {
        int val = 200;
       // byte a = val; //invalid -Implicit Narrowing is not allowed
        //we can do it explicitly

        //data loss will be there as we are converting bigger datatype into smaller one.
        System.out.println(val);
    }
}
