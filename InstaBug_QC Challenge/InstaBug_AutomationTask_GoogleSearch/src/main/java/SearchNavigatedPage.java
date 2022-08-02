import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchNavigatedPage {

    private WebDriver driver;
    protected WebDriverWait wait;


    public  SearchNavigatedPage(WebDriver driver){
        this.driver = driver;
    }


    public String getAssertionText (){
        return driver.getCurrentUrl();
    }
    }


