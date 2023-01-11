package ActionDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FullAssign {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1037482\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://qaclickacademy.com/practice.php");
		
		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[3]/input")).click();
		
		String option = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[3]/input")).getText();
	
		WebElement Staticdropdown= driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select( Staticdropdown);
		
		dropdown.selectByVisibleText(option);
		
		 driver.findElement(By.name("enter-name")).sendKeys(option);

	        driver.findElement(By.id("alertbtn")).click();
	        
	        String name=  driver.switchTo().alert().getText();
		if(name.contains(option)) {
			System.out.println("Alert message");
		}else {
			System.out.println("Unsucess");
		}
	}

}
