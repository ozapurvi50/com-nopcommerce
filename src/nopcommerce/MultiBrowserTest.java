package nopcommerce;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class MultiBrowserTest {

    static String browser = "Chrome";    //defining static variable to store value of browser
    static WebDriver driver;             //defining static variable to store driver
    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";
      // defining static variable to store URL
    public static void main(String[] args) {           // defining main method

        //1. Launch the Browser

        if(browser.equalsIgnoreCase("Safari")){  //If condition applied to select browser
            driver = new SafariDriver();}
        else if (browser.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }else{
            System.out.println("Wrong browser name");   //if the condition is not true this statement
        }

        //1. Open URL :  open the Url  into browser

        driver.get(baseUrl);

        //Browser full screen

        driver.manage().window().fullscreen();

        // 2. Print the title of page

        System.out.println("Page title :" +  driver.getTitle());

        //3. Print the current URL

        System.out.println("Current Url : " + driver.getCurrentUrl());

        // 4. Print the page source

        System.out.println("Page Source : " + driver.getPageSource());

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // 5. Enter the email to email field

        WebElement email = driver.findElement(By.id("Email"));
        //Type the Email address to email field element
        email.sendKeys("prime123@gmail.com");

        // 6.Enter the password to password field

        WebElement password = driver.findElement(By.name("Password"));
        //Type the password address to password field element
        password.sendKeys("Xyz1234");

        //7. Close driver
        driver.close();

        }
    }


