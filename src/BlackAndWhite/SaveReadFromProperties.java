package BlackAndWhite;

import java.io.*;
import java.util.*;

public class SaveReadFromProperties {
    public static void main(String[] args) throws IOException, InterruptedException {

        Map<String, String> bendetails = generateBenenfeciariesFieldValues(1);
        System.out.println("Values in transferred map" + bendetails.values());
        storeBenefeciariesInPropFile(bendetails);
        Thread.sleep(1000);
        readAndEnterBeneficiaryDetails();
//        System.out.println("calling getfromfile "+getBenDetailsFromFile().values());
//        readPropertyFile();
    }

    private static void readAndEnterBeneficiaryDetails() throws IOException {


    }

    public static Map<String, String> getBenDetailsFromFile() throws IOException {
        System.out.println("In readPropertyFile method");
        Properties prop = new Properties();
        InputStream input;
        Map<String, String> rMap = new HashMap<>();
        HashMap<String, String> propvals = new HashMap<String, String>();
        try {

            input = SaveReadFromProperties.class
                    .getResourceAsStream("C:\\Users\\aadm199\\eclipse-workspace\\JavaTraining\\src\\BlackAndWhite\\TestData.Properties");
            if (input != null) {
                prop.load(input);
                // TODO close the stream
            } else {
                // Properties file not found!
            }

//        File tf = new File("C:\\Users\\aadm199\\eclipse-workspace\\JavaTraining\\src\\BlackAndWhite\\TestData.Properties");
            BufferedReader br = new BufferedReader(new FileReader(String.valueOf(input)));

            String key = null;
            String val = null;

            while (br.readLine() != null) {

                String[] readFile = br.readLine().split("=");

                System.out.println("lines read from file are: " + br.readLine());
//            for(int i=0;i<=readFile.length;i++){
//                rMap.put(readFile[i],readFile[i+1]);
//                System.out.println("Values in new map are "+ rMap.values());
//            }
                System.out.println("first value in array is: " + readFile[1]);
                key = readFile[0];
                val = readFile[1];
                rMap.put(key, val);
                //            readFile[0] = String.valueOf(rMap.keySet());
//            readFile[1] = String.valueOf(rMap.values());
//String benper = rMap.get("benPer");
//            System.out.println("Ben per is "+ benper);
//            String firstname = rMap.get("FN");
//            System.out.println("Firstnmae read for application is: "+firstname);


            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rMap;
    }

    public static void readPropertyFile() {
        System.out.println("In readPropertyFile method");
        Properties prop = new Properties();
        InputStream input;
        HashMap<String, String> propvals = new HashMap<String, String>();
        try {

            input = SaveReadFromProperties.class
                    .getResourceAsStream("C:\\Users\\aadm199\\eclipse-workspace\\JavaTraining\\src\\BlackAndWhite\\TestData.Properties");
            if (input != null) {
                prop.load(input);
                // TODO close the stream
            } else {
                // Properties file not found!
            }
            System.out.println("Property File Loaded Succesfully");
            Set<String> propertyNames = prop.stringPropertyNames();
            for (String Property : propertyNames) {
                System.out.println(Property + ":" + prop.getProperty(Property));
                propvals.put(Property, prop.getProperty(Property));
            }
            System.out.println("HashMap generated::" + propvals);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static Map<String,String> generateBenenfeciariesFieldValues (int index){
        String fieldName = "FN";
        String fieldValue = "SaveReadFromProperties";

    String benPer= String.valueOf((100/index));
    String fnbenper = "benPer";
    String fieldValBenPer = benPer;

        Map<String,String> benMap = new TreeMap<>();
        benMap.put(fieldName,fieldValue);
        benMap.put(fnbenper,fieldValBenPer);
        System.out.println(benMap.values());

        return benMap;

    }

    public static void storeBenefeciariesInPropFile (Map<String,String> storeMap) throws IOException {
        File newFile = new File("C:\\Users\\aadm199\\eclipse-workspace\\JavaTraining\\src\\BlackAndWhite\\TestData.Properties");
        InputStream Input = new FileInputStream(newFile);
        
        Properties prop = new Properties();
        prop.load(Input);
        Input.close();


        for (String ks:storeMap.keySet()){
            System.out.println(ks);
            String kv = storeMap.get(ks);
            System.out.println(kv);
            prop.put(ks,kv);
            System.out.println("VAlues in prop file"+prop);
            
            System.out.println("Values in storeMap prop"+storeMap.values());
            
File toClose = new File("C:\\Users\\aadm199\\eclipse-workspace\\JavaTraining\\src\\BlackAndWhite\\TestData.Properties");
FileOutputStream fileoutputstream = new FileOutputStream(toClose);
prop.store(fileoutputstream, null);
fileoutputstream.close();

        }




    }

}
