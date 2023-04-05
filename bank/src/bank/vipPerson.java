package bank;

public class vipPerson {

    private  String name;
    private  double creditLimit;
    private String email;


    public vipPerson(){
        this("Default name",50.000,"default@gmail.com");
    }


    public vipPerson(String name, double creditLimit) {

        this(name,creditLimit,"unknown@gmail.com");

    }

    public vipPerson(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
