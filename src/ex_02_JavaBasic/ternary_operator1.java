package ex_02_JavaBasic;

public class ternary_operator1 {
    public static void main(String[] args) {
        int age=20;
        String canIVote = age>=18 ? "Yes, you can vote" : "No, you can't vote";
        System.out.println(canIVote);
    }
}
