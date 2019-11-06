import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;

public class Order{
	
	public static void main(String[] args) throws FindFailed {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RXH7688\\Documents\\ChromeDriver\\chromedriver.exe");
		WebClass site = new WebClass("https://www.ta.co");
		site.getToSite();
		site.clickOnElementByXpath("//*[contains(@href,'/food/tacos')]");
		site.clickOnElementByXpath("//*[contains(@href,'/food/tacos/crunchy-taco')]");
		site.clickOnElementByXpath("//*/button[@id='addToCartButton']");
		site.clickOnElementByXpath("//*[@class='btn btn-primary checkout']");

	}

}