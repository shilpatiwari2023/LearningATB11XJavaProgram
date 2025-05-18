package Collections;

import java.util.HashMap;
import java.util.Map;

public class RepeatedCharacters_inString {
    public static void main(String[] args) {

        String input = "programming";
        countRepeatedCharacters(input);

    }

    public static void countRepeatedCharacters(String str) {

        Map<Character, Integer> charCountMap = new HashMap<>();

        // Convert string to lowercase for uniformity
        str = str.toLowerCase();


        // Count frequency of each character
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {  // Optional: Only count letters
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }

        // Print characters with count > 1
        System.out.println("Repeated characters:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
