package ActionDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1037482\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
  Actions a= new Actions(driver);
  
  //move to specific location
  a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
  
  //type in searchbox
  a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
  
  
  //right click at a point
  a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().build().perform();
	}

}
