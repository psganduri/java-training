package Basics;

public class Strings {

	public static void main(String[] args) {
String bookTitle = "The lord of the Rings";
String kewWord = "Ring";
if (bookTitle.contains(kewWord)) {
	System.out.println(bookTitle + "contains word " + kewWord );
	
}

String browserName = "Chrome";
if (browserName.equalsIgnoreCase("chrome")) {
	System.out.println("the bowser is "+ browserName );
}

String firstname = "Prem sai";
String lastname = "Ganduri";
String passportNumber ="F8767566";
System.out.print(firstname.substring(0, 1) );
System.out.print(lastname.substring(0, 1));
System.out.print(passportNumber.substring(5));

	}

}
