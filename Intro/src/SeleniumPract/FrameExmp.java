package SeleniumPract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameExmp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1037482\\Downloads\\java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));

		System.out.println(driver.findElements(By.tagName("iframe")).size());
		Actions a = new Actions(driver);
		WebElement Source = driver.findElement(By.id("draggable"));

		WebElement target = driver.findElement(By.id("droppable"));

		a.dragAndDrop(Source, target).build().perform();
		
		driver.switchTo().defaultContent();
	}

}
