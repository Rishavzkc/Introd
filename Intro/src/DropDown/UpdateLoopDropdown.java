package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdateLoopDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1037482\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		
		/*
		 * int i=1;
		 * 
		 * while(i<5)
		 * 
		 * {
		 * 
		 * driver.findElement(By.id("hrefIncAdt")).click();//4 times
		 * 
		 * i++;
		 * 
		 * } driver.findElement(By.id("btnclosepaxoption")).click();
		 */
		   System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		   for(int i=1;i<5;i++)

		   {

		   driver.findElement(By.id("hrefIncAdt")).click();

		   }

		   driver.findElement(By.id("btnclosepaxoption")).click();
		   Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		   System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
