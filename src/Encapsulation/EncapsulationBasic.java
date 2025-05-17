package Encapsulation;

public class EncapsulationBasic {
    public static void main(String[] args) {
        VWOLogin vwologin = new VWOLogin("admin","123pwd");
        System.out.println(vwologin.username);
        System.out.println(vwologin.password);


    }
}

class VWOLogin{
    public String username;
    public String password;

    VWOLogin(String user,String pwd){
        this.username = user;
        this.password = pwd;
    }

}