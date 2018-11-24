package datastructures;

import java.util.ArrayList;

public class Lists {
    public static void main (String[] args){
//        1.Create a collection
        ArrayList<String>cities = new ArrayList<String>();

// 2.Add some elements
        cities.add("Melbourne");
        cities.add("Sydney");
        cities.add("Brisbane");


//  Iterate the collection
        for (String city: cities){
            System.out.println(city);
        }
        System.out.println("There are "+cities.size()+"elements in cities");
        System.out.println(cities.get(2));

        //        Remove an element from collection
        cities.remove(2);
        System.out.println("-----------------");
        System.out.println(cities.get(1));
        System.out.println("---------------------");
        System.out.println("New array size is"+cities.size());
        for(String city:cities){
            System.out.println(city);
        }
    }
}
