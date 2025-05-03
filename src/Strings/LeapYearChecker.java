package Strings;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the year to check = ");
        int year = scanner.nextInt();
        if((year%4 == 0 && year % 100 !=0) || (year %400 == 0)){
            System.out.println("This is Leap year");
        } else{
            System.out.println("This is not Leap year");
        }
    }
}
