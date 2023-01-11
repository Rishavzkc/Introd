package ActionDemo;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1037482\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");

		driver.findElement(By.className("blinkingText")).click();
	
		Set <String> window= driver.getWindowHandles();
		Iterator <String> it =window.iterator();
		
		String parent =it.next();
		String child =it.next();
		driver.switchTo().window(child);
		
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		
	String email= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
	driver.switchTo().window(parent);

	driver.findElement(By.id("username")).sendKeys(email);
	}

}
