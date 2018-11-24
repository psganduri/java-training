package datastructures;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Accounts {
    public static void main(String[] args){
//        To Read data and print from a CSV file
//        Store the data in CSV file to a List of type ArrayList
        List<String[]> data = new ArrayList<>();
                String textRow;
 //     Define  CSV file path
        String filePath="C:\\Users\\aadm199\\Documents\\Personal\\javatraining\\accounts.csv";
//      Open the CSV file
        try {
//            Open File
            BufferedReader br = new BufferedReader(new FileReader(filePath));
//            Read as long as file is empty
            while ((textRow = br.readLine()) != null) {
//Parse data separating by comma
                String[] line = textRow.split(",");
//                Add the data to Arraylist collection
                data.add(line);

            }
            br.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
            for(String[] row :data) {
            System.out.print("[");
            for(String field: row){
                System.out.print(field+",");
            }
            System.out.println("]");
    }

    }
}
