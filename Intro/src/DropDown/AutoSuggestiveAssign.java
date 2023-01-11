package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveAssign {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1037482\\Downloads\\java\\chromedriver.exe");

		  WebDriver driver =new ChromeDriver();
		  driver.get("http://qaclickacademy.com/practice.php");

		  driver.findElement(By.id("autocomplete")).sendKeys("united");
		  Thread.sleep(3000);
		  
		  driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

		    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

		   System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 

		       
	}

}
