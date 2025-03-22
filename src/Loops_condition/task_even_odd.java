package Loops_condition;

import java.util.Scanner;

public class task_even_odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :  ");
        int number = scanner.nextInt();
        System.out.println(number);

        if(number%2==0) {
            System.out.println("Number is Even");
        } else{
                System.out.println("Number is Odd");
            }

    }

}
