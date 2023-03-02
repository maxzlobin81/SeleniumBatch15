package Class03;
/*
    use xpath to complete this
goto http://practice.syntaxtechs.net/basic-first-form-demo.php
Syntax - Website to practice Syntax Automation Platform
Syntax Automation Platform has great examples like Ajax, JQuery, Bootstrap etc which are used in most of the
web applications around the world.
enter the message in the text box
click on show message
Enter value of a
Enter value of B
click on the button get total
also please print the value of the attribute type of the button GET TOTAL
   */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.safebrowse.io/warn.html?url=http://practice.syntaxtechs.net/basic-first-form-demo.php&token=29a2388e");
        Thread.sleep(4000);
        WebElement messageBox= driver.findElement(By.xpath("//input[contains(@placeholder,'Please enter your')]"));
        messageBox.sendKeys("I am loving Selenium");
        WebElement showMessage=driver.findElement(By.xpath("//button[text()='Show Message']"));
        showMessage.click();
        WebElement idA=driver.findElement(By.xpath("//input[@id=\"sum1\"]"));
        idA.sendKeys("50");
        WebElement idB=driver.findElement(By.xpath("//input[@id=\"sum2\"]"));
        idB.sendKeys("75");
        WebElement getTotalBtn=driver.findElement(By.xpath("//button[text()='Get Total']"));
        getTotalBtn.click();
        String totalValue = driver.findElement(By.xpath("//span[@id='displayvalue']")).getText();

        System.out.println("Total value of a + b = " + totalValue);

        Thread.sleep(2000);
        driver.quit();

    }
}
