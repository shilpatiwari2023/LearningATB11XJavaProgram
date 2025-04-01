package Loops_condition;

import java.util.Scanner;

public class triangle_classifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fist side:- ");
        int side1 = scanner.nextInt();
        System.out.println("Enter second side:- ");
        int side2 = scanner.nextInt();
        System.out.println("Enter third side:- ");
        int side3 = scanner.nextInt();

        if(side1 <= 0 || side2 <= 0 || side3 <=0){
            System.out.println("This is not a triangle");
            System.exit(0);
        }
        if(side1 +side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2){
            System.out.println("This is not a triangle");
            System.exit(0);
        }
        if(side1 == side2 && side2 == side3){
            System.out.println("This is Equilateral triangle");
        } else if (side1 == side2 || side2 == side3 || side1 == side3 ) {
            System.out.println("This is Isosceles triangle");
        } else{
            System.out.println("This is Scalene triangle");
        }
    }
}
