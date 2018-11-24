package datastructures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class MorePractice {
    public static void main(String[] args) {
//        Define and declare a array
        String[] birthdays = {"04", "20", "31", "18", "12"};
        String[] birthMonth = {"June", "September", "October", "July", "August"};
        String[] birthYear = {"2018", "2016", "1987", "1985", "1969"};
        System.out.println(birthdays.length);
//        Define and declare a array list
        List<String[]> familyDOB = new ArrayList<>();
//        Adding arrays to array list
        familyDOB.add(birthdays);
        familyDOB.add(birthMonth);
        familyDOB.add(birthYear);
        System.out.println(familyDOB.size());
//        for(int i=0;i<familyDOB.size();i++){
//                System.out.println(familyDOB.get(i).toString().substring(1,6));
//        }
//Looping through each array
        for (String[] item : familyDOB) {
            System.out.print("[");
//            looping through each string of a array
            for (String values : item) {
//                Printing values of each array
                System.out.print(values + " ");
            }
            System.out.println("]");


        }
//        Set defined and declared
        Set<String> bitdayset = new LinkedHashSet<>();
//        Added values from each array to sets
        bitdayset.addAll(java.util.Arrays.asList(birthdays));
        System.out.println(bitdayset);
        bitdayset.addAll(java.util.Arrays.asList(birthMonth));
        System.out.println(bitdayset);
        bitdayset.addAll(java.util.Arrays.asList(birthYear));
//       Printing entire set
        System.out.println(bitdayset);
        System.out.println(bitdayset.size());
//Printing entire set tostring
        System.out.println(bitdayset.toString());

//        Looping through each value in the set
        for (String item : bitdayset) {
//    Printing each value in the set
            System.out.println("[" + item + "]");

        }
        Map<String, String> testMap = new LinkedHashMap<String, String>();
        testMap.put("04", "Day");
        testMap.put("June", "Month");
        testMap.put("2018", "Year");
        testMap.put("20", "Day");
        testMap.put("Sep", "Month");
        testMap.put("2016", "Year");
        System.out.println(testMap);
        System.out.println("------------");
        Map<String, String[]> birthdayMap = new HashMap<>();
        birthdayMap.put("Day", birthdays);
        birthdayMap.put("Month", birthMonth);
        birthdayMap.put("Year", birthYear);
//for(Map<String,String[]> mapRecord:birthdayMap){
////
////}
        System.out.println("Printing Key set: " + birthdayMap.keySet());
        for (String key : birthdayMap.keySet()) {
            for (String[] values : birthdayMap.values()) {
                for (String data : values) {
                    System.out.println(data);
                }
            }

        }

        String datarow;
//        Filepath string variable declaration
        String filepath = "C:\\Users\\aadm199\\Documents\\Personal\\javatraining\\students.xlsx";
//        bufferreader and file reader object creation to read the data in the file
        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            while ((datarow = br.readLine()) != null) {
                String[] line = datarow.split(",");

//                accountData.add(line);

                for (int i = 1; i <= 10; i++) {
                    System.out.println("test");
//            testMap.put(excelsheet(A,i),excelsheet(B,i));
                }


            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}