package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
        check if the check box    "click on this check box" is Selected
        if no  Select the check box
        check gain if the checkbox is Selected or not*/
public class HW1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        WebElement checkBox = driver.findElement(By.cssSelector("input[id='isAgeSelected']"));
        Boolean isSelected = checkBox.isSelected();
        System.out.println("The checkbox is selected " + isSelected);
        if (!isSelected) {
            checkBox.click();
        }
        Boolean isSelected2=checkBox.isSelected();
        System.out.println("The checkbox is selected "+isSelected2);

    }
}
