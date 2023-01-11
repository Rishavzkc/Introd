import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollingAndSum {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1037482\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		//scroll whole window
		js.executeScript("window.scrollBy(0,600)");
		
		//scroll table
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=6000");
		
		//sum of value in the table
		
		List<WebElement> value =driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum =0;
		for(int i=0; i<value.size(); i++) {
			 sum =sum + Integer.parseInt(value.get(i).getText());
			
			
				}
		System.out.println(sum);
		
		String total= driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim();
		int exact= Integer.parseInt(total);
		
		Assert.assertEquals(sum, exact);
		
	}
	

}
