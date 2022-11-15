import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowserTest {

    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        System.setProperty("Webdriver.edge.driver", "msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        //Luanch the Url
        driver.get(baseUrl);

        //Give implicit time to browser wait for 20 second
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Print the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is :" + title);

        //Print the current Url
        System.out.println("Current Url :" + driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page source " + driver.getPageSource());

        //Enter email to email field
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("Tomsmith");

        //Enter password to password field
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Supersecret");

        //close the browser
        driver.quit();

    }
}
