package labs;

public class BankAccountApp {
    public static void main (String[] args){
        BankAccount acc1 = new BankAccount("5563",1000);
        BankAccount acc2 = new BankAccount("57563",2000);
        BankAccount acc3 = new BankAccount("58563",2000);
        acc1.setName("Jim");
        System.out.println(acc1.getName());
        acc1.makeDeposit(500);
        acc1.makeDeposit(1000);
        acc1.payBill(500);
        acc1.accure();
        System.out.println(acc1.toString());
    }
}

class BankAccount implements Iinterest {
    //Properties of bank account
    private static int id=1000; // Internal id
    private String accountNumber; // id + random 2 digit num + first 2 of SSN
    private static final String roundingNumber="000454254";
    private String name;
    private String SSN;
    private double balance;


    //Constructors
    public  BankAccount(String SSN,double intiDeposit){
        balance = intiDeposit;
        System.out.println("New account created");
        this.SSN= SSN;
        id++;
        setAccountNumber();
    }
    private void setAccountNumber(){
        int random= (int) (Math.random() * 100);
System.out.println(random);
                accountNumber = id + "" +random + SSN.substring(0,2);
        System.out.println("Your account number " +accountNumber);



    }
    public void setName(String name){
        this.name = name;

    }
    public String getName (){
     return  name;
    }
    public void payBill (double amount){
        balance = balance-amount;
        System.out.println("Paying bill" + amount);
        showBalance();

    }
    public void makeDeposit (double amount){
        balance = balance+amount;
        System.out.println("Making deposit" + amount);
        showBalance();
    }
    public void showBalance(){
        System.out.println("Balance is " +balance);
    }

    @Override
    public void accure() {
        balance = balance *(1+ (rate/100)) ;
        showBalance();

    }
    @Override
    public String toString(){
        return "[Name"+name+" ]\n[Account Number:"+accountNumber+"]\n" +"[Rounding Number:"+ roundingNumber +"]\n"+ "[Balance" +balance+"]";
    }
}
