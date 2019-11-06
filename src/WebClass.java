import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebClass {

    public WebDriver driver;
    public WebElement element;
    public String webAddress;

    public WebClass(String siteURL){
        driver = new ChromeDriver();
        webAddress =  siteURL;
    }

    public void getToSite(){
        driver.get(webAddress);
    }

    public void screenLoadingWaitTime() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickOnElementByXpath(String Xpath) {
        element = driver.findElement(By.xpath(Xpath));
        element.click();
        screenLoadingWaitTime();
    }

}
