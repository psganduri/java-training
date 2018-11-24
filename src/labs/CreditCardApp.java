package labs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static java.lang.Math.round;

public class CreditCardApp {
    public static void main(String[] args) {
//        creating a array list object to store rows of the CC statement
        List<String[]> accountData = new ArrayList<>();
//        ArrayList<HashMap<String,String>> accountData;
//        balance variable declaration
        float balance = 0;
        String datarow;
//        Filepath string variable declaration
        String filepath = "C:\\Users\\aadm199\\Documents\\Personal\\javatraining\\CCStatement.csv";
//        bufferreader and file reader object creation to read the data in the file
        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            while ((datarow = br.readLine()) != null) {
                String[] line = datarow.split(",");

                accountData.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Using Size" + accountData.size());
        int txntype = 0;
        int bal = 0;
        for (int i = 0; i < accountData.size(); i++) {
            int count = 0;
            if (i == 0) {
                System.out.println("TRUE");
                for (String header : accountData.get(0)) {
                    count = count + 1;
                    if (header.equalsIgnoreCase("txn type")) {
                        txntype = count;
                    }
                    if (header.equalsIgnoreCase("balance")) {
                        bal = count;
                    }

//                for(String header:accountData.get(0)){
//                    count = count + 1;
//                    System.out.println(header);
//                    if (header.equalsIgnoreCase("txn type"))
//                    {
//                        txntype = count;
//                    }if (header.equalsIgnoreCase("balance"))
//                    {
//                        bal = count;
//                    }
//                }
//                System.out.println("Balance is :-" + bal);
//                System.out.println("Txn type  is :-" + txntype);
//            }
//                //Logic to get the header and assign the column number of Txn type and balance


//                txntype = 3;
//               bal = 5;
                }
            } else {
                    for(String [] account:accountData){

//          System.out.println("Length of account array is: "+account.length);
                String txnType = account[txntype];
                System.out.println(txnType);
                if (txnType.equals("CREDIT")) {
                    String amountAsString = account[bal];
                    Float amountAsFloat = Float.parseFloat(amountAsString);
                    balance = balance + amountAsFloat;
                    System.out.println("New Balance after " + account[txntype] + " transaction " + "for amount " + amountAsFloat + " is " + balance);
                } else if (txnType.contains("DEBIT")) {
                    String amountAsString = account[bal];
                    Float amountAsFloat = Float.parseFloat(amountAsString);
                    balance = balance - amountAsFloat;
                    System.out.println("New Balance after " + account[txntype] + " transaction " + "for amount " + amountAsFloat + " is " + balance);
                } else if (txnType.contains("FEE")) {
                    String amountAsString = account[bal];
                    Float amountAsFloat = Float.parseFloat(amountAsString);
                    balance = balance + amountAsFloat;
                    System.out.println("New Balance after " + account[txntype] + " transaction " + "for amount " + amountAsFloat + " is " + balance);
                }
//                        System.out.println("]");
            }
        }

        if(balance>0){
            System.out.println("Your outstanding at end of the month is greater than 0 and is " + balance);
            balance=balance+(balance/10);
            System.out.println("A fee of 10% is laved on the outstanding balance at the end of the month, New balance to be paid is: "+(balance));
        }
        else if (balance==0){
            System.out.println("Thank you for your timely payment you have no dues");
        }
        else if (balance<0){
            System.out.println("You have made an overPayment of amount "+balance);
            }
        }
    }
}

