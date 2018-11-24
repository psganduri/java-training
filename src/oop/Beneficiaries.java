package oop;

import java.sql.SQLOutput;

public class Beneficiaries {
    String title;
    String firstName;
    String lastName;
    String dob;
    double percentageBen;

    Beneficiaries(){
        System.out.println("Please enter beneficiary details");
    }
    public Beneficiaries(double percentageBen) {
        this.percentageBen = percentageBen;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        try{
            if (firstName.matches(".*[0-9].*")){
                throw new NumberFoundException (firstName);
            }

        }catch (NumberFoundException e){
            System.out.println(e.toString());
        }

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public double getPercentageBen() {
        return percentageBen;
    }

    public void setPercentageBen(double percentageBen) {
        this.percentageBen = percentageBen;
    }
@Override
    public String toString (){
      return (title+ firstName+lastName+percentageBen);
}
}
