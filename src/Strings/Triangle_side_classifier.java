package Strings;

import java.util.Scanner;

public class Triangle_side_classifier {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first side = ");
        int first_side = scanner.nextInt();
        System.out.println("Please enter second side = ");
        int second_side = scanner.nextInt();
        System.out.println("Please enter third side = ");
        int third_side = scanner.nextInt();
        
        if(first_side == second_side && second_side == third_side){
            System.out.println("This is Equilateral triangle");
        } else if (first_side != second_side && second_side != third_side) {
            System.out.println("This is Scalene triangle");
        } else {
            System.out.println("This is Isosceles triangle");
        }

    }
}
