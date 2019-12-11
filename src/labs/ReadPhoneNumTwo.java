package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadPhoneNumTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String filename= "C:\\Users\\aadm199\\Documents\\Personal\\javatraining\\phonebook.txt";
File file = new File(filename);
String phoneNumber=null;
try {
	BufferedReader br = new BufferedReader(new FileReader(file));
 phoneNumber = br.readLine();
System.out.println(phoneNumber);
br.close();
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
try {

	if (phoneNumber.length()!=9) {
		throw new NineDigitsException(phoneNumber);
	}
	if (phoneNumber.substring(0, 1).equals("4")) {
		throw new AreacodeException(phoneNumber);
		}
	if(phoneNumber.substring(0,2).equals("0")){
		throw new NumberzeroException(phoneNumber);
		}
//	System.out.println(phoneNumber.substring(2));
//	System.out.println(phoneNumber.substring(0, 1));
//	System.out.println(phoneNumber.subSequence(0, 3));
//	System.out.println(phoneNumber.length());
//	for (int i=0;i<phoneNumber.length();i++) {
//		System.out.println("Printing Phonenumber loop");
//		System.out.print("Phone number at position"+ i + "is "+(phoneNumber.substring(i,i+1)));
//	}
	for (int n=0;n<=phoneNumber.length()-2;n++) {
		if (phoneNumber.substring(n,n+1).equals("0")){
			if ((phoneNumber.substring(n+1,n+2).equals("0"))&&(phoneNumber.substring(n+2,n+3).equals("0"))) {
				throw new EmergencyNumberException(phoneNumber);
			}
		}


	}


}catch (NineDigitsException e) {
	System.out.println("Error:Phone number is not 9 digits");
	System.out.println(e.toString());
}catch (AreacodeException e) {
	System.out.println("Error:Phone number is not having correct area code");
	System.out.println(e.toString());
}catch (EmergencyNumberException e) {
	System.out.println("Error:Phone number is 000 in it");
	System.out.println(e.toString());
}catch (NumberzeroException e){
	System.out.println("Second digit should not be 0");
	System.out.println(e.toString());
}





	}


}
class NineDigitsException extends Exception {
	String num;
	NineDigitsException (String num){
		this.num=num;
	}
	public String toString () {
		return ("Phonumber is: "+ num +" Phonenumber should be 9 digits long");

	}
}

class AreacodeException extends Exception {
	String num;
	AreacodeException (String num){
		this.num=num;
	}
	public String toString () {
		return ("Phonumber is: "+ num +" Areacode should start with zero");

	}
}


class EmergencyNumberException extends Exception {
	String num;
	EmergencyNumberException (String num){
		this.num=num;
	}
	public String toString () {
		return ("Phonumber is: "+ num +" Phone number should not contain 000");

	}
}

class NumberzeroException extends Exception{
	String num;
	NumberzeroException(String num){
		this.num=num;
		}
		public String toString (){
		return num;
		}
}