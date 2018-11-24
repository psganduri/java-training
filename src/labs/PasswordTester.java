package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PasswordTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = "C:\\Users\\aadm199\\Documents\\Personal\\javatraining\\Passwordlist.txt";
		File file = new File(filename);
		BufferedReader br;
		String[] passwordlist = new String[4];
		String password = null;
		try {
			 br = new BufferedReader(new FileReader(file));
			 for (int i=0;i<passwordlist.length;i++) {
				 passwordlist[i] = br.readLine();		 
			 }
		
		br.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i=0;i<passwordlist.length;i++) {
			password = passwordlist[i];
			System.out.println("Password at: "+passwordlist[i]+"is"+password);
			
		
				try {
					System.out.println("check start");
					boolean atleastOneAlpha = true;
					atleastOneAlpha = password.matches(".*[a-zA-Z].*");
					while (!atleastOneAlpha) {
						System.out.println("no aplhabet");
						throw  new LetterNotFoundException(password); 
					}
					
					boolean atleastOneNumber = true;
					atleastOneNumber = password.matches(".*[0-9].*");
					while (!atleastOneNumber) {
						throw new NumberNotFoundException (password);
									}
					
					boolean atleastOneSpecialchar = true;
					atleastOneSpecialchar = password.matches("[!@#$%^&*()]");
					while (!atleastOneSpecialchar) {
						throw new SpecialCharNotFoundException (password);
									}
				}
				
			
				catch (LetterNotFoundException e) {
					System.out.println("Letter not found in Password");
					System.out.println(e.toString());
				}	catch (NumberNotFoundException e) {
					System.out.println("Number not found in Password");
					System.out.println(e.toString());
				}catch (SpecialCharNotFoundException e) {
					System.out.println("Special character not found in Password");
					System.out.println(e.toString());
				}
}
	}



	

}

	
	



