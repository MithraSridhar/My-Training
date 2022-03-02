package session9;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead_CW {

	public static void main(String[] args) throws InvalidFormatException, IOException  {
		//st : 1 open workbook
		
		XSSFWorkbook workbook = new XSSFWorkbook(new File("./data/TC001.xlsx"));
		
		//St : 2 Go to sheet
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		//St: 3 row and col
		int rowCount=sheet.getLastRowNum();
		int colCount=sheet.getRow(0).getLastCellNum();
		
		System.out.println("Row count is "+rowCount);
		System.out.println("Col count is "+colCount);
		
		for(int i=1;i<=rowCount;i++) {
			XSSFRow row = sheet.getRow(i);
			
			for(int j=0;j<=colCount;j++) {
			XSSFCell cell = row.getCell(j);
			String cellValue=	cell.getStringCellValue();
			System.out.println(cellValue);
			}
			
		}

			
		}

}
