package oop;

public class BankAccountApp {
    public static void main (String [] args){
//instantiation
        BankAccount account1 = new BankAccount();
        account1.setAccountName("Joe");
        System.out.println(account1.getAccountName());
        account1.accountNumber = "5569852365";
        account1.balance = 5000;
        account1.deposit(5000);
        account1.withdraw(1000);
        System.out.println(account1.toString());
        account1.getAccountName();
//        account1.(sav,1000);

        /*
        System.out.println(account1.accountName = "Joe");
        System.out.println(account1.roundingNumber);


        BankAccount account2 = new BankAccount("Savings");
        System.out.println(account2.accountName = "account2");

        BankAccount account3 = new BankAccount("NewAcc", 5000);
//        System.out.println("Your account "+ account3.accountType + "is now with balance " );
        account3.deposit();

CDAccount account4 = new CDAccount();
        System.out.println(account4.accountName = "blue");
        System.out.println(account4.accountNumber = "545454");
        System.out.println(account4.balance = 600);
        System.out.println(account4.toString());
        account4.compoundInterest();

*/
    }
}
