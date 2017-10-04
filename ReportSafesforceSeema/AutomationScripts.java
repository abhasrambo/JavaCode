package salesforceModule;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;

public class AutomationScripts extends ReusableMethods
{
	public  WebDriver driver;
	private String result;

	public void openConnection()
	{
		System.setProperty("webdriver.gecko.driver", "C:/Users/Seema/Downloads/geckodriver-v0.18.0-win64/geckodriver.exe");

		//Launch browser
		driver = new FirefoxDriver();
	}

	public void SFDCLogin()
	{
		try
		{
			startReport("SF_TestCase_1","C:/Users/Seema/Desktop/Report/");
			String orPath = "C:/Users/Seema/Desktop/SF_DataFile/SF_ObjectRepository.xls";
			String tdPath = "C:/Users/Seema/Desktop/SF_DataFile/TestData_SalesForceLoginError.xls";
			readLocators(orPath);
			readTestData(tdPath);
			for(int i=1;i<data.length;i++)
			{
				String url = (String) data[i][0];
				String userName = (String) data[i][1];
				String password = (String) data[i][2];
				String expected = (String) data[i][3];

				//Launch driver
				openConnection();
				driver.get(url);

				//Locate userName
				setValue(1);
				By byUsername = getBy(locatorType,value);
				WebElement ele_userName = driver.findElement(byUsername);
				clear(ele_userName);
				enterText(ele_userName,userName,obj_Name);

				//Locate Password
				setValue(2);
				By bypassword = getBy(locatorType,value);
				WebElement ele_password =driver.findElement(bypassword);
				clear(ele_password);
				enterText(ele_password,password,obj_Name);

				//Locate Login
				setValue(3);
				By byLogin = getBy(locatorType,value);
				WebElement clickLogin = driver.findElement(byLogin);
				clickElement(clickLogin,obj_Name);
				Thread.sleep(5000);

				//actual data
				setValue(4);
				By byerror = getBy(locatorType,value);
				WebElement textError = driver.findElement(byerror);
				String actual = getTxt(textError);

				//Verify Result
				result = verify(expected,actual);
				System.out.println(result);
				Update_Report( result, "SFDCLogin_1",  "Execution Completed");
				driver.close();

			}
			bw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void sfRememberMe()
	{
		try
		{
			startReport("SF_TestCase_3","C:/Users/Seema/Desktop/Report/");
			String orPath = "C:/Users/Seema/Desktop/SF_DataFile/SF_ObjectRepository.xls";
			String tdPath = "C:/Users/Seema/Desktop/SF_DataFile/TestData_SalesForceRememberCheckbox.xls";
			readLocators(orPath);
			readTestData(tdPath);
			for(int i=1;i<data.length;i++)
			{
				String url = (String) data[i][0];
				String userName = (String) data[i][1];
				String password = (String) data[i][2];
				String expected = (String) data[i][3];

				//Launch driver
				openConnection();
				driver.get(url);

				//Locate userName
				setValue(1);
				By byUsername = getBy(locatorType,value);
				WebElement ele_userName = driver.findElement(byUsername);
				clear(ele_userName);
				enterText(ele_userName,userName,obj_Name);

				//Locate Password
				setValue(2);
				By bypassword = getBy(locatorType,value);
				WebElement ele_password =driver.findElement(bypassword);
				clear(ele_password);
				enterText(ele_password,password,obj_Name);

				//Locate Remember Me
				setValue(5);
				By byRemember = getBy(locatorType,value);
				WebElement clickRemember = driver.findElement(byRemember);
				clickElement(clickRemember,obj_Name);

				//Locate Login
				setValue(3);
				By byLogin = getBy(locatorType,value);
				WebElement clickLogin = driver.findElement(byLogin);
				clickElement(clickLogin,obj_Name);
				Thread.sleep(5000);

				//Locate UserMenu
				setValue(6);
				By byUserMenu = getBy(locatorType,value);
				WebElement clickMenu = driver.findElement(byUserMenu);
				clickElement(clickMenu,obj_Name);

				//Locate Logout
				setValue(7);
				By byLogout = getBy(locatorType,value);
				WebElement clickLogout = driver.findElement(byLogout);
				clickElement(clickLogout,obj_Name);
				Thread.sleep(5000);

				//Get actual text
				setValue(1);
				By byUsernameafter = getBy(locatorType,value);
				WebElement ele_userNameafter = driver.findElement(byUsernameafter);
				String actual = getAttributeValue(ele_userNameafter) ;

				//Verify Result
				result = verify(expected,actual);
				System.out.println(result);
				Update_Report( result, "SFRemember_3",  "Execution Completed");
				driver.close();

			}
			bw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void sfForgotPassword()
	{
		try
		{
			startReport("SF_TestCase_4A","C:/Users/Seema/Desktop/Report/");
			String orPath = "C:/Users/Seema/Desktop/SF_DataFile/SF_ObjectRepository.xls";
			String tdPath = "C:/Users/Seema/Desktop/SF_DataFile/TestData_SalesForceForgotPassword.xls";
			readLocators(orPath);
			readTestData(tdPath);
			for(int i=1;i<data.length;i++)
			{
				String url = (String) data[i][0];
				String email = (String) data[i][1];
				String expected = (String) data[i][2];

				//Launch driver
				openConnection();
				driver.get(url);

				//Locate forgot link
				setValue(8);
				By byforgot = getBy(locatorType,value);
				WebElement ele_forgot = driver.findElement(byforgot);
				clickElement(ele_forgot,obj_Name);
				Thread.sleep(5000);

				//Locate email text box
				setValue(9);
				By byEmailBox = getBy(locatorType,value);
				WebElement ele_email =driver.findElement(byEmailBox);
				clear(ele_email);
				enterText(ele_email,email,obj_Name);

				//Locate continue button
				setValue(10);
				By byContinue = getBy(locatorType,value);
				WebElement clickContinue = driver.findElement(byContinue);
				clickElement(clickContinue,obj_Name);
				Thread.sleep(5000);

				//Get actual text
				setValue(11);
				By byMessage = getBy(locatorType,value);
				WebElement ele_Message = driver.findElement(byMessage);
				String actual = getTxt(ele_Message) ;

				//Verify Result
				result = verify(expected,actual);
				System.out.println(result);
				Update_Report( result, "SFForgot_4A",  "Execution Completed");
				driver.close();

			}
			bw.close();

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void sfUserDropDown()
	{
		try
		{
			startReport("SF_TestCase_5","C:/Users/Seema/Desktop/Report/");
			String orPath = "C:/Users/Seema/Desktop/SF_DataFile/SF_ObjectRepository.xls";
			String tdPath = "C:/Users/Seema/Desktop/SF_DataFile/TestData_SalesForceMenuDropDown.xls";
			readLocators(orPath);
			readTestData(tdPath);
			for(int i=1;i<data.length;i++)
			{
				String url = (String) data[i][0];
				String userName = (String) data[i][1];
				String password = (String) data[i][2];
				String expected = (String) data[i][3];
				String[] expectedValue = expected.split(",");

				//Launch driver
				openConnection();
				driver.get(url);

				//Locate userName
				setValue(1);
				By byUsername = getBy(locatorType,value);
				WebElement ele_userName = driver.findElement(byUsername);
				clear(ele_userName);
				enterText(ele_userName,userName,obj_Name);

				//Locate Password
				setValue(2);
				By bypassword = getBy(locatorType,value);
				WebElement ele_password =driver.findElement(bypassword);
				clear(ele_password);
				enterText(ele_password,password,obj_Name);

				//Locate Login
				setValue(3);
				By byLogin = getBy(locatorType,value);
				WebElement clickLogin = driver.findElement(byLogin);
				clickElement(clickLogin,obj_Name);
				Thread.sleep(5000);

				//Locate UserMenu
				setValue(6);
				By byUserMenu = getBy(locatorType,value);
				WebElement clickMenu = driver.findElement(byUserMenu);
				clickElement(clickMenu,obj_Name);
				Thread.sleep(5000);

				//Locate dropDown
				setValue(12);
				By byUserDropDown = getBy(locatorType,value);
				List<WebElement> dropdown = driver.findElements(byUserDropDown);
				String[] actual=null;
				int index=0;
				for(WebElement e: dropdown)
				{
					String s = e.getText();
					actual[index]=s;
					index++;
				}

				if(expectedValue.length==actual.length)
				{
					int x=0;
					result="Pass";
					while(x<actual.length)
					{
						if(!expectedValue[x].equals(actual[x]))
						{
							result="Fail";
							System.out.println("Fail");
							break;
						}
						x++;
					}
					System.out.println("Pass");
				}
				Update_Report( result, "SFUserMenuDropDown_5","Execution Completed");
				driver.close();
			}
			bw.close();
		}
		catch(Exception e)
		{

		}
	}

	public void sfMySettings()
	{
		try
		{
			startReport("SF_TestCase_7","C:/Users/Seema/Desktop/Report/");
			String orPath = "C:/Users/Seema/Desktop/SF_DataFile/SF_ObjectRepository.xls";
			String tdPath = "C:/Users/Seema/Desktop/SF_DataFile/TestData_SalesForceHistory.xls";
			readLocators(orPath);
			readTestData(tdPath);
			for(int i=1;i<data.length;i++)
			{
				String url = (String) data[i][0];
				String userName = (String) data[i][1];
				String password = (String) data[i][2];
				String expected = (String) data[i][3];


				//Launch driver
				openConnection();
				driver.get(url);

				//Locate userName
				setValue(1);
				By byUsername = getBy(locatorType,value);
				WebElement ele_userName = driver.findElement(byUsername);
				clear(ele_userName);
				enterText(ele_userName,userName,obj_Name);

				//Locate Password
				setValue(2);
				By bypassword = getBy(locatorType,value);
				WebElement ele_password =driver.findElement(bypassword);
				clear(ele_password);
				enterText(ele_password,password,obj_Name);

				//Locate Login
				setValue(3);
				By byLogin = getBy(locatorType,value);
				WebElement clickLogin = driver.findElement(byLogin);
				clickElement(clickLogin,obj_Name);
				Thread.sleep(5000);

				//Locate UserMenu
				setValue(6);
				By byUserMenu = getBy(locatorType,value);
				WebElement clickMenu = driver.findElement(byUserMenu);
				clickElement(clickMenu,obj_Name);
				Thread.sleep(5000);

				//Locate MySettings
				setValue(21);
				By byMySettings = getBy(locatorType,value);
				WebElement mySettings = driver.findElement(byMySettings);
				clickElement(mySettings,obj_Name);

				//Locate Personal tab
				setValue(22);
				By byPersonal = getBy(locatorType,value);
				WebElement personalTab = driver.findElement(byPersonal);
				clickElement(personalTab,obj_Name);
				Thread.sleep(3000);

				//Locate history tab
				setValue(23);
				By byHistory = getBy(locatorType,value);
				WebElement historyTab = driver.findElement(byHistory);
				clickElement(historyTab,obj_Name);
				Thread.sleep(3000);

				//Locate actual text
				setValue(24);
				By bytext = getBy(locatorType,value);
				WebElement historytext = driver.findElement(bytext);
				String actual =getTxt(historytext);

				//Verify history
				result = verify(expected,actual);
				System.out.println(result);
				Update_Report( result, "SFMySettings_History","Next Test");				

				//Locate display and layout
				setValue(25);
				By byDisplay = getBy(locatorType,value);
				WebElement displayLayout = driver.findElement(byDisplay);
				clickElement(displayLayout,obj_Name);
				Thread.sleep(2000);

				//Locate customize tab
				setValue(26);
				By byCustomize = getBy(locatorType,value);
				WebElement customize = driver.findElement(byCustomize);
				clickElement(customize,obj_Name);
				Thread.sleep(2000);

				//Locate custom App
				setValue(27);
				By byCustomApp = getBy(locatorType,value);
				WebElement customApp = driver.findElement(byCustomApp);
				Select select = new Select(customApp);
				select.selectByVisibleText("Salesforce Chatter");

				//Locate Available tab
				setValue(28);
				By byAvailTab = getBy(locatorType,value);
				WebElement AvailableTab = driver.findElement(byAvailTab);
				select = new Select(AvailableTab);
				select.selectByVisibleText("Reports");

				//Locate Add button
				setValue(29);
				By byaddBtn = getBy(locatorType,value);
				WebElement addbtn = driver.findElement(byaddBtn);
				clickElement(addbtn,obj_Name);
				Thread.sleep(3000);

				//Locate Select tab
				setValue(30);
				By bySelectTab = getBy(locatorType,value);
				WebElement selecttab = driver.findElement(bySelectTab);
				Select s = new Select(selecttab);
				List<WebElement> options = s.getOptions();
				ArrayList<String> actualStr=new ArrayList<String>();

				for(WebElement e: options)
				{
					String str = e.getText();
					actualStr.add(str);
				}

				//Locate save button
				setValue(31);
				By bysaveBtn = getBy(locatorType,value);
				WebElement saveBttn = driver.findElement(bysaveBtn);
				clickElement(saveBttn,obj_Name);

				//Verify 
				System.out.println(actualStr);
				if(actualStr.contains("Reports"))
				{
					result="Pass";
					System.out.println("Pass");
				}
				else
				{
					result="Fail";
					System.out.println("Fail");
				}
				Update_Report( result, "SFMySettings_DisplayLayout","Next test");

				//Locate Email 
				Thread.sleep(3000);
				setValue(32);
				By byemail = getBy(locatorType,value);
				WebElement emailLink = driver.findElement(byemail);
				clickElement(emailLink,obj_Name);

				//Locate my email setting
				setValue(33);
				By byemailSetting = getBy(locatorType,value);
				WebElement emailSetting = driver.findElement(byemailSetting);
				clickElement(emailSetting,obj_Name);
				Thread.sleep(3000);

				//Locate emailName
				setValue(34);
				By byemailName = getBy(locatorType,value);
				WebElement emailName = driver.findElement(byemailName);
				clear(emailName);
				enterText(emailName,"Siddhi Vijas","Email Name");

				//Locate email Id
				setValue(35);
				By byemailId = getBy(locatorType,value);
				WebElement emailId = driver.findElement(byemailId);
				clear(emailId);
				enterText(emailId,"seema.s.chindigiri@gmail.com","EmailId");

				//Locate save button
				setValue(36);
				By bysave = getBy(locatorType,value);
				WebElement save = driver.findElement(bysave);
				clickElement(save,"Save Button");

				//driver.switchTo().alert().accept();

				//Locate message
				Thread.sleep(3000);
				setValue(37);
				By byMessage = getBy(locatorType,value);
				WebElement message = driver.findElement(byMessage);
				String actualMessage=getTxt(message);

				System.out.println(actualMessage);
				result=verify("Your settings have been successfully saved.",actualMessage);
				System.out.println(result);
				Update_Report( result, "SFMySettings_Email","Next test");

				//Locate Calendar
				setValue(38);
				By byCalendar = getBy(locatorType,value);
				WebElement calendar = driver.findElement(byCalendar);
				clickElement(calendar,"Calendar");

				//Locate Reminder
				setValue(39);
				By byReminder = getBy(locatorType,value);
				WebElement reminder = driver.findElement(byReminder);
				clickElement(reminder,"Activity Reminder");
				Thread.sleep(3000);

				String oldWindow = driver.getWindowHandle();

				//Locate test reminder button
				setValue(40);
				By byreminderWin = getBy(locatorType,value);
				WebElement reminderWindow = driver.findElement(byreminderWin);
				clickElement(reminderWindow,"TestReminderButton");
				Thread.sleep(4000);
				Set<String> temp = driver.getWindowHandles();
				String actualTitle=null;
				for(String w:temp)
				{
					driver.switchTo().window(w);
					actualTitle = driver.getTitle();
				}
				driver.close();
				driver.switchTo().window(oldWindow);

				//Verify Title
				result=verify("2 Reminders",actualTitle);
				System.out.println(result);
				Update_Report( result, "SFMySettings_Calendar","Exceution Completd");	
			}
			bw.close();
		}
		catch(Exception e)
		{

		}
	}

	public void sfDeveloperConsole()
	{
		try
		{
			startReport("SF_TestCase_8","C:/Users/Seema/Desktop/Report/");
			String orPath = "C:/Users/Seema/Desktop/SF_DataFile/SF_ObjectRepository.xls";
			String tdPath = "C:/Users/Seema/Desktop/SF_DataFile/TestData_SalesForceDeveloperConsole.xls";
			readLocators(orPath);
			readTestData(tdPath);
			for(int i=1;i<data.length;i++)
			{
				String url = (String) data[i][0];
				String userName = (String) data[i][1];
				String password = (String) data[i][2];
				String expected = (String) data[i][3];

				//Launch driver
				openConnection();
				driver.get(url);

				//Locate userName
				setValue(1);
				By byUsername = getBy(locatorType,value);
				WebElement ele_userName = driver.findElement(byUsername);
				clear(ele_userName);
				enterText(ele_userName,userName,obj_Name);

				//Locate Password
				setValue(2);
				By bypassword = getBy(locatorType,value);
				WebElement ele_password =driver.findElement(bypassword);
				clear(ele_password);
				enterText(ele_password,password,obj_Name);

				//Locate Login
				setValue(3);
				By byLogin = getBy(locatorType,value);
				WebElement clickLogin = driver.findElement(byLogin);
				clickElement(clickLogin,obj_Name);
				Thread.sleep(5000);

				//Locate UserMenu
				setValue(6);
				By byUserMenu = getBy(locatorType,value);
				WebElement clickMenu = driver.findElement(byUserMenu);
				clickElement(clickMenu,obj_Name);
				Thread.sleep(5000);

				String oldWindow = driver.getWindowHandle();

				//Locate DeveloperConsole
				setValue(41);
				By byDConsole = getBy(locatorType,value);
				WebElement clickConsole = driver.findElement(byDConsole);
				clickElement(clickConsole,obj_Name);
				Thread.sleep(5000);

				Set<String> temp = driver.getWindowHandles();
				String actual=null;
				for(String s: temp)
				{
					driver.switchTo().window(s);
					actual = driver.getTitle();
				}
				driver.close();

				driver.switchTo().window(oldWindow);
				System.out.println(actual);

				//Verify Result
				result = verify(expected,actual);
				System.out.println(result);
				Update_Report( result, "SFDCLogin_8",  "Execution Completed");
				driver.close();

			}
			bw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void sfLogout()
	{
		try
		{
			startReport("SF_TestCase_9","C:/Users/Seema/Desktop/Report/");
			String orPath = "C:/Users/Seema/Desktop/SF_DataFile/SF_ObjectRepository.xls";
			String tdPath = "C:/Users/Seema/Desktop/SF_DataFile/TestData_SalesForceLogout.xls";
			readLocators(orPath);
			readTestData(tdPath);
			for(int i=1;i<data.length;i++)
			{
				String url = (String) data[i][0];
				String userName = (String) data[i][1];
				String password = (String) data[i][2];
				String expected = (String) data[i][3];

				//Launch driver
				openConnection();
				driver.get(url);

				//Locate userName
				setValue(1);
				By byUsername = getBy(locatorType,value);
				WebElement ele_userName = driver.findElement(byUsername);
				clear(ele_userName);
				enterText(ele_userName,userName,obj_Name);

				//Locate Password
				setValue(2);
				By bypassword = getBy(locatorType,value);
				WebElement ele_password =driver.findElement(bypassword);
				clear(ele_password);
				enterText(ele_password,password,obj_Name);

				//Locate Login
				setValue(3);
				By byLogin = getBy(locatorType,value);
				WebElement clickLogin = driver.findElement(byLogin);
				clickElement(clickLogin,obj_Name);
				Thread.sleep(5000);

				//Locate UserMenu
				setValue(6);
				By byUserMenu = getBy(locatorType,value);
				WebElement clickMenu = driver.findElement(byUserMenu);
				clickElement(clickMenu,obj_Name);
				Thread.sleep(5000);

				//Locate Logout
				setValue(7);
				By byLogout = getBy(locatorType,value);
				WebElement clickLogout = driver.findElement(byLogout);
				clickElement(clickLogout,obj_Name);
				Thread.sleep(5000);

				String actual = driver.getTitle();

				//Verify result
				result = verify(expected,actual);
				System.out.println(result);
				Update_Report( result, "SFDCLogout_9",  "Execution Completed");
				driver.close();
			}
			bw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

	public void sfAccount()
	{
		try
		{
			startReport("SF_TestCase_10","C:/Users/Seema/Desktop/Report/");
			String orPath = "C:/Users/Seema/Desktop/SF_DataFile/SF_ObjectRepository.xls";
			String tdPath = "C:/Users/Seema/Desktop/SF_DataFile/TestData_SalesForceAccountTab.xls";
			readLocators(orPath);
			readTestData(tdPath);

			for(int i=1;i<data.length;i++)
			{
				String url = (String) data[i][0];
				String userName = (String) data[i][1];
				String password = (String) data[i][2];
				String accountName= (String) data[i][3];
				String expected = (String) data[i][4];

				//Launch driver
				openConnection();
				driver.get(url);

				//Locate userName
				setValue(1);
				By byUsername = getBy(locatorType,value);
				WebElement ele_userName = driver.findElement(byUsername);
				clear(ele_userName);
				enterText(ele_userName,userName,obj_Name);

				//Locate Password
				setValue(2);
				By bypassword = getBy(locatorType,value);
				WebElement ele_password =driver.findElement(bypassword);
				clear(ele_password);
				enterText(ele_password,password,obj_Name);

				//Locate Login
				setValue(3);
				By byLogin = getBy(locatorType,value);
				WebElement clickLogin = driver.findElement(byLogin);
				clickElement(clickLogin,obj_Name);
				Thread.sleep(5000);

				//Locate AccountTab
				setValue(42);
				By byaccount = getBy(locatorType,value);
				WebElement clickAccount = driver.findElement(byaccount);
				clickElement(clickAccount,obj_Name);
				Thread.sleep(3000);

				//Locate New
				setValue(43);
				By bynew = getBy(locatorType,value);
				WebElement clickNew = driver.findElement(bynew);
				clickElement(clickNew,obj_Name);
				Thread.sleep(3000);

				//Locate  create account Name
				setValue(44);
				By byAccountName = getBy(locatorType,value);
				WebElement ele_accountname =driver.findElement(byAccountName);
				clear(ele_accountname);
				enterText(ele_accountname,accountName,obj_Name);

				//Locate save button
				setValue(45);
				By bysave = getBy(locatorType,value);
				WebElement clickSave = driver.findElement(bysave);
				clickElement(clickSave,obj_Name);
				Thread.sleep(3000);

				//Locate Actual
				setValue(46);
				By byText = getBy(locatorType,value);
				WebElement ele_txt = driver.findElement(byText);
				String actual = getTxt(ele_txt);

				//Verify result
				result = verify(expected,actual);
				System.out.println(result);
				Update_Report( result, "SFAccountTab_10",  "Execution Completed");
				driver.close();
			}
			bw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void sfAccountView()
	{
		try
		{
			startReport("SF_TestCase_11","C:/Users/Seema/Desktop/Report/");
			String orPath = "C:/Users/Seema/Desktop/SF_DataFile/SF_ObjectRepository.xls";
			String tdPath = "C:/Users/Seema/Desktop/SF_DataFile/TestData_SalesForceAccountView.xls";
			readLocators(orPath);
			readTestData(tdPath);

			for(int i=1;i<data.length;i++)
			{
				String url = (String) data[i][0];
				String userName = (String) data[i][1];
				String password = (String) data[i][2];
				String ViewName = (String) data[i][3];
				String ViewUName = (String) data[i][4];
				String expected = (String) data[i][5];

				//Launch driver
				openConnection();
				driver.get(url);

				//Locate userName
				setValue(1);
				By byUsername = getBy(locatorType,value);
				WebElement ele_userName = driver.findElement(byUsername);
				clear(ele_userName);
				enterText(ele_userName,userName,obj_Name);

				//Locate Password
				setValue(2);
				By bypassword = getBy(locatorType,value);
				WebElement ele_password =driver.findElement(bypassword);
				clear(ele_password);
				enterText(ele_password,password,obj_Name);

				//Locate Login
				setValue(3);
				By byLogin = getBy(locatorType,value);
				WebElement clickLogin = driver.findElement(byLogin);
				clickElement(clickLogin,obj_Name);
				Thread.sleep(5000);

				//Locate AccountTab
				setValue(42);
				By byaccount = getBy(locatorType,value);
				WebElement clickAccount = driver.findElement(byaccount);
				clickElement(clickAccount,obj_Name);
				Thread.sleep(3000);

				//Locate CreateNewView
				setValue(47);
				By byview = getBy(locatorType,value);
				WebElement clickView = driver.findElement(byview);
				clickElement(clickView,obj_Name);
				Thread.sleep(3000);

				//Locate viewName
				setValue(48);
				By byViewName = getBy(locatorType,value);
				WebElement ele_ViewName =driver.findElement(byViewName);
				clear(ele_ViewName);
				enterText(ele_ViewName,ViewName,obj_Name);

				//Locate view Unique Name
				setValue(49);
				By byViewUName = getBy(locatorType,value);
				WebElement ele_ViewUName =driver.findElement(byViewUName);
				clear(ele_ViewUName);
				enterText(ele_ViewUName,ViewUName,obj_Name);

				//Locate save button
				setValue(50);
				By bySaveView = getBy(locatorType,value);
				WebElement ele_SaveView =driver.findElement(bySaveView);
				clickElement(ele_SaveView,obj_Name);
				Thread.sleep(5000);

				//get actual
				setValue(51);
				By byText = getBy(locatorType,value);
				WebElement ele_txt = driver.findElement(byText);
				String actual = ele_txt.getText();
				System.out.println(actual);

				//Verify result
				result = verify(expected,actual);
				System.out.println(result);
				Update_Report( result, "SFAccountTab_11",  "Execution Completed");
				driver.close();
			}
			bw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void sfAccountEditView()
	{
		try
		{
			startReport("SF_TestCase_12","C:/Users/Seema/Desktop/Report/");
			String orPath = "C:/Users/Seema/Desktop/SF_DataFile/SF_ObjectRepository.xls";
			String tdPath = "C:/Users/Seema/Desktop/SF_DataFile/TestData_SalesForceAccountViewEdit.xls";
			readLocators(orPath);
			readTestData(tdPath);

			for(int i=1;i<data.length;i++)
			{
				String url = (String) data[i][0];
				String userName = (String) data[i][1];
				String password = (String) data[i][2];
				String ViewName = (String) data[i][3];
				String newName = (String) data[i][4];
				String expected = (String) data[i][5];

				//Launch driver
				openConnection();
				driver.get(url);

				//Locate userName
				setValue(1);
				By byUsername = getBy(locatorType,value);
				WebElement ele_userName = driver.findElement(byUsername);
				clear(ele_userName);
				enterText(ele_userName,userName,obj_Name);

				//Locate Password
				setValue(2);
				By bypassword = getBy(locatorType,value);
				WebElement ele_password =driver.findElement(bypassword);
				clear(ele_password);
				enterText(ele_password,password,obj_Name);

				//Locate Login
				setValue(3);
				By byLogin = getBy(locatorType,value);
				WebElement clickLogin = driver.findElement(byLogin);
				clickElement(clickLogin,obj_Name);
				Thread.sleep(5000);

				//Locate AccountTab
				setValue(42);
				By byaccount = getBy(locatorType,value);
				WebElement clickAccount = driver.findElement(byaccount);
				clickElement(clickAccount,obj_Name);
				Thread.sleep(5000);

				//Locate Account Folder
				setValue(52);
				By byaccountfolder = getBy(locatorType,value);
				WebElement account = driver.findElement(byaccountfolder);
				clickElement(account,obj_Name);
				Thread.sleep(3000);
				Select s = new Select(account);
				s.selectByVisibleText(ViewName);

				//Locate edit
				setValue(53);
				By byedit = getBy(locatorType,value);
				WebElement clickEdit = driver.findElement(byedit);
				clickElement(clickEdit,obj_Name);
				Thread.sleep(3000);

				//Locate viewName
				setValue(48);
				By byViewName = getBy(locatorType,value);
				WebElement ele_ViewName =driver.findElement(byViewName);
				clear(ele_ViewName);
				enterText(ele_ViewName,newName,obj_Name);

				//Locate save button
				setValue(50);
				By bySaveView = getBy(locatorType,value);
				WebElement ele_SaveView =driver.findElement(bySaveView);
				clickElement(ele_SaveView,obj_Name);
				Thread.sleep(5000);

				//get actual
				setValue(51);
				By byText = getBy(locatorType,value);
				WebElement ele_txt = driver.findElement(byText);
				String actual = ele_txt.getText();
				System.out.println(actual);

				//Verify result
				result = verify(expected,actual);
				System.out.println(result);
				Update_Report( result, "SFAccountTab_12",  "Execution Completed");
				driver.close();
			}
			bw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void sfMergeAccounts()
	{
		try
		{
			startReport("SF_TestCase_13s","C:/Users/Seema/Desktop/Report/");
			String orPath = "C:/Users/Seema/Desktop/SF_DataFile/SF_ObjectRepository.xls";
			String tdPath = "C:/Users/Seema/Desktop/SF_DataFile/TestData_SalesForceMergeAccount.xls";
			readLocators(orPath);
			readTestData(tdPath);

			for(int i=1;i<data.length;i++)
			{
				String url = (String) data[i][0];
				String userName = (String) data[i][1];
				String password = (String) data[i][2];
				String accountName = (String) data[i][3];
				String expected = (String) data[i][4];

				//Launch driver
				openConnection();
				driver.get(url);

				//Locate userName
				setValue(1);
				By byUsername = getBy(locatorType,value);
				WebElement ele_userName = driver.findElement(byUsername);
				clear(ele_userName);
				enterText(ele_userName,userName,obj_Name);

				//Locate Password
				setValue(2);
				By bypassword = getBy(locatorType,value);
				WebElement ele_password =driver.findElement(bypassword);
				clear(ele_password);
				enterText(ele_password,password,obj_Name);

				//Locate Login
				setValue(3);
				By byLogin = getBy(locatorType,value);
				WebElement clickLogin = driver.findElement(byLogin);
				clickElement(clickLogin,obj_Name);
				Thread.sleep(5000);

				//Locate AccountTab
				setValue(42);
				By byaccount = getBy(locatorType,value);
				WebElement clickAccount = driver.findElement(byaccount);
				clickElement(clickAccount,obj_Name);
				Thread.sleep(3000);

				//Locate Merge Accounts
				setValue(54);
				By byMerge = getBy(locatorType,value);
				WebElement clickMerge = driver.findElement(byMerge);
				clickElement(clickMerge,obj_Name);
				Thread.sleep(4000);

				//Locate  Account
				setValue(55);
				By byAcc = getBy(locatorType,value);
				WebElement AccName = driver.findElement(byAcc);
				clear(AccName);
				enterText(AccName,accountName,obj_Name);

				//Locate find account button
				setValue(56);
				By byFindBtn = getBy(locatorType,value);
				WebElement clickFBtn = driver.findElement(byFindBtn);
				clickElement(clickFBtn,obj_Name);
				Thread.sleep(4000);

				//Locate table and select values
				setValue(57);
				By byTable = getBy(locatorType,value);
				List<WebElement> table = driver.findElements(byTable);
				driver.findElement(By.xpath("//*[@id='cid0']")).click();
				driver.findElement(By.xpath("//*[@id='cid1']")).click();	

				//Locate Next
				setValue(58);
				By byNextBtn = getBy(locatorType,value);
				WebElement clickNextBtn = driver.findElement(byNextBtn);
				clickElement(clickNextBtn,obj_Name);
				Thread.sleep(4000);

				//Locate Merge Button
				setValue(59);
				By byMergeBtn = getBy(locatorType,value);
				WebElement clickMergeBtn = driver.findElement(byMergeBtn);
				clickElement(clickMergeBtn,obj_Name);
				Thread.sleep(4000);

				driver.switchTo().alert().accept();

				driver.switchTo().defaultContent();


				Thread.sleep(5000);
				//get actual

				String actual = driver.getTitle();
				System.out.println(actual);
				System.out.println(expected);

				//Verify result
				result = verify(expected,actual);
				System.out.println(result);
				Update_Report( result, "SFAccountTab_13",  "Execution Completed");
				driver.close();
			}
			bw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void sfReport()
	{
		try
		{
			startReport("SF_TestCase_14","C:/Users/Seema/Desktop/Report/");
			String orPath = "C:/Users/Seema/Desktop/SF_DataFile/SF_ObjectRepository.xls";
			String tdPath = "C:/Users/Seema/Desktop/SF_DataFile/TestData_SalesForceAccountReport.xls";
			readLocators(orPath);
			readTestData(tdPath);

			for(int i=1;i<data.length;i++)
			{
				String url = (String) data[i][0];
				String userName = (String) data[i][1];
				String password = (String) data[i][2];
				String dateText = (String) data[i][3];
				String expected = (String) data[i][4];

				//Launch driver
				openConnection();
				driver.get(url);

				//Locate userName
				setValue(1);
				By byUsername = getBy(locatorType,value);
				WebElement ele_userName = driver.findElement(byUsername);
				clear(ele_userName);
				enterText(ele_userName,userName,obj_Name);

				//Locate Password
				setValue(2);
				By bypassword = getBy(locatorType,value);
				WebElement ele_password =driver.findElement(bypassword);
				clear(ele_password);
				enterText(ele_password,password,obj_Name);

				//Locate Login
				setValue(3);
				By byLogin = getBy(locatorType,value);
				WebElement clickLogin = driver.findElement(byLogin);
				clickElement(clickLogin,obj_Name);
				Thread.sleep(5000);

				//Locate AccountTab
				setValue(42);
				By byaccount = getBy(locatorType,value);
				WebElement clickAccount = driver.findElement(byaccount);
				clickElement(clickAccount,obj_Name);
				Thread.sleep(3000);

				//Locate Report Link
				setValue(60);
				By byReport = getBy(locatorType,value);
				WebElement report = driver.findElement(byReport);
				clickElement(report,obj_Name);
				Thread.sleep(3000);

				//Locate Date field
				setValue(61);
				By byDate = getBy(locatorType,value);
				WebElement date = driver.findElement(byDate);
				clickElement(date,obj_Name);
				
				
				
				
				//Locate dropdown
				driver.findElement(By.xpath("//*[@id='ext-gen267']/div/div[3]")).click();
				
				
				
			//Locate from date
				setValue(62);
				By byfrom = getBy(locatorType,value);
				WebElement fromDate = driver.findElement(byfrom);
				clickElement(fromDate,obj_Name);

				//Select frome date
				setValue(63);
				By byfromday = getBy(locatorType,value);
				WebElement fromDay = driver.findElement(byfromday);
				clickElement(fromDay,obj_Name);

				//Locate to date
				setValue(64);
				By byTo = getBy(locatorType,value);
				WebElement ToDate = driver.findElement(byTo);
				clickElement(ToDate,obj_Name);

				//Select to date
				setValue(65);
				By bytoday = getBy(locatorType,value);
				WebElement toDay = driver.findElement(bytoday);
				clickElement(toDay,obj_Name);

				//Select run report
				setValue(66);
				By byreport = getBy(locatorType,value);
				WebElement reportbtn = driver.findElement(byreport);
				clickElement(reportbtn,obj_Name);

				Thread.sleep(5000);

				String actual = driver.getTitle();
				System.out.println(actual);
				System.out.println(expected);

				//Verify result
				result = verify(expected,actual);
				System.out.println(result);
				Update_Report( result, "SFAccountTab_14",  "Execution Completed");
				driver.close();
			}
			bw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void sfOpportunity()
	{
		try
		{
			startReport("SF_TestCase_15","C:/Users/Seema/Desktop/Report/");
			String orPath = "C:/Users/Seema/Desktop/SF_DataFile/SF_ObjectRepository.xls";
			String tdPath = "C:/Users/Seema/Desktop/SF_DataFile/TestData_SalesForceOpportunityTab.xls";
			readLocators(orPath);
			readTestData(tdPath);

			for(int i=1;i<data.length;i++)
			{
				String url = (String) data[i][0];
				String userName = (String) data[i][1];
				String password = (String) data[i][2];
				String text=(String) data[i][3];
				String[] expected = text.split(",");
						

				//Launch driver
				openConnection();
				driver.get(url);

				//Locate userName
				setValue(1);
				By byUsername = getBy(locatorType,value);
				WebElement ele_userName = driver.findElement(byUsername);
				clear(ele_userName);
				enterText(ele_userName,userName,obj_Name);

				//Locate Password
				setValue(2);
				By bypassword = getBy(locatorType,value);
				WebElement ele_password =driver.findElement(bypassword);
				clear(ele_password);
				enterText(ele_password,password,obj_Name);

				//Locate Login
				setValue(3);
				By byLogin = getBy(locatorType,value);
				WebElement clickLogin = driver.findElement(byLogin);
				clickElement(clickLogin,obj_Name);
				Thread.sleep(5000);

				//Locate opportunity tab
				setValue(68);
				By byopp= getBy(locatorType,value);
				WebElement clickOpp = driver.findElement(byopp);
				clickElement(clickOpp,obj_Name);
				Thread.sleep(3000);
				
				//Locate DropDown
				setValue(69);
				By oppdropdown= getBy(locatorType,value);
				WebElement Opp = driver.findElement(oppdropdown);
				Select s = new Select(Opp);
				List<WebElement> ele = s.getOptions();
				String[] options = new String[ele.size()];
				int index=0;
				for(WebElement e: ele)
				{
					String str = e.getText();
					options[index]=str;
					index++;
				}

				if(expected.length==options.length)
				{
					int x=0;
					result="Pass";
					while(x<options.length)
					{
						if(!expected[x].equals(options[x]))
						{
							result="Fail";
							System.out.println("Fail");
							break;
						}
						x++;
					}
					
				}
				else
				{
					result="Fail";
				}

				//Verify result
				System.out.println(result);
				Update_Report( result, "SFAccountTab_15",  "Execution Completed");
				driver.close();
			}
			bw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

public void sfOppNew()
{
	try
	{
		startReport("SF_TestCase_16","C:/Users/Seema/Desktop/Report/");
		String orPath = "C:/Users/Seema/Desktop/SF_DataFile/SF_ObjectRepository.xls";
		String tdPath = "C:/Users/Seema/Desktop/SF_DataFile/TestData_SalesForceOpportunityNew.xls";
		readLocators(orPath);
		readTestData(tdPath);

		for(int i=1;i<data.length;i++)
		{
			String url = (String) data[i][0];
			String userName = (String) data[i][1];
			String password = (String) data[i][2];
			String OppName = (String) data[i][3];
			String accountName= (String) data[i][4];
			String date = (String) data[i][5];
			String stageValue= (String) data[i][6];
			String propbability = (String) data[i][7];
			String leadSource = (String) data[i][8];
			String expected=(String) data[i][9];		

			//Launch driver
			openConnection();
			driver.get(url);

			//Locate userName
			setValue(1);
			By byUsername = getBy(locatorType,value);
			WebElement ele_userName = driver.findElement(byUsername);
			clear(ele_userName);
			enterText(ele_userName,userName,obj_Name);

			//Locate Password
			setValue(2);
			By bypassword = getBy(locatorType,value);
			WebElement ele_password =driver.findElement(bypassword);
			clear(ele_password);
			enterText(ele_password,password,obj_Name);

			//Locate Login
			setValue(3);
			By byLogin = getBy(locatorType,value);
			WebElement clickLogin = driver.findElement(byLogin);
			clickElement(clickLogin,obj_Name);
			Thread.sleep(5000);

			//Locate opportunity tab
			setValue(68);
			By byopp= getBy(locatorType,value);
			WebElement clickOpp = driver.findElement(byopp);
			clickElement(clickOpp,obj_Name);
			Thread.sleep(3000);
			
			//Locate New
			setValue(70);
			By byNew= getBy(locatorType,value);
			WebElement newBtn = driver.findElement(byNew);
			clickElement(newBtn,obj_Name);
			Thread.sleep(5000);
			
			//Locate Oppname
			setValue(71);
			By byOppname = getBy(locatorType,value);
			WebElement ele_oppName =driver.findElement(byOppname);
			clear(ele_oppName);
			enterText(ele_oppName,OppName,obj_Name);
			
			//Locate account name
			setValue(72);
			By byOppAcc = getBy(locatorType,value);
			WebElement ele_oppAcc =driver.findElement(byOppAcc);
			clear(ele_oppAcc);
			enterText(ele_oppAcc,accountName,obj_Name);
			
			//Locate date
			setValue(73);
			By byOppdate = getBy(locatorType,value);
			WebElement ele_oppdate =driver.findElement(byOppdate);
			clickElement(ele_oppdate,obj_Name);
			
			//Locate prob
			setValue(76);
			By byOppProb = getBy(locatorType,value);
			WebElement ele_oppprob =driver.findElement(byOppProb);
			clear(ele_oppprob);
			enterText(ele_oppprob,propbability,obj_Name);
			
			//Locate Stage dropdown
			setValue(74);
			By stagedropdown= getBy(locatorType,value);
			WebElement stage = driver.findElement(stagedropdown);
			Select s = new Select(stage);
			s.selectByVisibleText(stageValue);
			
			//Locate LeadSource dropdown
			setValue(75);
			By leaddropdown= getBy(locatorType,value);
			WebElement lead = driver.findElement(leaddropdown);
			s = new Select(lead);
			s.selectByValue(leadSource);
			
			Thread.sleep(5000);
			
			//Locate Save button
			setValue(77);
			By bysave= getBy(locatorType,value);
			WebElement saveBtn = driver.findElement(bysave);
			clickElement(saveBtn,obj_Name);
			Thread.sleep(5000);

			String actual = driver.getTitle();
			System.out.println(actual);
			System.out.println(expected);
			expected=expected.trim();
			actual=actual.trim();
			//Verify result
			result = verify(expected,actual);
			System.out.println(result);
			Update_Report( result, "SFAccountTab_16",  "Execution Completed");
			driver.close();
		}
		bw.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}

public void oppPipeLine()
{
	try
	{
		startReport("SF_TestCase_17","C:/Users/Seema/Desktop/Report/");
		String orPath = "C:/Users/Seema/Desktop/SF_DataFile/SF_ObjectRepository.xls";
		String tdPath = "C:/Users/Seema/Desktop/SF_DataFile/TestData_SalesForceOpportunitypipe.xls";
		readLocators(orPath);
		readTestData(tdPath);

		for(int i=1;i<data.length;i++)
		{
			String url = (String) data[i][0];
			String userName = (String) data[i][1];
			String password = (String) data[i][2];
			String expected=(String) data[i][3];		

			//Launch driver
			openConnection();
			driver.get(url);

			//Locate userName
			setValue(1);
			By byUsername = getBy(locatorType,value);
			WebElement ele_userName = driver.findElement(byUsername);
			clear(ele_userName);
			enterText(ele_userName,userName,obj_Name);

			//Locate Password
			setValue(2);
			By bypassword = getBy(locatorType,value);
			WebElement ele_password =driver.findElement(bypassword);
			clear(ele_password);
			enterText(ele_password,password,obj_Name);

			//Locate Login
			setValue(3);
			By byLogin = getBy(locatorType,value);
			WebElement clickLogin = driver.findElement(byLogin);
			clickElement(clickLogin,obj_Name);
			Thread.sleep(5000);

			//Locate opportunity tab
			setValue(68);
			By byopp= getBy(locatorType,value);
			WebElement clickOpp = driver.findElement(byopp);
			clickElement(clickOpp,obj_Name);
			Thread.sleep(3000);
			
			//Locate opp pipe
			setValue(78);
			By byopppipe= getBy(locatorType,value);
			WebElement clickOpppipe = driver.findElement(byopppipe);
			clickElement(clickOpppipe,obj_Name);
			Thread.sleep(3000);
			
			String actual = driver.getTitle();
			
			//Verify result
			result = verify(expected,actual);
			System.out.println(result);
			Update_Report( result, "SFOppTab_17",  "Execution Completed");
			driver.close();
		}
		bw.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
}

public void sfOppStuck()
{
	try
	{
		startReport("SF_TestCase_18","C:/Users/Seema/Desktop/Report/");
		String orPath = "C:/Users/Seema/Desktop/SF_DataFile/SF_ObjectRepository.xls";
		String tdPath = "C:/Users/Seema/Desktop/SF_DataFile/TestData_SalesForceOpportunityStuck.xls";
		readLocators(orPath);
		readTestData(tdPath);

		for(int i=1;i<data.length;i++)
		{
			String url = (String) data[i][0];
			String userName = (String) data[i][1];
			String password = (String) data[i][2];
			String expected=(String) data[i][3];		

			//Launch driver
			openConnection();
			driver.get(url);

			//Locate userName
			setValue(1);
			By byUsername = getBy(locatorType,value);
			WebElement ele_userName = driver.findElement(byUsername);
			clear(ele_userName);
			enterText(ele_userName,userName,obj_Name);

			//Locate Password
			setValue(2);
			By bypassword = getBy(locatorType,value);
			WebElement ele_password =driver.findElement(bypassword);
			clear(ele_password);
			enterText(ele_password,password,obj_Name);

			//Locate Login
			setValue(3);
			By byLogin = getBy(locatorType,value);
			WebElement clickLogin = driver.findElement(byLogin);
			clickElement(clickLogin,obj_Name);
			Thread.sleep(5000);

			//Locate opportunity tab
			setValue(68);
			By byopp= getBy(locatorType,value);
			WebElement clickOpp = driver.findElement(byopp);
			clickElement(clickOpp,obj_Name);
			Thread.sleep(3000);
			
			//Locate opp Stuck
			setValue(79);
			By byoppstuck= getBy(locatorType,value);
			WebElement clickOppStuck = driver.findElement(byoppstuck);
			clickElement(clickOppStuck,obj_Name);
			Thread.sleep(3000);
			
			String actual = driver.getTitle();
			
			//Verify result
			result = verify(expected,actual);
			System.out.println(result);
			Update_Report( result, "SFOppTab_18",  "Execution Completed");
			driver.close();
		}
		bw.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}

public void sfSummary()
{
	try
	{
		startReport("SF_TestCase_19","C:/Users/Seema/Desktop/Report/");
		String orPath = "C:/Users/Seema/Desktop/SF_DataFile/SF_ObjectRepository.xls";
		String tdPath = "C:/Users/Seema/Desktop/SF_DataFile/TestData_SalesForceOpportunitySummary.xls";
		readLocators(orPath);
		readTestData(tdPath);

		for(int i=1;i<data.length;i++)
		{
			String url = (String) data[i][0];
			String userName = (String) data[i][1];
			String password = (String) data[i][2];
			String Interval = (String) data[i][3];
			String Include = (String) data[i][4];
			String expected=(String) data[i][5];		

			//Launch driver
			openConnection();
			driver.get(url);

			//Locate userName
			setValue(1);
			By byUsername = getBy(locatorType,value);
			WebElement ele_userName = driver.findElement(byUsername);
			clear(ele_userName);
			enterText(ele_userName,userName,obj_Name);

			//Locate Password
			setValue(2);
			By bypassword = getBy(locatorType,value);
			WebElement ele_password =driver.findElement(bypassword);
			clear(ele_password);
			enterText(ele_password,password,obj_Name);

			//Locate Login
			setValue(3);
			By byLogin = getBy(locatorType,value);
			WebElement clickLogin = driver.findElement(byLogin);
			clickElement(clickLogin,obj_Name);
			Thread.sleep(5000);

			//Locate opportunity tab
			setValue(68);
			By byopp= getBy(locatorType,value);
			WebElement clickOpp = driver.findElement(byopp);
			clickElement(clickOpp,obj_Name);
			Thread.sleep(3000);
			
			//Locate Opp interval'
			setValue(80);
			By byInt= getBy(locatorType,value);
			WebElement Int = driver.findElement(byInt);
			Select s = new Select(Int);
			s.selectByVisibleText(Interval);
			
			//Locate Opp Include
			setValue(81);
			By byInc= getBy(locatorType,value);
			WebElement Inc = driver.findElement(byInc);
			s= new Select(Inc);
			s.selectByVisibleText(Include);
			
			//Locate run report
			setValue(82);
			By byRep= getBy(locatorType,value);
			WebElement Rep = driver.findElement(byRep);
			clickElement(Rep,obj_Name);
			Thread.sleep(5000);
			
			
			String actual = driver.getTitle();
			
			//Verify result
			result = verify(expected,actual);
			System.out.println(result);
			Update_Report( result, "SFOppTab_19",  "Execution Completed");
			driver.close();
		}
		bw.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}

public void sfLeadTab()
{
	try
	{
		startReport("SF_TestCase_20","C:/Users/Seema/Desktop/Report/");
		String orPath = "C:/Users/Seema/Desktop/SF_DataFile/SF_ObjectRepository.xls";
		String tdPath = "C:/Users/Seema/Desktop/SF_DataFile/TestData_SalesForceLeadTab.xls";
		readLocators(orPath);
		readTestData(tdPath);

		for(int i=1;i<data.length;i++)
		{
			String url = (String) data[i][0];
			String userName = (String) data[i][1];
			String password = (String) data[i][2];
			String expected=(String) data[i][3];		

			//Launch driver
			openConnection();
			driver.get(url);

			//Locate userName
			setValue(1);
			By byUsername = getBy(locatorType,value);
			WebElement ele_userName = driver.findElement(byUsername);
			clear(ele_userName);
			enterText(ele_userName,userName,obj_Name);

			//Locate Password
			setValue(2);
			By bypassword = getBy(locatorType,value);
			WebElement ele_password =driver.findElement(bypassword);
			clear(ele_password);
			enterText(ele_password,password,obj_Name);

			//Locate Login
			setValue(3);
			By byLogin = getBy(locatorType,value);
			WebElement clickLogin = driver.findElement(byLogin);
			clickElement(clickLogin,obj_Name);
			Thread.sleep(5000);

			//Locate Lead tab
			setValue(83);
			By bylead = getBy(locatorType,value);
			WebElement clickLead = driver.findElement(bylead);
			clickElement(clickLead,obj_Name);
			Thread.sleep(5000);
			
			String actual = driver.getTitle();
			
			//Verify result
			result = verify(expected,actual);
			System.out.println(result);
			Update_Report( result, "SFLeadTab_20",  "Execution Completed");
			driver.close();
		}
		bw.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}

public void sfLeadDropdown()
{
	try
	{
		startReport("SF_TestCase_21","C:/Users/Seema/Desktop/Report/");
		String orPath = "C:/Users/Seema/Desktop/SF_DataFile/SF_ObjectRepository.xls";
		String tdPath = "C:/Users/Seema/Desktop/SF_DataFile/TestData_SalesForceLeadDD.xls";
		readLocators(orPath);
		readTestData(tdPath);

		for(int i=1;i<data.length;i++)
		{
			String url = (String) data[i][0];
			String userName = (String) data[i][1];
			String password = (String) data[i][2];
			String text=(String) data[i][3];
			String[] expected=text.split(",");

			//Launch driver
			openConnection();
			driver.get(url);

			//Locate userName
			setValue(1);
			By byUsername = getBy(locatorType,value);
			WebElement ele_userName = driver.findElement(byUsername);
			clear(ele_userName);
			enterText(ele_userName,userName,obj_Name);

			//Locate Password
			setValue(2);
			By bypassword = getBy(locatorType,value);
			WebElement ele_password =driver.findElement(bypassword);
			clear(ele_password);
			enterText(ele_password,password,obj_Name);

			//Locate Login
			setValue(3);
			By byLogin = getBy(locatorType,value);
			WebElement clickLogin = driver.findElement(byLogin);
			clickElement(clickLogin,obj_Name);
			Thread.sleep(5000);

			//Locate Lead tab
			setValue(83);
			By bylead = getBy(locatorType,value);
			WebElement clickLead = driver.findElement(bylead);
			clickElement(clickLead,obj_Name);
			Thread.sleep(5000);
			
			//Lead dropdown
			setValue(84);
			By byleaddd = getBy(locatorType,value);
			WebElement clickLeadDD = driver.findElement(byleaddd);
			Select s = new Select(clickLeadDD);
			List<WebElement> ele = s.getOptions();
			String[] options = new String[ele.size()];
			int index=0;
			for(WebElement e: ele)
			{
				String str = e.getText();
				options[index]=str;
				index++;
			}

			if(expected.length==options.length)
			{
				int x=0;
				result="Pass";
				while(x<options.length)
				{
					if(!expected[x].equals(options[x]))
					{
						result="Fail";
						System.out.println("Fail");
						break;
					}
					x++;
				}
				
			}
			else
			{
				result="Fail";
			}
			
			
			
			
			
			//Verify result
			
			System.out.println(result);
			Update_Report( result, "SFLeadTab_21",  "Execution Completed");
			driver.close();
		}
		bw.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
}



}
