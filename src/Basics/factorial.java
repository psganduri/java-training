package Basics;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(factorialOfNum(5));
	}
	
	public static int factorialOfNum (int n) {
		//n! = n*(n-1)! where n!=0
		if (n == 0) {
			return 1;
		}
		else if (n == 1) {
			return  1;
		
		}
		else if (n == 2) {
			return 2;
		}
		
			return (n * factorialOfNum(n-1));
			
	
			
	
	}
}
	