package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static void main(String[] args)throws IOException {
	 XSSFWorkbook book = new XSSFWorkbook("./TestData/CreateLead.xlsx");
	  XSSFSheet sheet = book.getSheet("CL");
	  int rowcount = sheet.getLastRowNum();
	  System.out.println(rowcount);
	  for (int i = 1; i <= rowcount; i++) {
		  XSSFRow row = sheet.getRow(i);
		  int colcount = row.getLastCellNum();
		  System.out.println(colcount);
		  for (int j = 0; j <colcount; j++) {
			  XSSFCell cell = row.getCell(j);
			  String value = cell.getStringCellValue();
			  System.out.println(value);
			
		}
	}
	  
	  
	}
	

}
