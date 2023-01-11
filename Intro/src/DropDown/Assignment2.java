package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\1037482\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.findElement(By.name("name")).sendKeys("Rishav");
		driver.findElement(By.name("email")).sendKeys("rishav@gmail.com");
		driver.findElement(By.cssSelector("input[type ='password']")).sendKeys("Rishav123");
		driver.findElement(By.cssSelector("input[id='exampleCheck1']")).click();

		System.out.println(driver.findElement(By.cssSelector("input[id='exampleCheck1']")).isSelected());

		WebElement staticdropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(staticdropdown);

		dropdown.selectByVisibleText("Male");
		System.out.println(dropdown.getFirstSelectedOption().getText());

		driver.findElement(By.cssSelector("input[id='inlineRadio2']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id='inlineRadio2']")).isSelected());

		driver.findElement(By.name("bday")).sendKeys("24/01/1997");

		driver.findElement(By.cssSelector("input[type='Submit']")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
	}

}
