package Strings;

public class FizzBuzz {
    public static void main(String[] args) {

        for(int i = 1; i<=100; i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.println("The number is " + i + " = " + "FizzBuzz as this number is multiple of 3 and 5");
            }
            else if(i%3 == 0) {
                System.out.println("The number is " + i + " = " + "Fizz as this number is multiple of 3");
            }
            else if(i%5 == 0) {
                System.out.println("The number is " + i + " = " + "Buzz as this number is multiple of 5");
            }
        }
    }

}
