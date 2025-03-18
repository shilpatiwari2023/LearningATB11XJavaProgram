package ex_03_type_casting;

public class type_casting_daily_use {
    public static void main(String[] args) {
        int cost = 100;
        float gst = 18.45f;
       // int total = cost+gst; //narrowing - implicit -> not allowed

        int total1 = cost +(int)gst; //narowing - explicit
        System.out.println(total1);

        float total2 = cost+gst; //widening - implicit - auto done
        System.out.println(total2);

        float total3 = (float)cost+gst;  //widening - explicit
        System.out.println(total3);
    }
}
