package Basics;

public class MovieReview {
	public static void main(String[] args) {
		double rating = 7.5;
		String review = "okay";
		//rating and review is good - commercial success
		if ((rating >= 7.5) && (review=="good"||review == "excellent" )){
			System.out.println("Movie rating is"+ rating  + "and movie review is "+ review+ "1.Commercial success!!");
		}
		
		//rating is good while review is bad - average movie 
		else if ((rating >= 7.5) && (review!="good"||review != "excellent" )){
			System.out.println("Movie rating is"+ rating + "and movie review is "+ review+ "2.average movie");
		}
		
		//rating or review is bad - good attempt not a success
		else if ((rating <= 7.5) && (review=="okay"||review == "fine" )){
			System.out.println("Movie rating is"+ rating + "and movie review is "+ review+"3.good attempt but not a sucessful movie!");
		}
		
		//rating and review is bad - flop show
		else if ((rating <= 7.5) && (review!="good"||review != "excellent" )){
			System.out.println("Movie rating is"+ rating + "and movie review is "+ review+"4.flop show!!");
		}
		System.out.println("ending Program");
		
	}

}
