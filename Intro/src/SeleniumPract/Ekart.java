package SeleniumPract;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ekart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1037482\\Downloads\\java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
	//	Thread.sleep(3000);
	
		String[] items = {  "Brocolli" ,"Cauliflower","Beetroot","Carrot"};
		addItems(driver,items);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT'] ")).click();
	//	Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
	driver.findElement(By.cssSelector("button.promoBtn")).click();
	
	//Explicit Wait
//	WebDriverWait w =new WebDriverWait (driver, 5);
//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
	System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	}
	
	
	
	
	public static void  addItems(WebDriver driver, String[] items) {
		int j =0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
String formatedName =name[0].trim();
			
			List itemNeeded = Arrays.asList(items);

			if (itemNeeded.contains(formatedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j==items.length) {
					break;
				}
			}
		}
	}

}
