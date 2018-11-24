package labs;

public class SpecialCharNotFoundException  extends Exception {
		String num;
		SpecialCharNotFoundException (String num){
			this.num = num;
		}
			public String toString () {
				return ("Number entered is "+num + "Password should have atleast one special character");
			}
			
		}


