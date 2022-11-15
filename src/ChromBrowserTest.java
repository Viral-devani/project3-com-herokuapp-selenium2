import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromBrowserTest {
    public static void main(String[] args) {

        String baseUrl = "http://the-internet.herokuapp.com/login";
        System.setProperty("Webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();//create object
        driver.get(baseUrl);//launch url

        //Get implicit time to driver for wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Print title of the page
        String title = driver.getTitle();
        System.out.println("Page title is :" + title);

        //Print Current Url
        System.out.println("Current Url :" + driver.getCurrentUrl());

        //Enter email to email field
        WebElement username = driver.findElement(By.name("username"));
        //Type username in userfield
        username.sendKeys("Tomsmith");

        //Enter password to password field
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("supersecret");

        //Close the browser
        driver.quit();


    }

}
