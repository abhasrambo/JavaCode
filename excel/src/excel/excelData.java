package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class excelData {
	
	public static void main(String[] args) throws IOException {
		
		String dt_path = "/Users/abhaskumar/Desktop/test.xls";
		
		/*Step 1: Get the XL Path*/
		File xlFile = new File(dt_path);
		
		/*Step2: Access the Xl File*/
		FileInputStream xlDoc = new FileInputStream(xlFile);
		
		
		/*Step3: Access the work book */
		HSSFWorkbook wb = new HSSFWorkbook(xlDoc);
		
		
		/*Step4: Access the Sheet */
		HSSFSheet sheet = wb.getSheet("Sheet1");
		
		String data = sheet.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(data);
		
	}

}