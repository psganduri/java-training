package oop;

public class CDAccount extends BankAccount {


    void compoundInterest() {
        System.out.println("Compound int");
    }

//    @Override
//    public void setAccountName(String accountName) {
//        super.setAccountName("CompoundAccOne");
//    }


    @Override
    public void setAccountName(String accountName) {
        super.setAccountName(accountName);
    }

    @Override
    public String getAccountName() {
        return super.getAccountName();
    }
}

