package ActionDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsAssignment {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1037482\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Multiple Windows")).click();
		
		driver.findElement(By.cssSelector("a[href*='windows']")).click();
		
		Set <String> window = driver.getWindowHandles();
        Iterator <String> it = window.iterator();
        
   String parent= it.next();
    String child =it.next();
     
     System.out.println(driver.findElement(By.cssSelector("div h3")).getText());
        
     driver.switchTo().window(parent);
     
     System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
	}

}
