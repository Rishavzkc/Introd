package WindowActi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsActivity {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1037482\\Downloads\\java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://google.com");

		driver.navigate().to("https://rahulshettyacademy.com");

		driver.navigate().back();

		driver.navigate().forward();

	}

}
