package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {

        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";

        //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();

        //2. Open URL :  open the Url  into browser
        driver.get(baseUrl);

        // 3. Print the title of page
        System.out.println("Title is : " + driver.getTitle());

        //4. Print the current URL
        System.out.println("Current URL is : " + driver.getCurrentUrl());

        //Maximise the screen
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // 5. Print the page source
        System.out.println("Page source :" + driver.getPageSource());

        // 6. Enter the email to email field
        WebElement email = driver.findElement(By.id("Email"));
        //Type the Email address to email field element
        email.sendKeys("prime123@gmail.com");

        // 7.Enter the password to password field
        WebElement password = driver.findElement(By.name("Password"));
        password.sendKeys("Xyz1234");

        //8. Close the Browser
        driver.close();

    }
}
