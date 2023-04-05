package bank;

public class bankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String  email;
    private String  phoneNumber;



    public bankAccount(){
        this("12333",2.50,"dafault name","default address","default phone number");
        System.out.println("empty constructor called");
    }


    public  bankAccount(String accountNumber,double balance,String customerName,String phoneNumber,String email){
        System.out.println("account cons with params called");

        this.accountNumber=accountNumber;
        this.balance=balance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;

    }

    public void deposit(double depositAmmount){
        this.balance+=depositAmmount;
        System.out.println("deposit of "+ depositAmmount + "made. new balance is " + this.balance);

    }
    public void withdraw(double withdrawalAmmount){
     if(this.balance-withdrawalAmmount<0){
         System.out.println("only" + this.balance + "avalable,withdraw not possible");
     }else{
         this.balance-=withdrawalAmmount;
         System.out.println("withdrawal of "+ withdrawalAmmount+"processed,remaining balance = "+this.balance);
     }

    }




    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }




}
