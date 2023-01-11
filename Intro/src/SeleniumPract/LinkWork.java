package SeleniumPract;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkWork {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1037482\\Downloads\\java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// no of links in page
		System.out.println("No. of link in whole page");
		System.out.println(driver.findElements(By.tagName("a")).size());

		// no of link in footer section
		System.out.println("No. of link in footer section");
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());

		// no. of link in one footer column
		System.out.println("No. of link in 1st column of footer section");
		WebElement column = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(column.findElements(By.tagName("a")).size());

		// click on each link in column
		System.out.println("Click on Each link and open in another tab: ");
		for (int i = 1; i < column.findElements(By.tagName("a")).size(); i++) {

			String clickonlink = Keys.chord(Keys.CONTROL, Keys.ENTER);

			column.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);

		}
		// Title of each tab
		Thread.sleep(5000);
		System.out.println("Title of Each Page are: ");
		Set<String> pageTitle = driver.getWindowHandles();
		Iterator<String> it = pageTitle.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}

}
