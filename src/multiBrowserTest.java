import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Scanner;

public class multiBrowserTest {

    static String baseUrl = "http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) {
        //Scanner decalaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser name : eg.chrome,firefox.edge");
        String browser = scanner.nextLine();


        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("Webdriver.chrome.driver", "Drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gheko.driver", "Drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("Webdriver.edge.driver", "Drivers/msedgedriver.exe");
            driver = new EdgeDriver();

        } else {
            System.out.println("Wrong browser name");
        }
        driver.get(baseUrl);

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title" + title);

        //Print the page source
        System.out.println("Page source" + driver.getPageSource());


        //Browser wait for 20 second
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Enter the email to email field
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys(("Tomsmith"));

        //Enter the password to password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("Supersecret");


        //close the browser
        driver.quit();


    }
}
