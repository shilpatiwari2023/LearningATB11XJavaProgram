package JavaCode_Practice;

public class Factorial_Calculation {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }

    static int factorial(int n){
        int res = 1, i;
        for (i = 2; i <= n; i++)
            res = res * i;
        return res;
    }
}
