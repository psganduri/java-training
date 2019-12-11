package Revise;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class dataStructuresApril {
    public static void main (String[] args) throws IOException {
//new dataStructuresApril().methodForString("check");
        HashMap<Integer,String> mapobj = new HashMap<>();
        mapobj.put(6,"delta");
//
//        new dataStructuresApril().storeMapinProp(mapobj);
//        HashMap<Integer,String> mainvarmap =new dataStructuresApril().metforMap();
//        for(int k:mainvarmap.keySet()){
//            System.out.println(k +mainvarmap.get(k));
//        }

//        new dataStructuresApril().storeMapinProp(mainvarmap);
//        new dataStructuresApril().storeMapinPropst("fg","gh");

new dataStructuresApril().storeMapinProp(mapobj);
    }
    public void methodForString(String a){
        String alphaString = "Prem sa i";
        String betsString = "  ";
        System.out.println("------------"+a);
        if(alphaString.equalsIgnoreCase("prem sai")){
            System.out.println("Name matches and is: "+alphaString);
        }else {
            System.out.println("Name does not match : "+alphaString);
        }
        System.out.println("Sub string of " +alphaString + " "+alphaString.substring(0,4));
        System.out.println("Substing with begin index: "+alphaString.substring(5));
        System.out.println("length of String: "+alphaString+"is "+alphaString.length());
        System.out.println(alphaString.isEmpty());
//        try {
//            System.out.println(betsString.isEmpty());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        System.out.println(alphaString+"in upper case is as: "+alphaString.toUpperCase());
        System.out.println("Whats this!!"+alphaString.toUpperCase());
        System.out.println("outputfor matches: "+alphaString.matches(betsString));
        System.out.println("Checking contains" +alphaString.contains("em s"));
        for(String nam:alphaString.split(" ")){
            System.out.println(nam);
        }

        for(String nam:alphaString.split(" ",3)){
            System.out.println("Split check with limit "+
                    nam);
        }

        System.out.println("Inlower case: "+alphaString.toLowerCase());





        System.out.println(alphaString);
    }

    public void methforarr(){
        String [] arrVarforString =  new String[4];
        arrVarforString[0] = "a";
        System.out.println(arrVarforString.length);
        System.out.println(arrVarforString.equals(arrVarforString));

    }
    public void metforList(){
        ArrayList<String> varList = new ArrayList<>();
        System.out.println(varList.size());
        varList.add("ab");
        System.out.println(varList.size());
        System.out.println(varList.get(0).contains("a"));
        varList.add("ac");
        System.out.println(varList.iterator().hasNext());

    }
    public HashMap<Integer,String> metforMap(){
        HashMap<Integer,String> varMap = new HashMap<Integer, String>();
        varMap.put(1, "a");
        for(int sn:varMap.keySet()){
            System.out.println(varMap.keySet()+varMap.get(sn));

        }
//varMap.put(2,"b");
        System.out.println(varMap.size());
        System.out.println(varMap.get(1).toUpperCase());
        return varMap;
    }

    public  void storeMapinProp(Map<Integer, String> datatoStore) throws IOException {
        File fileobj = new File("C:\\Users\\aadm199\\eclipse-workspace\\JavaTraining\\src\\Revise\\stProp.prop");
        InputStream isObj = new FileInputStream(fileobj);
        Properties prop = new Properties();
        prop.load(isObj);
        prop.put(datatoStore.keySet(),datatoStore.values());

        FileOutputStream fos = new FileOutputStream(fileobj);
        prop.store(fos,"");
        fos.flush();



    }
    public  void storeMapinPropst(String a,String b) throws IOException {
        File fileobj = new File("C:\\Users\\aadm199\\eclipse-workspace\\JavaTraining\\src\\Revise\\stProp.prop");
        InputStream isObj = new FileInputStream(fileobj);
        Properties prop = new Properties();
        prop.load(isObj);
//        prop.put(datatoStore.keySet(),datatoStore.values());
prop.setProperty(a, b);

        System.out.println(prop.getProperty(a));
        FileOutputStream fos = new FileOutputStream(fileobj);
        prop.store(fos,"My map saved :)");
        fos.flush();



    }

}
