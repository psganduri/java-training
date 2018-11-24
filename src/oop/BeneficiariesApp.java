package oop;

public class BeneficiariesApp {
    public static void main (String[] args) {
        Beneficiaries lifeproduct = new Beneficiaries();
        lifeproduct.setTitle("Mr");
        lifeproduct.setFirstName("Ben1");
        lifeproduct.setLastName("lastnm");
        lifeproduct.setDob("01011990");
        lifeproduct.percentageBen=100;
        System.out.println(lifeproduct.toString());
    }
}
