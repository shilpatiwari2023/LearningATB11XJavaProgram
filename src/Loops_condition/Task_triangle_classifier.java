package Loops_condition;

import java.util.Scanner;

public class Task_triangle_classifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first side : ");
        int first_side = scanner.nextInt();
        System.out.println("Enter second side : ");
        int second_side = scanner.nextInt();
        System.out.println("Enter third side : ");
        int third_side = scanner.nextInt();

        if((first_side == second_side) && (first_side == third_side)){
            System.out.println("This is Equilateral triangle");

                    }
        if((first_side!= second_side) && (first_side != third_side )){
            System.out.println("This is scalene triangle");
        }
        if((first_side==second_side) && (first_side!= third_side)){
            System.out.println("This is Isosceles triangle");
        }



    }
}
