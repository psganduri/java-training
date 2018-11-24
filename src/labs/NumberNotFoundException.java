package labs;

public class NumberNotFoundException extends Exception {
	 		String num;
			NumberNotFoundException(String num){
				this.num = num;
			}
				public String toString () {
				return	("Password entered" +num+" Password should have a number");
				}
				
				
			}	


