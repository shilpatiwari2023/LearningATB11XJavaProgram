package Arrays;

public class MinNumberInArray {
    public static void main(String[] args) {
        int arr[] = {5,4,8,9,15,1,25};
        int min = arr[0];
        for(int i = 0; i< arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Min number is - " + min);
    }
}
