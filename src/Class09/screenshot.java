package Class09;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class screenshot {
    public static void main(String[] args) throws IOException {

//        tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        //        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

//        username Text Box
        WebElement userName = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userName.sendKeys("Tester");

//        password field
        WebElement pass = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        pass.sendKeys("test");
        //        password field

//        take screenshot
        TakesScreenshot ss = (TakesScreenshot) driver;
//        take the scrren shot as file

        File sourceFile = ss.getScreenshotAs(OutputType.FILE);

//        save the file in computer
        FileUtils.copyFile(sourceFile,new File("/Users/maximrealtypros/IdeaProjects/SeleniumBatch15/src/screenshot/abc.png"));


    }
}
