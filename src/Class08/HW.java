package Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

/*please do this HW
        i request everyone to Attempt it as this will help u alot in working with tables and calenders.

        1.goto http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login

        username=Admin
        password=Hum@nhrm123

2. click on PIM option
        3. from the table select Any  value of id and click the check box associated with it

        make sure that ur code is dynamic i.e
        changing the id doesnt effect the logic or xpath*/
public class HW {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.xpath("//a[@class='firstLevelMenu']/b[text()='PIM']")).click();
        List<WebElement> idColumn = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
        for (int i = 0; i < idColumn.size(); i++) {
            String id=idColumn.get(i).getText();
            if(id.equalsIgnoreCase("52444A")){
                System.out.println(id);
                System.out.println("Row of the ID is "+i+1);
                driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+(i+1)+"]/td[1]")).click();
            }
        }
    }
}