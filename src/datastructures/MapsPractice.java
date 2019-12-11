 package datastructures;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapsPractice {
    public static void main(String[] args){
        Map<String,String> personInfo = new LinkedHashMap<String, String>();
        personInfo.put("Name1","Prem");
        personInfo.put("Age1","32");
        personInfo.put("Gender1","Male");
        personInfo.put("Name2","Ajay");
        personInfo.put("Age2","31");
        personInfo.put("Gender3","Male");
//        String[] values = personInfo.get("Name");

        System.out.println("1. Size of the Map is: "+personInfo.size());
        System.out.println("2. Key set in the Map is: "+personInfo.keySet());
        System.out.println("3"+personInfo.values());
        System.out.println(personInfo.get("Name2"));
        System.out.println("--------------------");

        
        for(String keyval:personInfo.keySet()){
        	  System.out.print(keyval +","+ personInfo.get(keyval));
        }
        System.out.println("---------------------");
        
//        for (Entry<String,String> entry : personInfo.entrySet()) {
//        	System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//        }x

        for(Entry<String, String> entry1 : personInfo.entrySet()) {
        	System.out.println("Key: "+entry1.getKey() + ", Values: "+entry1.getValue());
        }
        testmethod();


    }

    public static void testmethod (){
        System.out.println("*****************HERE I AM**************");
    }
}
