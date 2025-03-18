package ex_02_JavaBasic;

public class ternary_operator2 {
    public static void main(String[] args) {

        int num = 18;
        String oddEven = num %2 == 0 ? "Even" : "Odd" ;
        System.out.println(oddEven);

        int num1 = -5;
        String result = num1>0 ? "positive" : "negative";
        System.out.println(result);
    }
}
