package Basics;

public class DaysSwitch {
	public static void main(String[] args) {
		String dayofweek = "Monday";
		
		switch (dayofweek){
			case "Monday" : 
				System.out.println("Today is Monday");
				break;
			case "Tuesday" : 
				System.out.println("Day of week is Tuesday");
				break;
			case "Wednesday" : 
				System.out.println("Day of week is Wednesday");
				break;
			case "Thursday" : 
				System.out.println("Day of week is Thursday");
				break;
			case "Friday" : 
				System.out.println("Day of week is Friday");
				break;
			case "Saturday" : 
				System.out.println("Day of week is Saturday");
				break;
			case "Sunday" : 
				System.out.println("Day of week is Sunday");
				break;
		}
		System.out.println("\nRevising for practice");
		String coloursByFruit = "Yellow";
		switch (coloursByFruit ) {
		case "Red" :
			System.out.println("Red as in Strawberry");
			break;
			
		case "Green" :
			System.out.println("Green as in Guava");
			break;
		case "Blue" :
			System.out.println("Blue as blueberry");
			break;
		case "Yellow" :
			System.out.println("Yellow as banana");
			break;
			
		
		}
		
}
}
