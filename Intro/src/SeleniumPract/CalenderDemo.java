package SeleniumPract;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1037482\\Downloads\\java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(5000);
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();


		while(!driver.findElement(By.cssSelector("[class='ui-datepicker-title'] [class='ui-datepicker-title']")).getText().contains("May"))
		{
		driver.findElement(By.cssSelector("[class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
	List<WebElement> dates =	driver.findElements(By.cssSelector("td[data-handler='selectDay']"));
	int count =driver.findElements(By.cssSelector("td[data-handler='selectDay']")).size();
	for(int i=0; i<count; i++) {
		String text=driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).getText();
		if(text.equalsIgnoreCase("31"))
		{
		driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).click();
		break;
		}
	}
	}

}
