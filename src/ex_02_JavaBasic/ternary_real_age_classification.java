package ex_02_JavaBasic;

public class ternary_real_age_classification {
    public static void main(String[] args) {
        //age - adult (age >18), minor (age<18), senior citizen (age>65)
         //take an input from user
        //String age1 = args[0];
        //int age = Integer.parseInt(age1); run first time the program and then edit configuration -> program configuration
        int age =70;
        String result_age = (age < 18) ? "Minor" : (age < 65) ? "Adult" : "Senior Citizen";
        System.out.println(result_age);

    }
}
