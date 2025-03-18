package ex_03_type_casting;

public class type_casting_explicit_narrowing {
    public static void main(String[] args) {
        int val = 300;
        byte a= (byte)val; //valid - Explicit narrowing
        System.out.println(a);
        long phone_no = 9967360411L;
        short mobile_no = (short)phone_no;
        System.out.println(mobile_no);
    }
}
