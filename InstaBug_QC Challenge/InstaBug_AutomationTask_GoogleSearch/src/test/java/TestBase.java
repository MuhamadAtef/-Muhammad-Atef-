import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;


public class TestBase {

    public static WebDriver driver;
@BeforeMethod
    public void openChromeBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(8000));
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

    }
@AfterMethod
    public void closeChrome(){
        driver.quit();
    }
}
