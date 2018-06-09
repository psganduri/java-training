package Basics;

public class Weather {
	public static void main (String[] args){
		int temparature= 40;
		String suncondition = "overcast";
		
		if (temparature > 60) {
		System.out.println("1 Terribaly hot! stay indoors");
		}
		
		else if ((temparature >= 40) && (suncondition =="Sunny")){
		System.out.println("2 Weather is hot and sunny, wear t-shirt, shorts and coolers");	
		}
		
		else if ((temparature > 40)||(suncondition == "overcast")) {
			System.out.println("3 Weather is warm or cloudy long sleaves shirt and Jeans");
		}
		else if ((temparature <40) &&(suncondition =="Sunny")){
			System.out.println("4 Weather is cold and Sunny NICE DAY today");
		}
		
		
		
		System.out.println(" 6 Ending Program");
		
		System.out.println("\n Revising for practice");
		int coffeetemp = 70;
		String flavour = "String";
		
		if(coffeetemp >100) {
			System.out.println("Cofee is very hot, be careful!");
		}
		else if ((coffeetemp >=70) && (flavour == "Strong")) {
			System.out.println("Coffe temp is " +coffeetemp + " and flavour is " + flavour +" Right temp and flavour to drink" );
		}
		else if ((coffeetemp <=70) && (flavour == "Strong")) {
			System.out.println("Coffe temp is " +coffeetemp + " and flavour is " + flavour +" Good taste but it is cold, heat it up" );
		}
		else if ((coffeetemp <=70) || (flavour != "Strong")) {
			System.out.println("Coffe temp is " +coffeetemp + " and flavour is " + flavour +" Coffee is not Strong" );
		}		
		
	}

}
