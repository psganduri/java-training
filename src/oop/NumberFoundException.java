package oop;

public class NumberFoundException extends Exception{
    String name;
    public NumberFoundException (String firstName) {
        this.name = firstName;
        System.out.println("Firstname entered as beneficiary is: "+ firstName);
    }
    public String toString () {
        return	("Only Alphabets allowed in name");
    }
}
