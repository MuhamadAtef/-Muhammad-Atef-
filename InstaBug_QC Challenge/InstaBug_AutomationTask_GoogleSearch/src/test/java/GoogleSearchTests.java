import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GoogleSearchTests extends TestBase{

    GoogleHomePage googleHomePage ;
    SearchNavigatedPage searchNavigatedPage ;
    String TestCaseName;


    @DataProvider(name="testData")
    public static Object[][] userData()
    {
        return new Object[][] {
                {"Google_TC1" , "Selenium Tutorial"},
                {"Google_TC2" , "InstaBug"},
                {"Google_TC3" , "عربي"},
                {"Google_TC4" , "123"}
        };
    }

@Test(alwaysRun=true, dataProvider="testData")
public void Test1(String TestCaseID, String SearchItems){
    googleHomePage=new GoogleHomePage(driver);
     TestCaseName = TestCaseID;
    googleHomePage.GoogleSearch(SearchItems);
    searchNavigatedPage=googleHomePage.ClickingGoogleSearch();
    String actualResult=searchNavigatedPage.getAssertionText();
    System.out.println(actualResult);
    String expectedResult = "https://www.google.com/search?q=";
    Assert.assertTrue(actualResult.contains(expectedResult),"failed Test");

}

}
