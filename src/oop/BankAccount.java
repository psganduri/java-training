package oop;

public class BankAccount {
    //Declare Variables
   private String accountName;
    //Static Variable
    private static final String roundingNumber = "1234";
    //Instance Variables
    String accountNumber;
    String accountType;
    String tfn;
    double balance;
//Constructors
    BankAccount(){
    System.out.println("New bank account opened");
}
BankAccount (String accountType){
    //accountType, InitDeposit, Msg are local variables
    System.out.println("New account type Opened: " + accountType);
}
    BankAccount (String accountType, double InitDeposit){
    String Msg = null;
    if (InitDeposit < 1000) {
         Msg = ("Minimum balance of $ 1000 needed for Initial deposit");
        System.out.println(Msg);
    }
        else {
             Msg = ("Thank you for opening your account with us. Your balance now is " + InitDeposit);
    }

    System.out.println(Msg);
    balance = InitDeposit;
    }

//setters /Getters

    public void setAccountName(String accountName) {
        this.accountName = "Mr. " + accountName;
    }

    public String getAccountName() {
      return accountName;
    }

    //Define methods
    public void deposit (double amount){
    balance = balance + amount;
//    System.out.println("Balance in your account is "+balance);
    recentActivity("deposit");

    }
    void  accountBalance (){

    }
    public void withdraw (double amount){
balance = balance - amount;
recentActivity("withdraw");
    }

    private void recentActivity (String activity ){
System.out.println("Thank you for your recent activity:"+ activity);
System.out.println("Your latest balance is " + balance);
    }

    @Override
    public String toString(){
    return  "["+ accountName + "," + accountNumber + ","+balance +","+roundingNumber +"]";
    }

}
