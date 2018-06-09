package Basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		//let's declare a variable to create out career
		//Declare a variable
		String career;
		System.out.println("Program is starting");
		//Defining a variable
		career = "Software Developer";
		System.out.println("My career : "+ career);
		
		//Declare and Define
		int hoursPerWeek = 40;
		int weeksPerYear    = 52;
		double rate = 42.50;
		double annualSalary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My annual salary as a "+ career + "at rate per hr $" + rate + "is " + annualSalary +"per year");
		
		
		
		
		//Compute our annual salary
		//rate * hoursPerWeek * weeksPerYear
		
		//to generate gas and electricity bill per month
		//Define variables
		System.out.println("\nRevising defining and declaring variables");
		double gasUnitRate = 1.87;
		double elecUnitRate = 1.19;
		int gasUPM = 75;
		int elecUPM = 150;
		String GB = ("Gas bill per month");
		String EB = ("Elec bill per month");
		double gasBill;
		double elecBill;
		gasBill = gasUPM * gasUnitRate;
		elecBill = elecUPM * elecUnitRate;
		System.out.println(GB + " = " + gasBill);
		System.out.println(EB + " = " +  elecBill);
		
	}

}
