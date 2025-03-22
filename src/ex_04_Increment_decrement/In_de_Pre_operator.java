package ex_04_Increment_decrement;

public class In_de_Pre_operator {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a;  //10+1 -> b ->11  increment first and then store
        System.out.println(b);
        System.out.println(a);

        // line no || a || Result b
        // 5          10      NA
        // 6          11      11
        // 7          11(NA)  11
        //8           11      11 (NA)


    }
}
