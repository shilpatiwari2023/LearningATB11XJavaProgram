package Collections;

public class LetterCase_Counter {

    public static void main(String[] args) {
        String input = "Java Programming Is FUN";

        countLetterCases(input);
    }

    public static void countLetterCases(String str) {
        int uppercaseCount = 0;
        int lowercaseCount = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            }
        }

        System.out.println("Uppercase letters: " + uppercaseCount);
        System.out.println("Lowercase letters: " + lowercaseCount);
    }
}
