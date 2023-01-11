package WindowActi;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleBrokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\1037482\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		String url =driver.findElement(By.cssSelector("a[href*='Broken Link']")).getAttribute("href");
		
		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();

		conn.setRequestMethod("HEAD");

		conn.connect();

		int respCode = conn.getResponseCode();

		System.out.println(respCode);
	}

}
