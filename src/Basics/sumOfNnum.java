package Basics;

public class sumOfNnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Result: " + sumOneToN(5));
	}
	
	public static int sumOneToN (int n) {
		if (n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
//		else if (n == 2) {
//			return 3;
//		}
			
		return   (n)+(sumOneToN(n-1));
	}
	

}
