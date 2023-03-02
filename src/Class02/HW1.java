package Class02;
/*navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        fill out the form
        click on register
        close the browser*/


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        WebElement firstName=driver.findElement(By.id("customer.firstName"));
        firstName.sendKeys("Max");
        WebElement lastName=driver.findElement(By.name("customer.lastName"));
        lastName.sendKeys("Zlobin");
        WebElement street= driver.findElement(By.id("customer.address.street"));
        street.sendKeys("53 Ferry Rd");
        WebElement register= driver.findElement(By.xpath("//input[@value='Register']"));
        register.click();
        Thread.sleep(4000);
        driver.quit();

    }
}
