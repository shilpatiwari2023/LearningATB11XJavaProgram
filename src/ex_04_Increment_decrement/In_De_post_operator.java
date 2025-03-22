package ex_04_Increment_decrement;

public class In_De_post_operator {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++); // first print then increment
        System.out.println(a);
        System.out.println(a++ + ++a);//11+13+24
    }
}
