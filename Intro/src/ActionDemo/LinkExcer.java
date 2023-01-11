package ActionDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExcer {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1037482\\Downloads\\java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		//count the total no of link
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//count total no of link in footer
		 WebElement footer= driver.findElement(By.id("gf-BIG"));
		 
		 System.out.println(footer.findElements(By.tagName("a")).size());
		 
		 //total no of link in one column in footer
		 WebElement columnfooter =driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		 
		 System.out.println(columnfooter.findElements(By.tagName("a")).size());
		 
		 //click on each link in column & check if link is working
		 
		 for(int i=1; i<columnfooter.findElements(By.tagName("a")).size();i++) {
			 
			String clickonlink= Keys.chord(Keys.CONTROL,Keys.ENTER);
			 
			columnfooter.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
			
			Thread.sleep(5000L);
			//printing the title of page in console
			
			  Set<String> names= driver.getWindowHandles(); 
			  Iterator<String> it =names.iterator();
			  
			  while(it.hasNext()) { 
				  driver.switchTo().window(it.next());
			  System.out.println(driver.getTitle()); 
			  }
			 
		 }
		 
	}

}
