package Class04;
/*
goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
        1. u need to write down the code that can select  1 check box out of 4 mentioned,
        e.g option1 , option2 , option 3, option 4
        Note write down the logic in dynamic way i.e one change in if else condition can change ur selection*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        List<WebElement> checkBoxes = driver.findElements(By.cssSelector("input[class=\"cb1-element\"]"));
        System.out.println(checkBoxes);
        for (WebElement checkbox : checkBoxes) {
            String checkBoxValues = checkbox.getAttribute("value");
            if (checkBoxValues.equalsIgnoreCase("Option-2")) {
                checkbox.click();
            }

        }
    }
}