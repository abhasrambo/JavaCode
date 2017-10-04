package salesforceModule;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ReusableMethods 
{
	Object[][] locator;
	Object[][] data;
	Object[][] matrix;
	String locatorType;
	String value;
	String obj_Name;
	

	//Report data
	static BufferedWriter bw = null;
	static BufferedWriter bw1 = null;
	static String htmlname;
	static String objType;
	static String objName;
	static String TestData;
	static String rootPath;
	static int report;
	static Date cur_dt = null;
	static String filenamer;
	static String TestReport;
	int rowcnt;
	static String exeStatus = "True";
	static int iflag = 0;
	static int j = 1;
	static String fireFoxBrowser;
	static String chromeBrowser;
	static String result;
	static int intRowCount = 0;
	static String dataTablePath;
	static int i;
	static String browserName;
	
	public void setValue(int row)
	{
		obj_Name = (String) locator[row][0];
		locatorType = (String) locator[row][1];
		value=(String) locator[row][2];
	}

	public By getBy(String type, String value)
	{

		switch (type)
		{
		case "id":
			return By.id(value);
		case "xpath":
			return By.xpath(value);
		case "className":
			return By.className(value);
		case "name":
			return By.name(value);
		case "linkText":
			return By.linkText(value);
		case "partialLinkText":
			return By.partialLinkText(value);
		case "cssSelector":
			return By.cssSelector(value);
		case "tagName":
			return By.tagName(value);
		default:
			System.out.println("Unknown type");
			return null;

		}
	}

	public void readLocators(String path)
	{
		//String path = "C:/Users/Seema/workspace/Selenium/src/testdata/SF_ObjectRepository.xls";
		locator=readExcel(path); 
	}

	public  void readTestData(String path) throws InterruptedException
	{
		//String path = "C:/Users/Seema/workspace/Selenium/src/testdata/TestData_SalesForceLoginError.xls";
		data = readExcel(path);
	}

	public Object[][] readExcel(String path)
	{
		try
		{
			File file = new File(path);
			FileInputStream xf = new FileInputStream(file);
			HSSFWorkbook xwb = new HSSFWorkbook(xf);
			ArrayList<String> sNames = new ArrayList<String>();

			// retrieve all the sheet in a file
			for (int i=0; i<xwb.getNumberOfSheets(); i++) 
			{
				sNames.add( xwb.getSheetName(i) );
			}
			
			//Iterate through each sheet and retrieves the data and stores it in an arraylist
			for(String s: sNames)
			{
				HSSFSheet sheet = xwb.getSheet(s);
				int row = sheet.getLastRowNum()+1;
				int col = sheet.getRow(0).getLastCellNum();
				matrix = new Object[row][col];
				for(int i=0;i<row;i++)
				{
					for(int j=0;j<col;j++)
					{
						HSSFCell cell = sheet.getRow(i).getCell(j);
						if(cell!=null)
						{
							String value= cell.getStringCellValue();
							matrix[i][j]=value;

						}
					}
				}
				//print(data,row,col);
			}
			xwb.close();
		}
		catch(Exception e)
		{
			
		}
		return matrix;
	}
	
	//get attribute value
	public String getAttributeValue(WebElement ele_attribute)
	{
		String actual = ele_attribute.getAttribute("value");
		return actual;
	}

	//Clear text box
	public void clear(WebElement textBox)
	{
		textBox.clear();
	}
	//Verification method
	public String verify(String expected, String actual)
	{
		String result =null;
		if(expected.equals(actual))
		{
			result = "Pass";
			return result;
		}
		else
		{
			result = "Fail";
			return result;
		}
	}
	
	//gettext method
	public String getTxt(WebElement textEle)
	{
		String text=null;
		text = textEle.getText();
		return text;	
	}


	/*
	 * Name of Method: clickElement
	 * Brief Description: Clicks an element
	 * Arguments: obj(Button/Linktext),objName(Name of the object)
	 * Created By: Seema
	 * Creation Date: 23 Aug 2017
	 * Last Modified Date: 23 Aug 2017
	 */
	public void clickElement(WebElement obj, String objName )
	{
		if(obj.isDisplayed())
		{
			if(obj.isEnabled())
			{
				obj.click();
				System.out.println(objName+" is cicked");
			}
		}
		else
		{
			System.out.println(objName+" is disabled");
		}

	}

	/*
	 * Name of Method: enterText
	 * Brief Description: Enters text to textfield
	 * Arguments: obj(TextBox),textData(Value to be entered),objName(Name of the object)
	 * Created By: Seema
	 * Creation Date: 23 Aug 2017
	 * Last Modified Date: 23 Aug 2017
	 */
	public void enterText(WebElement obj, String textData, String objName)
	{
		if(obj.isDisplayed())
		{
			obj.sendKeys(textData);
			System.out.println("Pass: "+textData+" is entered in "+objName);
		}
		else
		{
			System.out.println("Fail: "+objName+" is not displayed. Please check your application");
		}

	}

	//start Report method
	public static void startReport(String scriptName, String ReportsPath) throws IOException{

		String strResultPath = null;
		String testScriptName =scriptName;
		cur_dt = new Date(); 
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		String strTimeStamp = dateFormat.format(cur_dt);

		if (ReportsPath == "") { 

			ReportsPath = "C:\\";
		}

		if (ReportsPath.endsWith("\\")) { 
			ReportsPath = ReportsPath + "\\";
		}

		strResultPath = ReportsPath + "Log" + "/" +testScriptName +"/"; 
		File f = new File(strResultPath);
		f.mkdirs();
		htmlname = strResultPath  + testScriptName + "_" + strTimeStamp 
				+ ".html";
		bw = new BufferedWriter(new FileWriter(htmlname));
		bw.write("<HTML><BODY><TABLE BORDER=0 CELLPADDING=3 CELLSPACING=1 WIDTH=100%>");
		bw.write("<TABLE BORDER=0 BGCOLOR=BLACK CELLPADDING=3 CELLSPACING=1 WIDTH=100%>");
		bw.write("<TR><TD BGCOLOR=#66699 WIDTH=27%><FONT FACE=VERDANA COLOR=WHITE SIZE=2><B>Browser Name</B></FONT></TD><TD COLSPAN=6 BGCOLOR=#66699><FONT FACE=VERDANA COLOR=WHITE SIZE=2><B>"
				+ "FireFox " + "</B></FONT></TD></TR>");
		bw.write("<HTML><BODY><TABLE BORDER=1 CELLPADDING=3 CELLSPACING=1 WIDTH=100%>");
		bw.write("<TR COLS=7><TD BGCOLOR=#BDBDBD WIDTH=3%><FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>SL No</B></FONT></TD>"
				+ "<TD BGCOLOR=#BDBDBD WIDTH=10%><FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>Step Name</B></FONT></TD>"
				+ "<TD BGCOLOR=#BDBDBD WIDTH=10%><FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>Execution Time</B></FONT></TD> "
				+ "<TD BGCOLOR=#BDBDBD WIDTH=10%><FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>Status</B></FONT></TD>"
				+ "<TD BGCOLOR=#BDBDBD WIDTH=47%><FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>Detail Report</B></FONT></TD></TR>");


	}


	//Report update method
	public static void Update_Report(String Res_type,String Action, String result) throws IOException {
		String str_time;
		Date exec_time = new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		str_time = dateFormat.format(exec_time);
		if (Res_type.startsWith("Pass")) {
			bw.write("<TR COLS=7><TD BGCOLOR=#EEEEEE WIDTH=3%><FONT FACE=VERDANA SIZE=2>"
					+ (j++)
					+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=10%><FONT FACE=VERDANA SIZE=2>"
					+Action
					+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=10%><FONT FACE=VERDANA SIZE=2>"
					+ str_time
					+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=10%><FONT FACE=VERDANA SIZE=2 COLOR = GREEN>"
					+ "Passed"
					+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = GREEN>"
					+ result + "</FONT></TD></TR>");

		} else if (Res_type.startsWith("Fail")) {
			exeStatus = "Failed";
			report = 1;
			bw.write("<TR COLS=7><TD BGCOLOR=#EEEEEE WIDTH=3%><FONT FACE=VERDANA SIZE=2>"
					+ (j++)
					+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=10%><FONT FACE=VERDANA SIZE=2>"
					+Action
					+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=10%><FONT FACE=VERDANA SIZE=2>"
					+ str_time
					+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=10%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
					+ "<a href= "
					+ htmlname
					+ "  style=\"color: #FF0000\"> Failed </a>"

				+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
				+ result + "</FONT></TD></TR>");

		} 
	}


}
