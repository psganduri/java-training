package BlackAndWhite;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DataStructuresRelationPractice {
    public static void main (String[] agrgs){

        String alpha = methodString();
//        methodArray(alpha);

        String[] betaArray = methodArray(alpha);
        methodArrayList(betaArray);

        ArrayList captureAL = methodArrayList(betaArray);
methodMap("one",alpha);

HashMap<String,String> capMap = methodMap("one",alpha);

    }
//This method returns a String value
    public static String methodString(){
        String stcity = "Delhi";
        System.out.println("Length of city "+stcity+ " is :"+stcity.length());
        System.out.println("City in caps: " +stcity.toUpperCase());

        return stcity;

    }

    public static String[] methodArray(String xyz){
        String[] arsentence = {"This array is cretaed for " + xyz,"This is the second sentence in the array!"};

        System.out.println("Length of the array is: "+arsentence.length);
        for (String s : arsentence) {
            System.out.println(s);
        }
        return arsentence;

    }
//Araylist object stores data of a  defined datatype in the arraylist . Say Array list <String> stores list of strings.
    public static ArrayList methodArrayList(String [] pqr){
        ArrayList<String []> arlistPara = new ArrayList();
        arlistPara.add(pqr);
        String[] tempalvar = {"This is a temp"};
arlistPara.add(tempalvar);

        System.out.println("Printing Array list");
        System.out.println("Size of array list is : "+ arlistPara.size());
        for(String[] st:arlistPara){
            for(String stri:st){
                System.out.println(stri);
            }
        }
        return arlistPara;


    }

    public static HashMap<String,String> methodMap(String stLeft, String stRight){
        HashMap<String,String> mapOfString = new HashMap<>();
        mapOfString.put(stLeft,stRight);
        System.out.println("---------------------------------Maps--------------");
        System.out.println("key set of map is:"+mapOfString.keySet());
        for(String k:mapOfString.keySet()){
            System.out.println("key: "+k+ "Has value: "+ mapOfString.get(k));
        }

return mapOfString;
    }

}
