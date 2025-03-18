package ex_02_JavaBasic;

public class Max_among_three {
    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 9;
        int n3 = -11;
        //Logic building formula
        // step 1 = find input/output
        //input - n1,n2,n3 = int
        // output - string = max number

        //step 2 = rough logic
        //if n1>n2 and n1>n3 then n1
        // if n2>n3 and n2>n1 then n2
        //n3
        int max = (n1 > n2) ? (n1 > n3) ? n1 : n3 :((n2 > n3) ? n2 : n3);
        System.out.println("Max is : " + max);



    }
}
