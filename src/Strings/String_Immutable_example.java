package Strings;

public class String_Immutable_example {
    public static void main(String[] args) {
        String name = "shilpa";
       name = name.toUpperCase(); // storing the new value in name
        // name.toUpperCase(); //capital shilpa is not getting stored as name is still pointing to shilpa

        System.out.println(name);
    }
}
