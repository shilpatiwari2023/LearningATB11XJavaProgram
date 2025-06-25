package JavaCode_Practice;

import java.util.Scanner;

public class Add2number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        System.out.println("Enter the second number: ");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        //int a = 2;
        //int b = 3;
       // int sum = a + b;
        int sum = first +second;
        System.out.println("Sum is : " + sum);
    }
}
