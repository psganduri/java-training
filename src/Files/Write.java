package Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args)

    {


        // 1.Defining path
        String filename = "C:\\Users\\aadm199\\Documents\\Personal\\javatraining\\FiletoWrite.txt";
        String message = "text data to file";

        //    2.Create a java file
        File file = new File(filename);

        //    3. Open the file
        FileWriter fw;

        {
            try {
                fw = new FileWriter(file);
//    4. Write to file
                fw.write(message);
//            5. Close the resources
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                System.out.println("Ending Program");
            }
        }


    }
}