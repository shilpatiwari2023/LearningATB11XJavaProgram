package Strings;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.nextInt();
        String str = "Alok Tiwari";
        char ch[] = str.toCharArray();
        int size = ch.length;
        System.out.println(size);
        System.out.println(ch);
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(ch[i]);

        }
    }
}
