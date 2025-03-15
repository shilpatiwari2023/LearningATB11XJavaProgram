package ex_01_JavaBasic;

public class Table_of_9 {
    public static void main(String[] args) {
        System.out.println("Table of 9-------------------");
        System.out.printf("9*1=9");
        System.out.println("");
        System.out.printf("9*2=18");
        System.out.println("");
        System.out.printf("9*3=27");
        System.out.println("");
        System.out.printf("9*4=36");
        System.out.println("");
        System.out.printf("9*5=45");
        System.out.println();
        System.out.printf("9*6=54");
        System.out.println();
        System.out.printf("9*7=63");
        System.out.println();
        System.out.printf("9*8=72");
        System.out.println();
        System.out.printf("9*9=81");
        System.out.println();
        System.out.println("9*10=90");

        int number = 10;
        String result = (number % 2 == 0) ? "Even" : "Odd";
        /*String result = null;
        if (number % 2 ==0) {
            result = "even";
        } else {
            result = "odd";
        }*/
        System.out.println("The number " + number + " is " + result);
       }
}
