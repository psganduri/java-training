package Basics;

public class NumbersCalc {
	public static void main(String[] args) {
		name();
		int numA=10;
		int numB=20;
		Sumofnumbers(numA,numB);
		System.out.println(multiplynumbers(numA,numB));
		double gasUnitRate = 1.94;
		double elecUnitRate = 1.2;
		int gasUPM = 75;
		int elecUPM = 150;
		System.out.println("\n Revising functions");
		gasBillPerMonth(numA,numB);
		System.out.println("Gas bill for this month is "+gasBillPerMonth(gasUnitRate,gasUPM));
		electBillPerMonth(elecUnitRate,elecUPM);
		System.out.println("electricity bill for this month is " +electBillPerMonth(elecUnitRate,elecUPM));
		
	}
	static void name() {
	System.out.println("My name is Prem");
	}
	
	static void Sumofnumbers(int a, int b) {
		int sum=a+b;
		System.out.println("Sum of two numbers"+ a+ "and" + b +"equals"+ sum);
		
	}
	
static int multiplynumbers(int valueA, int valueB) {
	int product = valueA * valueB;
//	Sumofnumbers(product,product);
	return product;
	
}
	


static  double gasBillPerMonth (double gasrate, double units) {
	double gasamountBilled = (gasrate * units);
	return gasamountBilled;
}

static  double electBillPerMonth (double elecrate, double units) {
	double elecamountBilled =(elecrate * units);
	return elecamountBilled;
}



}

