package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1037482\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		
		  driver.findElement(By.xpath("//a[@value='BLR']")).click();
		  
		  Thread.sleep(2000);
		  
		 // driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		 
		  driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		  driver.findElement(By.cssSelector(".ui-datepicker-days-cell-over.ui-datepicker-today")).click();
	}


}
