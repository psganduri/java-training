package Files;

import java.io.*;

public class Read {
    public static void main(String[] args) {
//    1. Define a file Path - file in a path
        String fileName = "C:\\Users\\aadm199\\Documents\\Personal\\javatraining\\FileToRead.txt";
        String text = null;
//    2.Create a file in Java
        File file = new File(fileName);
//    3. Open the file
        BufferedReader br;

        {
            try {
                br = new BufferedReader(new FileReader(file));
                text = br.readLine();
                System.out.println(text);
                br.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Finished reading the file");
            }
        }

        //    4. Read the file

//    5.Close the file


    }
}