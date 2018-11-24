package Files;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.IOException;

public class ExcelReader {
    //Create a string variable and point the excel file location
    public static final String XLSXFilePath="C:\\Users\\aadm199\\Documents\\Personal\\javatraining\\students.xlsx";

    public static void main (String[] args) throws IOException, InvalidFormatException{
            //   Create a Workbook using Apachi POI interfaces and classes
        Workbook excelWorkbook = WorkbookFactory.create(new File(XLSXFilePath));
        System.out.println("No of sheets in excel file are "+excelWorkbook.getNumberOfSheets());


        }
        }

