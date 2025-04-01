package Arrays;

public class Array03 {
    public static void main(String[] args) {
       String names[] = {"Shilpa","Nishka","Anika"};

        System.out.println(names.length);
        System.out.println(names[2]);
        System.out.println(names[1]);
        System.out.println(names[0]);

        System.out.println("-------------------------------------------------");
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        boolean[] is_male_data = new boolean[2];
        System.out.println(is_male_data[0] = true);
        is_male_data[1] = false;

    }
}
