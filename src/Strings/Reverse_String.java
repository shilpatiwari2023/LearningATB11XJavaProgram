package Strings;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter string to reverse - ");
        String UserInput = scanner.next();
       // String str = "Alok Tiwari";
        char ch[] = UserInput.toCharArray();
        int size = ch.length;
        System.out.println(size);
        System.out.println(ch);
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(ch[i]);

        }
    }
}
