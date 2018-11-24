package labs;

import java.io.*;

public class PhoneNumberApp {
    public static void main(String[] args) {
//        This will read a file and retie phone numbers
//        Valid Phone number:
//            10 digits long
        // Area code cannot start in 0 or 9
//        There should be no 911
        String filename = "C:\\Users\\aadm199\\Documents\\Personal\\javatraining\\Phonenumbers.txt";

        File file = new File(filename);
        String[] phoneNums = new String[4];
        String phoneNum = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            for (int i = 0; i < phoneNums.length; i++) {
                phoneNums[i] = br.readLine();
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
            System.out.println("Phone number under test is"+phoneNums[i]);
            phoneNum = phoneNums[i];
            try {

                if (phoneNum.length() != 10) {
                    throw new TenDigitsException(phoneNum);
                }
                if ((phoneNum.substring(0, 1).equals("0")) || (phoneNum.substring(0, 1).equals("9"))) {
                    System.out.println("test");
                    throw new AreaCodeException(phoneNum);

                }
                for (int n = 0; n < phoneNum.length() - 2; n++) {
                    if (phoneNum.substring(n, n + 1).equals("9")) {
                        if (phoneNum.substring(n + 1, n + 3).equals("11")) {
                            throw new Emergancy(phoneNum);
                        }

                    }
                }

            } catch (TenDigitsException e) {
                System.out.println(e.toString());
            } catch (AreaCodeException e) {
                System.out.println("Entered area code catch");
                System.out.println(e.toString());
                
            } catch (Emergancy e) {
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
