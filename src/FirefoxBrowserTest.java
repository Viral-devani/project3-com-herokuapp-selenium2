import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxBrowserTest {

    public static void main(String[] args) {

        String baseUrl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.gheko.driver", "Drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();//object creation
        driver.get(baseUrl);//Luanch the url

        //Give implicit time to wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Print the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is:" + title);

        //Print the current Url
        System.out.println("Current Url :" + driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page source is:" + driver.getPageSource());

        //Enter username to username field
        WebElement username = driver.findElement(By.name("username"));
        //Type username to username field
        username.sendKeys("Tomsmith");

        //Enter password to password field
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("supersecret");

        //Close the browser
        //driver.quit();


    }
}
