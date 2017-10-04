package googlesheet;


import jxl.Workbook;
import jxl.write.*;
import jxl.write.Number;

import java.io.File;
import java.io.IOException;

import java.net.URL;

import com.google.gdata.client.spreadsheet.SpreadsheetService;
import com.google.gdata.data.spreadsheet.CustomElementCollection;
import com.google.gdata.data.spreadsheet.ListEntry;
import com.google.gdata.data.spreadsheet.ListFeed;
import com.google.gdata.util.ServiceException;

public class PrintSpreadsheet {
	
	private static final String EXCEL_FILE_LOCATION = "C:\\temp\\MyFirstExcel.xls";

	
    public static void main(String[] args) throws IOException {
    	 WritableWorkbook myFirstWbook = null;

             myFirstWbook = Workbook.createWorkbook(new File(EXCEL_FILE_LOCATION));

             // create an Excel sheet
             WritableSheet excelSheet = myFirstWbook.createSheet("Sheet 1", 0);

             // add something into the Excel sheet
    	SpreadsheetService service = new SpreadsheetService("Sheet1");
        
        try {
            String sheetUrl ="https://spreadsheets.google.com/feeds/list/1G3VABou70MUbRzY4vHgiDME5JW5rfo7lrAr_hZyEawU/default/public/values";
            URL url = new URL(sheetUrl);

            // Get Feed of Spreadsheet url
            ListFeed lf = service.getFeed(url, ListFeed.class);

            //Iterate over feed to get cell value
            for (ListEntry le : lf.getEntries()) {
                CustomElementCollection cec = le.getCustomElements();
                //Pass column name to access it's cell values
                String val = cec.getValue("Cell1");
                excelSheet.addCell(val);
                System.out.println(val);
                String val2 = cec.getValue("Cell2");
                System.out.println(val2);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ServiceException e) {
            e.printStackTrace();
        }
    }
}
   
     