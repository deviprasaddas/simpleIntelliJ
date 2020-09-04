package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class firstScript {

    @Test
    public void mt() {
        System.out.println("Welcome to selenium very basic first test");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Devi\\Desktop\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "https://www.toolsqa.com/";
        System.out.println("04Sep2020");
        driver.get(baseUrl);
        driver.close();
    }

}
