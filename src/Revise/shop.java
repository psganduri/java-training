package Revise;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class shop implements priceGenerator{
	public static String bananas;
	public static String Apples;
	public static String Cherries;
	public static String Avacado;
	
	public  shop(String x, String y,String z) {

//		Print list of fruits available in the fruit shop
		ArrayList <String> Fruits = new ArrayList<String>();
		Fruits.add(bananas);
		Fruits.add(Apples);
		Fruits.add(Avacado);
		Fruits.add(Cherries);
//		to find if strings entered are in shop
		if (Fruits.contains(x)) {
			System.out.println("Fruit "+x+"is present in Shop");
		}else System.out.println("Fruit "+x+"is not present in Shop");
		if (Fruits.contains(y)) {
			System.out.println("Fruit "+y+"is present in Shop");
		}else System.out.println("Fruit "+y+"is not present in Shop");
		if (Fruits.contains(z)) {
			System.out.println("Fruit "+z+"is present in Shop");
		}else System.out.println("Fruit "+z+"is not present in Shop");
		System.out.println("No of fruits avaliable are "+Fruits.size());
		for(String fruit:Fruits )
		{System.out.println(fruit);
			}
	System.out.println(Fruits.get(1));
	}
	
	
	@Override
	public void sellingPrice() {
		// TODO Auto-generated method stub
		System.out.println("Fruits are healthy so do not worry about seling price");
		
	}

}
