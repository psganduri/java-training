package labs;

import java.io.*;
import java.util.ArrayList;

public class PhoneNumtemp {
    public static void main(String[] args) {
//        This will read a file and retie phone numbers
//        Valid Phone number:
//            10 digits long
        // Area code cannot start in 0 or 9
//        There should be no 911
        String filename = "C:\\Users\\aadm199\\Documents\\Personal\\javatraining\\Phonenumbers.txt";

        File file = new File(filename);
        String[] phoneNums = new String[4];
//        ArrayList<String> phoneNums = new ArrayList<>();
        String phoneNum = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            for (int i = 0; i < phoneNums.length; i++) {
            phoneNums[i] = br.readLine();
//            for(int i=0;i<phoneNums.size();i++){
//                phoneNum = phoneNums.get(i);

            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File NOT FOUND");
        } catch (IOException e) {
            System.out.println("Error: Inputoutput Exception");
        }
//
//        System.out.println(phoneNum);
//        System.out.println(phoneNum.substring(0,1));
        for (int i = 0; i < phoneNums.length; i++) {
            System.out.println("Phone number under SaveReadFromProperties is"+phoneNums[i]);
            phoneNum = phoneNums[i];
//        for(int i=0;i<phoneNums.size();i++){
//            phoneNum = phoneNums.get(i);

            try {

                if (phoneNum.length() != 10) {
                    throw new TenDigitsException(phoneNum);
                }
                if ((phoneNum.substring(0, 1).equals("0")) || (phoneNum.substring(0, 1).equals("9"))) {
                    System.out.println("SaveReadFromProperties");
                    throw new PhoneNumberApp.AreaCodeException(phoneNum);

                }
                for (int n = 0; n < phoneNum.length() - 2; n++) {
                    if (phoneNum.substring(n, n + 1).equals("9")) {
                        if (phoneNum.substring(n + 1, n + 3).equals("11")) {
                            throw new PhoneNumberApp.Emergancy(phoneNum);
                        }

                    }
                }

            } catch (TenDigitsException e) {
                System.out.println(e.toString());
            } catch (PhoneNumberApp.AreaCodeException e) {
                System.out.println("Entered area code catch");
                System.out.println(e.toString());

            } catch (PhoneNumberApp.Emergancy e) {
                System.out.println("Entered emergancy");
                System.out.println(e.toString());
            }
        }
    }


    static class AreaCodeException extends Exception {
        String num;

        AreaCodeException(String num) {
            this.num = num;
        }

        @Override
        public String toString() {
            return (num + "Invalid area code");
        }
    }

    //class AreaCodeException extends Exception {
//    String num;
//    AreaCodeException(String num){
//        this.num=num;
//
//    }
//    @Override
//    public String toString(){
//        return "Phone number: "+num+"Should not start with 0 or 9";
//    }
//
//}
    static class Emergancy extends Exception {
        String num;

        Emergancy(String num) {
            this.num = num;
        }

        @Override
        public String toString() {
            return (num + " Invalid 911 sequence found");
        }
    }


}
