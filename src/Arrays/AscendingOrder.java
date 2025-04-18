package Arrays;

import java.util.Arrays;

public class AscendingOrder {
    public static void main(String[] args) {
        int[] arr_ori = {4,1,3};
        int[] arr = arr_ori;
        Arrays.sort(arr);
        //System.out.printf(String.valueOf(arr[0]));
        //System.out.println("Sorted array is - " + sorted[]);
        int min = arr[0];
        for(int j = 0; j < arr.length; j++){ // 5 2 7
            if(arr[j] < min){
                min = arr[j];
                //System.out.println(min);
            }
            //System.out.print(min);
        }
        System.out.print(min);
    }
}
