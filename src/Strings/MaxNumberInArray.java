package Strings;

public class MaxNumberInArray {
    public static void main(String[] args) {

        int arr[] = {1,8,10,5,7,9};
        int max = arr[0];
        for(int i = 0; i< arr.length;i++){
            System.out.println(arr[i]);
            if(arr[i]> max){
                max= arr[i];
            }
        }
        System.out.println("max number is " +max);
    }
}
