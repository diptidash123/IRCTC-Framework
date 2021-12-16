package irctcelement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class locatorfield
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/profile/user-registration");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("dipti");
		driver.findElement(By.xpath("//input[@id='usrPwd']")).sendKeys("diptidash123");
		driver.findElement(By.xpath("//input[@id='cnfUsrPwd']")).sendKeys("diptidash123");
		driver.findElement(By.xpath("//label[.='Select Security Question']")).click();
		List<WebElement> folder=driver.findElements(By.xpath("//span[contains(text(),'What')]"));
		System.out.println(folder.size());
		
		for(int i=0;i<folder.size();i++)
		{
			System.out.println(folder.get(i).getText());
		}
		folder.get(0).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Security Answer']")).sendKeys("dog");
		driver.findElement(By.xpath("//label[.='Select Preferred Language']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'English')]")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("dipti");
		driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("ranjan");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("dash");
		driver.findElement(By.xpath("//input[@id='M']")).click();
		driver.findElement(By.xpath("//label[.='Select Occupation']")).click();
		List<WebElement> folder3=driver.findElements(By.xpath("//span[contains(text(),'PR')]"));
		System.out.println(folder3.size());
		
		for(int i=0;i<folder3.size();i++)
		{
			System.out.println(folder3.get(i).getText());
		}
		folder.get(1).click();
		
		driver.findElement(By.xpath("//input[@value='U']")).click();
		WebElement folder4=driver.findElement(By.xpath("//select[@formcontrolname='resCountry']"));
		Select sel=new Select(folder4);
		sel.selectByVisibleText("India");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("diptidash12345@gmail.com");
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("96625191");
		
		WebElement folder5=driver.findElement(By.xpath("//select[@formcontrolname='nationality']"));
		Select sel1=new Select(folder5);
		sel1.selectByVisibleText("India");
		
		driver.findElement(By.xpath("//textarea[@id='resAddress1']")).sendKeys("gadakana");
		driver.findElement(By.xpath("//textarea[@id='resAddress2']")).sendKeys("damana");
		driver.findElement(By.xpath("//textarea[@id='resAddress3']")).sendKeys("patia");
		driver.findElement(By.xpath("(//input[@name='resPinCode'])[1]")).sendKeys("751017");
		driver.findElement(By.xpath("//input[@name='resState']")).sendKeys("odisha");
		driver.findElement(By.xpath("(//input[@name='resPinCode'])[2]")).sendKeys("955656569");
		

		
	}

}
