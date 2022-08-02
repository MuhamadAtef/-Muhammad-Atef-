import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class GoogleHomePage {

    private WebDriver driver;


    @FindBy(css ="input[class=\"gLFyf gsfi\"]")
    private WebElement searchField ;

   By searchButton= By.xpath("//input[@name='btnK' and @type='submit']");


    public GoogleHomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void GoogleSearch(String searchItem){
        searchField.sendKeys(searchItem);
    }

    public SearchNavigatedPage ClickingGoogleSearch(){
        WebElement button = driver.findElement(searchButton);
        button.click();
        return new SearchNavigatedPage(driver);
    }

}
