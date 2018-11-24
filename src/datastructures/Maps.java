package datastructures;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args){
//        1.Implement Map interface
        TreeMap<Integer,String> TMap = new TreeMap<>();
        TMap.put(7,"JamesBondhere");
        System.out.println(TMap.keySet());
        System.out.println(TMap);
for(int ketvalue: TMap.keySet()) {
    System.out.println(ketvalue+" "+TMap.get(ketvalue));
mapUtility(TMap);

}
}




//    Add Key value pairs
    public static void mapUtility (Map<Integer, String> map){
map.put(101,"Sarah");
map.put(308,"Rajesh");
map.put(227,"Prem");
map.put(222,"Bhaswanth");

//print them
        System.out.println("Key elements in map are"+map.keySet());
        System.out.println("Key map pair is"+map);
        System.out.println(map.get(101));
        for(int key:map.keySet()){
            System.out.println("[For key:"+key+"Value is:"+map.get(key)+"]");
        }
    }
}
