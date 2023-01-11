package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1037482\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
	 //cssselector- ("input[id*='StudentDiscount']")
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).isSelected());

		driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).isSelected());

		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).isSelected());
		//count no of checkbox
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}

}
