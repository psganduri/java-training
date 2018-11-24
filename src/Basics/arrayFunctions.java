package Basics;

public class arrayFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []oddNumb = {1,3,5,7,9};
		System.out.println("Sum of all the numbers in array is "+sumOfArray(oddNumb));
}
	public static int sumOfArray(int[] numbers) {
		int sumOdArray=0;
		for(int i=0;i<numbers.length;i++){
			 sumOdArray=sumOdArray+numbers[i];
					}
		return sumOdArray;

	}
}