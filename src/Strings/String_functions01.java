package Strings;

public class String_functions01 {
    public static void main(String[] args) {
        String name = "Sonal";
        System.out.println(name.length());
        System.out.println(name.charAt(2));
       // System.out.println(name.charAt(10));  // will give StringIndexOutOfBound exception
        System.out.println(name.concat("Patel"));
        System.out.println(name.equals("Sonal"));
        System.out.println(name.contains("Om"));
        System.out.println(name.equalsIgnoreCase("sonal"));
        System.out.println(name.indexOf("a"));
        System.out.println(name.replace('n','N'));

        String email = "shilpatiwari@gmail.com";
        System.out.println(name.split(@));
    }
}
