package Strings;

public class Vowel_consonants_number {
    public static void main(String[] args) {
         int vowel_count=0;
         int consonants_count=0;
         int i;
         String str = "My name is Shilpa Tiwari";

         System.out.println(str.toLowerCase());

         for(i = 0; i< str.length(); i++){
             char ch = str.charAt(i);
             if(ch == 'a' ||  ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                 vowel_count ++ ;
             } else {
                 consonants_count ++;
             }
         }
        System.out.println("No of vowels = " + vowel_count);
        System.out.println("No of consonants " + consonants_count);


    }
}
