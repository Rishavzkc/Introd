package LocatorDe;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorSelenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1037482\\Downloads\\java\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("http://localhost:4200/login");
			
			driver.findElement(By.id("email")).sendKeys("jack@gmail.com");
			driver.findElement(By.name("password")).sendKeys("jack12");
			driver.findElement(By.cssSelector(".btn")).click();

	}

}
