package Loops_condition;

import java.security.spec.RSAOtherPrimeInfo;

public class If_else {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter your age :  ");
        int age = scanner.nextInt();
        System.out.println(age);

        if(age>18) {
            System.out.println("yes you can vote!");
        }
            else{
            System.out.println("No you can't vote!");
        }
    }
}
