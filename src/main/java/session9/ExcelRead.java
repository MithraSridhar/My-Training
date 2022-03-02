package session9;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		//st:1
		XSSFWorkbook workbook = new XSSFWorkbook(new File("./data/Login.xlsx"));
		
		//st:2
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		//st:3
		int rowCount= sheet.getLastRowNum();
		int colCount= sheet.getRow(0).getLastCellNum();
		
		for(int i=1; i<=rowCount;i++) {
			XSSFRow row =sheet.getRow(i);
			
			for(int j=0;j<=colCount;j++) {
				XSSFCell cell = row.getCell(j);
				String cellValue=cell.getStringCellValue();
				System.out.println(cellValue);
			}
		}
		
	}

}
