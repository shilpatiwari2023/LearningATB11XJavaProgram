package Strings;

import java.util.Scanner;

public class Table_of_15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the required number for table printing = ");
        int num = scanner.nextInt();

       // int num = 15;
        for(int i = 1; i<= 12; i++){
            System.out.printf("%s %d \n", num+ "X"+ i +"=", i*num);
        }
    }
}
