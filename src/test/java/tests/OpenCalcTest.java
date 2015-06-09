package tests;

///import com.wikia.pages.LoginPage;
import my.oa.calculator.pages.CalcPage;
import my.oa.calculator.testbase.BaseTestCase;



import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class OpenCalcTest extends BaseTestCase{
	
	CalcPage calc;

	@BeforeClass
    public void setUp(){

		createBrowser(BrowserName.GoogleChrome);
		//createBrowser(BrowserName.Firefox);
		calc = new CalcPage(getDriver());
    
    }

    @Test
    public void openurlTest(){

    	calc.open(BASE_URL);
        //Assert.assertTrue(getDriver().getCurrentUrl().contains("http://darom.kharkov.ua/calculator.php"));
    }
}
