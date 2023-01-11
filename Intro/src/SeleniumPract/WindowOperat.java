package SeleniumPract;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowOperat {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1037482\\Downloads\\java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");

		driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();

		String parent = it.next();
		String child = it.next();
		
		driver.switchTo().window(child);
	System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
	String email =driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split("with")[0].trim();
		driver.switchTo().window(parent);
		driver.findElement(By.id("username")).sendKeys(email);
	}

}
