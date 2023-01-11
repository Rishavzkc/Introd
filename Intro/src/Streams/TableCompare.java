package Streams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableCompare {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1037482\\Downloads\\java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		// click on the column
		driver.findElement(By.xpath("//tr/th[1]")).click();

		// store element in list
		List<WebElement> element = driver.findElements(By.xpath("//tbody/tr/td[1]"));

		// store all element in original list
		List<String> original = element.stream().map(s -> s.getText()).collect(Collectors.toList());

		// sort the original list

		List<String> shorted = original.stream().sorted().collect(Collectors.toList());

		// compare original list vs sorted list
		// Assert.assertTrue(original.equals(shorted));
		Assert.assertEquals(original, shorted);

		List<String> price;

		// scan the name column with getText ->Beans->print the price of the Rice

		do

		{

			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
			price = rows.stream().filter(s -> s.getText().contains("Rice")).map(s -> getPrice(s))
					.collect(Collectors.toList());
			price.forEach(a -> System.out.println(a));
			if (price.size() < 1) {
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();

			}
		} while (price.size() < 1);

	}

	private static String getPrice(WebElement s) {
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}

}
