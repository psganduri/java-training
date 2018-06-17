package exceptionsfiles;

import java.util.Scanner;

public class PaymentsApp {
    public static void main(String[] args) {
        double Payment = 0;
        boolean positivePayment=true;
        do {
            //    1.Ask user to enter Payment input
            System.out.print("Enter PAyment amount:");

            //    2.Get input and test the value
            Scanner in = new Scanner(System.in);

            //    3.Handel exceptions appropriately
            try {
                Payment = in.nextDouble();
                if (Payment < 0) {
                    throw new NegativePaymentException(Payment);
                }
                else {
                    positivePayment = true;
                }
            } catch (NegativePaymentException e) {
                System.out.println(e.toString());
                positivePayment = false;
            }
        } while (!positivePayment);

//        4.Display confirmation message to user
        System.out.println("Thank you for the Payment of: "+Payment);
    }
}
