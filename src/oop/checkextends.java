package oop;

public class checkextends extends BankAccount{

    public static void main (String[] args){

    }
    @Override
    public void setAccountName(String accountName) {
        super.setAccountName(accountName);

    }

    @Override
    public String getAccountName() {
        return super.getAccountName();
    }
}
