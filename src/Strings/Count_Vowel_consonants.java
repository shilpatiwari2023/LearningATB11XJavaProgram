package Strings;

public class Count_Vowel_consonants {
    public static void main(String[] args) {
        String input = "Java program for checking the vowels and consonants in the given sentence";
         int vowel = 0;
         int consonants = 0;
         for(int i = 0;i<= input.length(); i++){
             char ch = input.charAt(i);
             if(ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' ||ch == 'u'){
                 vowel = vowel + 1 ;
             } else {
                 consonants = consonants + 1 ;
             }
              }
        System.out.println("No of vowels :-   " + vowel);
        System.out.println("No of consonants :-    " + consonants);

    }
}
