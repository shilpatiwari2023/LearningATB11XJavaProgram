package ex_02_JavaBasic;

public class nested_ternary {
    public static void main(String[] args) {
        //result = condition ? expression1 : (condition ? expression 2 : expression3)
        int num = 15;
        String result = num >20 ? "greater than 20" : (num <30 ? "less than 30" :"greater than 30");
        System.out.println(result);

        //find the max number between 2 numbers
        int x = 10;
        int y = 20;
        System.out.println(Math.max(x,y));
        String result1 = x > y ? "x is max" : "y is max";
        System.out.println(result1);


    }

}
