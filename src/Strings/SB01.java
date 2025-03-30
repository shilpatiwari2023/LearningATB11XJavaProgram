package Strings;

public class SB01 {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Java");
        stringBuffer.append(" Programming");
        System.out.println(stringBuffer);

        System.out.println(stringBuffer.delete(5, 12));

        System.out.println(stringBuffer.reverse());

        System.out.println(stringBuffer.delete(5, 13));

        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append("  World");
        System.out.println(stringBuilder);

        System.out.println(stringBuilder.reverse());

        System.out.println(stringBuilder.replace(0,2, "Welcome"));


    }
}
