package labs;
class LetterNotFoundException  extends Exception {
	String num;
	LetterNotFoundException(String num){
		this.num = num;
	}
		public String toString () {
		return	("Password entered" +num+" Password should have a letter");
		}
		
	}