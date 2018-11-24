package datastructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapsPractice1 {

            public static void main(String[] args){
            Map<String,String> personInfo = new HashMap<String, String>();
            personInfo.put("Name","Prem");
            personInfo.put("Age","32");
            personInfo.put("Gender","Male");
            personInfo.put("Name1","Ajay");
            personInfo.put("Age1","31");
            personInfo.put("Gender1","Male");
            
//        String[] values = personInfo.get("Name");
                List<Map<String,String >> personDB = new ArrayList<Map<String,String>>();
                personDB.add(personInfo);

             System.out.println(personDB.size());
             for(int i=0;i<personDB.size();i++) {
            	 System.out.println("Entered loop");
            	 System.out.println(personDB.get(i));
             }
//
//            System.out.println("1. Size of the Map is: "+personInfo.size());
//            System.out.println("2. Key set in the Map is: "+personInfo.keySet());
//            System.out.println("3"+personInfo.values());
//            System.out.println(personInfo.get("Name"));
//            System.out.println("--------------------");
//
//
//            for(String keyval:personInfo.keySet()){
//                System.out.println(keyval +","+ personInfo.get(keyval));
//            }
//



        }
    }


