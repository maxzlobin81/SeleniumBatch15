package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver");
        WebDriver driver=new FirefoxDriver();
        driver.get("https:www.cnn.com");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
    }
}