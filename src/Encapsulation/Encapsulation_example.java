package Encapsulation;

public class Encapsulation_example {
    public static void main(String[] args) {

        ICICIBank icicibank = new ICICIBank("shilpa", 500L);
        icicibank.setName("Divya");
        System.out.println(icicibank.getName());

    }
}
class ICICIBank{

    private String name;
    private Long bal;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getBal() {
        return bal;
    }

    public void setBal(Long bal) {
        this.bal = bal;
    }

        public ICICIBank(String username, Long balance){
        this.name=username;
        this.bal=balance;

    }
}