package ActionDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1037482\\Downloads\\java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/droppable/");
		
		
		//To know no. of frame present
		driver.findElements(By.tagName("iframe")).size();
		
		//Switching to frame 
		
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		
		driver.findElement(By.id("draggable")).click();
			
			Actions a =new Actions(driver);
			
			 WebElement source= driver.findElement(By.id("draggable"));
			 WebElement target= driver.findElement(By.id("droppable"));
			
			//for darg and drop
			a.dragAndDrop(source, target).build().perform();
			
           //switching to main window
			
			driver.switchTo().defaultContent();
	}

}
