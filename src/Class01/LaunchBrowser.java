package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.stampedeblue.com");
        var URL=driver.getCurrentUrl();
        System.out.println(URL);
        var title=driver.getTitle();
        System.out.println("The title of the page is "+title);
        Thread.sleep(3000);
        driver.quit();
    }
}
