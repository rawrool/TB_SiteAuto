import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;

public class Order{
	
	public static void main(String[] args) throws FindFailed {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RXH7688\\Documents\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ta.co");
		String actualTitle = driver.getTitle();

		WebElement element = driver.findElement(By.xpath("//*[contains(@href,'/food/tacos')]"));

		screenLoadingWaitTime(3);

		element.click();

		screenLoadingWaitTime(3);

		WebElement itemdriver = driver.findElement(By.xpath("//*[contains(@href,'/food/tacos/crunchy-taco')]"));

		itemdriver.click();

	}

	public static void screenLoadingWaitTime(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}