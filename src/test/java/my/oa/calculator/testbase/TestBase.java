package my.oa.calculator.testbase;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;


public class TestBase {

	public static final String BASE_URL = "http://darom.kharkov.ua/calculator.php";
	
	
	
		// TODO Auto-generated constructor stub
		//Browser list&settings
		//@AfterClass
		
		
	
	public enum BrowserName{
		 InternetExplorer,
		 Firefox,
		 GoogleChrome
	}

	private WebDriver driver;
	
    protected WebDriver getDriver() {
        return driver;
    }

	protected WebDriver createBrowser(BrowserName name) {
		// TODO Auto-generated constructor stub
		switch(name) {
		case InternetExplorer: 
			return createIE();
		case Firefox:
			return createFirefox();
		case GoogleChrome:
			return createChrome();
			
		default:
			return createFirefox();
		}
	}
	
	public WebDriver createFirefox() {
		driver = new FirefoxDriver();
		return driver;
	}
	
	public WebDriver createIE() {
		// TODO start IE
		return null;
	}
	
	public WebDriver createChrome() {
		driver = new ChromeDriver();
		return driver;
	}
	
    @AfterClass
    public void tearDown() {

        if (driver != null){
            driver.close();
            driver.quit();
            }
        }
}
