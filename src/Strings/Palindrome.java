package Strings;

import java.util.Scanner;


public class Palindrome {
    public static void main(String[] args) {

       // String name = "Madam";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the word to check Palindrome");
        String userInput = scanner.next();
        String newString = reverseString(userInput);

        if(newString.equalsIgnoreCase(userInput)) {
            System.out.println("Palindrome");
        } else{
                System.out.println("Not a Palindrome");
            }


    }

    private static String reverseString(String userInput) {
       String reversed = "";
       for (int i = userInput.length()-1; i>=0; i--) {
           reversed = reversed + userInput.charAt(i);

       }
       return reversed;
    }
}
