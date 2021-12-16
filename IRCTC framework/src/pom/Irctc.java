package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.Autoconstant;
import generics.Basepage;
import generics.Excellibrary;

public class Irctc extends Basepage implements Autoconstant
{
 @FindBy(xpath="//input[@id='userName']")
 private WebElement usernamefield;
 
 @FindBy(xpath="//input[@id='usrPwd']")
 private WebElement passwordfield;
 
 @FindBy(xpath="//input[@id='cnfUsrPwd']")
 private WebElement confirmpasswordfield;
 
 @FindBy(xpath="//label[.='Select Security Question']")
 private WebElement securityquestiondropdown;
 
 @FindBy(xpath="(//input[@type='text'])[3]")
 private WebElement securityanswerdropdown;
 
 @FindBy(xpath="//label[.='Select Preferred Language']")
 private WebElement preferedlanguagedropdown;
 
 @FindBy(xpath="//input[@id='firstName']")
 private WebElement firstnametextfield;
 
 @FindBy(xpath="//input[@id='middleName']")
 private WebElement middlenametextfield;
 
 @FindBy(xpath="//input[@id='lastname']")
 private WebElement lastnametextfield;
 
 @FindBy(xpath="(//input[@type='radio'])[1]")
 private WebElement maleradiobutton;
 
 @FindBy(xpath="(//input[@type='text'])[8]")
 private WebElement calenderdropdownbutton;
 
 @FindBy(xpath="//label[.='Select Occupation']")
 private WebElement occupationiobutton;
 
 @FindBy(xpath="//input[@value='U']")
 private WebElement unmarriedbutton;
 
 @FindBy(xpath="//select[@formcontrolname='resCountry']")
 private WebElement countrybutton;
 
 @FindBy(xpath="//input[@id='email']")
 private WebElement emailtextfield;
 
 @FindBy(xpath="//input[@id='mobile']")
 private WebElement isdmobiletextfield;
 
 @FindBy(xpath="//select[@formcontrolname='nationality']")
 private WebElement Nationalitydropdownbutton;
 
 @FindBy(xpath="//textarea[@id='resAddress1']")
 private WebElement flattesxtfield;
 
 @FindBy(xpath="//textarea[@id='resAddress2']")
 private WebElement streettesxtfield;
 
 @FindBy(xpath="//textarea[@id='resAddress3']")
 private WebElement Areatesxtfield;
 
 @FindBy(xpath="(//input[@type='text'])[12]")
 private WebElement pincodetesxtfield;
 
 @FindBy(xpath="//input[@id='resState']")
 private WebElement statetesxtfield;
 
 @FindBy(xpath="//select[@formcontrolname='resCity']")
 private WebElement citytesxtfield;
 
 @FindBy(xpath="//select[@formcontrolname='resPostOff']")
 private WebElement postofficebutton;
 
 @FindBy(xpath="//input[@id='resPhone']")
 private WebElement phonetextfield;
 
 
 public Irctc(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 
 
 public void enterdetails() throws IOException, InterruptedException
 {
	 Thread.sleep(5000);
	 usernamefield.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1, 0));
	 passwordfield.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1,1));
	 confirmpasswordfield.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1, 2));
	 securityquestiondropdown.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1, 3));
	 securityanswerdropdown.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1, 4));
	 preferedlanguagedropdown.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1, 5));
	 firstnametextfield.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1, 6));
	 middlenametextfield.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1, 7));
	 lastnametextfield.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1, 8));
	 maleradiobutton.click();
	 selectbyvisibletext(calenderdropdownbutton, "1");
	 selectbyvisibletext(calenderdropdownbutton, "May");
	 selectbyvisibletext(calenderdropdownbutton, "1998");
	 occupationiobutton.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1, 12));
	 unmarriedbutton.click();
	 countrybutton.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1, 13));
	 emailtextfield.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1, 14));
	 isdmobiletextfield.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1, 15));
	 Nationalitydropdownbutton.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1, 16));
	 flattesxtfield.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1, 17));
	 streettesxtfield.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1, 18));
	 Areatesxtfield.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1, 19));
	 pincodetesxtfield.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1, 20));
	 statetesxtfield.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1, 21));
	 citytesxtfield.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1, 22));
	 postofficebutton.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1,23));
	 phonetextfield.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1, 24));
	
	 
 }
 
}
