package Strings;

public class StringBuilderVsStringBuffer {
    public static void main(String[] args) {

        String s0 = "Pramod"; //String Constant Pool
        String s1 = new String("Pramod"); //Object area

        StringBuilder stringBuilder = new StringBuilder("Pramod");

        StringBuffer stringBuffer = new StringBuffer("Pramod");

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer);



    }
}
