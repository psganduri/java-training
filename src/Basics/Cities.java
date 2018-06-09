package Basics;

public class Cities {

	public static void main(String[] args) {
		// Define and Declare arrays
		String[] cities = {"Delhi", "Bombay","Calcutta", "Bangalore"};
			
		System.out.println(cities[0]);
		
	
		//DEclare array
		String [] countries;
		
		//Define array
		countries = new String [3];
		countries[0]="India";
		countries[1]="Australia";
		countries[2]="UK";
		System.out.println(countries[2]);
		
		System.out.println("****************");
		//Declare and define arrays (number only)
		String[] states = new String[3];
		states[0] = "Andhra pradesh";
		states[1] = "Delhi";
		states[2] = "Telangana";
		
		int i = 0;
		// Do loop enters loop and then checks for the condition
		do {
			System.out.println("State no :" + i + " is " + states[i] );
			i = i + 1;
		} while (i<3);
		
		System.out.println("Printing output for while loop below");
		

		
		// while checks for the condition and then enters loop
		int n = 0;
		boolean stateFound = false;
		while (!stateFound) {
			String state =states[n];
			System.out.println(state);
			if (state == "Delhi") {
				System.out.println("StateFound!");
				stateFound = true;
			}
			
				n++;
	}
		
		//For loop is the most structured way to iterate through Arrays
		System.out.println("\nPrinting output of For Loop");
		for( int x = 0; x < 3; x++) {
			System.out.println("States at index" + x + "is" + states[x]);
		}
		
		System.out.println("\n *********Revising by colours String*********");
		String [] colours = new String[7];
		colours[0] = "violet";
		colours[1] = "Indigo";
		colours[2] = "blue";
		colours[3] = "Green";
		colours[4] = "Yellow";
		colours[5] = "Orange";
		colours[6] = "Red";
		for (int c = 0; c <= 6; c ++){
			System.out.println("The colour is  "+ colours[c]);
		}
		
		
}
}


