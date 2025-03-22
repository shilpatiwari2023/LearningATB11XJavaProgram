package ex_04_Increment_decrement;

public class Mix_In_De {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);// 10 + 12 = 22
        System.out.println(a); //12
        System.out.println(a-- + --a);  //12 + 10 = 22
        System.out.println(a); // 10
        System.out.println(--a + a--);// 9 + 9 = 18
        System.out.println(a);//8
        System.out.println(a++ + a--); // 8 + 9 = 17
        System.out.println(a); //8

    }
}
