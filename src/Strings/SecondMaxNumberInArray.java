package Strings;

public class SecondMaxNumberInArray{

    public static void main(String[] args) {
        int[] numbers = {10, 25, 30, 5, 30, 18};
        findSecondMax(numbers);

    }
    public static void findSecondMax(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second maximum found (all elements might be same).");
        } else {
            System.out.println("Second maximum number is: " + secondMax);
        }
    }
}
