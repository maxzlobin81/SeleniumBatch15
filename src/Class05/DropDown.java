package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        //        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();

//        goto syntaxprojects.com
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");

        //            locate the the WebElement
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='select-demo']"));

//            use select class becuase this drop down has a select tag
        Select sel = new Select(dropDown);
//            using select class we have differnt methods to select the desired option
//            Select by index
        sel.selectByIndex(2);
        Thread.sleep(2000);

//            select by Value
        sel.selectByValue("Tuesday");
        Thread.sleep(2000);
//            select by visible text
        sel.selectByVisibleText("Friday");
        Thread.sleep(2000);

    }
}