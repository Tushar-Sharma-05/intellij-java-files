package bank;

public class Main {
    public static void main(String[] args) {

        bankAccount bobsAccount = new bankAccount();
        System.out.println("bankAccount constructor with parameters called");




        bobsAccount.withdraw(100.0);

        bobsAccount.deposit(80.00);
        bobsAccount.withdraw(10.00);




        vipPerson person1 = new vipPerson();
        System.out.println(person1.getName());

        vipPerson person2 = new vipPerson("bob",24.00);
        System.out.println(person2.getName());

        vipPerson person3 = new vipPerson("tim",24.00,"tim.com");
        System.out.println(person3.getName());




    }
}