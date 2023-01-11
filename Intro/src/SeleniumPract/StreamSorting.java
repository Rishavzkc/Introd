package SeleniumPract;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StreamSorting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1037482\\Downloads\\java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//thead/tr/th[1]")).click();
		List<WebElement> original = driver.findElements(By.xpath("//tbody/tr/td[1]"));

		List<String> store = original.stream().map(s -> s.getText()).collect(Collectors.toList());

		List<String> sorted = store.stream().sorted().collect(Collectors.toList());

		Assert.assertTrue(store.equals(sorted));
	}

}
