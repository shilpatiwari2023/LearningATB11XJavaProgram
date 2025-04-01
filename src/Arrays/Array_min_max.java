package Arrays;

public class Array_min_max {
    public static void main(String[] args) {
        int[] array = {25, 15, 78, 96, 45, 52, 63, 90, 16, 7};

        int max_output = give_me_max(array);
      //  System.out.println("Max number of array is:-  "  + max);

    }

    private static int give_me_max(int[] array) {
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
                System.out.println("Max is:-  " + max);
            }

        }
        return max;

    }
}
