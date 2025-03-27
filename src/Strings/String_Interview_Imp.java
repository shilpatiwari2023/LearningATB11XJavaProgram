package Strings;

public class String_Interview_Imp {
    public static void main(String[] args) {
        String name = "pramod";
        name = name.toUpperCase();
        System.out.println(name);

        String s1 = "Hello"; //SCP
        String s2 = "Hello";  // SCP
        String s3 = "Hello";  // SCP
        // but only 1 Hello will be stored in String constant pool and
        // s1,s2,s3 all will point to the same as duplicates are not allowed in SCP

        String a= new String("Hello"); // OA
        String b= new String("Hello"); // OA
        String c= new String("hello"); //OA
        // 3 strings hello will be stored as new keyword allocates new memory.

        // == operator in String -> check the location

        System.out.println(s1 == a);
        System.out.println(s1== b);
        System.out.println( a == b);
        System.out.println(s1 == s2);

        // = equals check content value

        System.out.println(s1.equals(a));
        System.out.println(a.equals(c));
        System.out.println(a.equalsIgnoreCase(c));




    }
}
