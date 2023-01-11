package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class End2End {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1037482\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.className(".css-76zvg2.r-homxoj.r-ubezar.r-1ozqkpa")).click();
		
	driver.findElement(By.className(".css-1dbjc4n.r-14lw9ot.r-11u4nky.r-z2wwpe.r-1phboty.r-rs99b7.r-1loqt21.r-13awgt0.r-ymttw5.r-tju18j.r-5njf8e.r-1otgn73")).click();

	}

}
