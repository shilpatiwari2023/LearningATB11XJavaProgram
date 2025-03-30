package Strings;

import java.util.Scanner;

public class Palindrome_stringBuilder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the word to check Palindrome -  ");
        String userInput = scanner.next();
        String newString = reverseString(userInput);

        if (newString.equalsIgnoreCase(userInput)){
            System.out.println("It is Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }

    }

    private static String reverseString(String userInput) {
        StringBuilder sb = new StringBuilder(userInput);
        return sb.reverse().toString();
    }
}
