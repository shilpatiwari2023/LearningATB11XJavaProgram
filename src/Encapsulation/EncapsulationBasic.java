package Encapsulation;

public class EncapsulationBasic {
    public static void main(String[] args) {
        VWOLogin vwologin = new VWOLogin("admin","123pwd");
        System.out.println(vwologin.username);
        System.out.println(vwologin.password);

        GoodVWOLogin goodvwologin = new GoodVWOLogin("customer","pwd456");
        //System.out.println(goodvwologin.user_name);
      //  System.out.println(goodvwologin.pass_word);     not allowed to access private variables
          goodvwologin.setUser_name("Shilpa");
        System.out.println(goodvwologin.getUser_name());
        goodvwologin.setPass_word("256alok", false);
        System.out.println(goodvwologin.getPass_word());




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
class GoodVWOLogin{

    private String user_name;
    private String pass_word;

    GoodVWOLogin(String user,String pwd){
        this.user_name = user;
        this.pass_word = pwd;
    }
    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPass_word() {
        return pass_word;
    }

    public void setPass_word(String pass_word, boolean isAdmin) {
        if(isAdmin){
            this.pass_word = pass_word;
        } else {
            System.out.println("not allowed to change password");
        }

    }
}