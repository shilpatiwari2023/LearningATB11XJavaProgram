package Strings;

public class Pyramid_pattern_star {
    public static void main(String[] args) {

        int rows = 5;
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= rows - 1; j++){
                System.out.println(" ");
            }
            for(int k = 1; k <= (2 * i -1); k++){
                System.out.println("*");
            }
            System.out.println();
        }

    }
}
