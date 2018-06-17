package exceptionsfiles;

public class NegativePaymentException extends Exception {
//    Define Class Variable
    double Payment;
    public NegativePaymentException(double Payment){
//        Assign the class variable (this) to local variable
        this.Payment=Payment;
        System.out.println("Payment amount entered is:"+Payment);
        System.out.println("Try Again");
    }
//    Override tostring() to include specific error message
    public String toString (){
        return "Error: Negative payment"+"of"+Payment+" is not allowed";

    }
}
