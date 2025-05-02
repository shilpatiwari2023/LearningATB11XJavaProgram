package Strings;

import java.util.Scanner;

//import static Strings.Palindrome.reverseString;

public class Palindrome_check {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the string to check palindrome = ");
        String userInput = scanner.next();
        String newString = reverseString(userInput);
        if(newString.equalsIgnoreCase(userInput)){
            System.out.println("It is Palindrome");
        } else {
            System.out.println("It is not Palindrome");
        }

    }


private static String reverseString(String userInput){
    String reversed = "";

        for(int i = userInput.length() - 1; i >=0; i--){
            reversed = reversed + userInput.charAt(i);
        //System.out.println("Reversed string is = " + reversed);
    }
    System.out.println("Reversed string is = " + reversed);
        return reversed;
}
}