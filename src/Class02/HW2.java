package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/*navigate to fb.com
click on create new account
fill up all the textboxes
click on sign up button
close the pop up
close the browser*/
public class HW2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver");
        WebDriver driver=new FirefoxDriver();
        driver.navigate().to("https:www.fb.com");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Max");
        driver.findElement(By.name("lastname")).sendKeys("Zlobin");
        Thread.sleep(3000);
        driver.findElement(By.name("websubmit")).click();
        driver.close();

    }
}
