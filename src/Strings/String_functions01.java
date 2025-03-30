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

        String name1 = "Pramoddutta";

        System.out.println(name1.indexOf("d")); // first character will return

        System.out.println(name1.lastIndexOf("d"));

        System.out.println(name.replace('n','N'));

        String email = "shilpatiwari@gmail.com@123";
        String [] split = email.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        System.out.println(name.startsWith("S"));
        System.out.println(name.endsWith("a"));

       String name2 = "     Shilpa Sonal         ";
        System.out.println(name2.trim());// removes extra space

        System.out.println(name.compareTo("Sonal")); // compare by equals to and returns integer 0 for true and
        // 1 for false
        System.out.println(name.compareToIgnoreCase("sonal"));

        //substring
        String s = "My name is Shilpa";
        System.out.println(s.substring(8,13));


    }
}
