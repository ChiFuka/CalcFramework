package my.oa.calculator.tests;

///import com.wikia.pages.LoginPage;
import my.oa.calculator.pages.CalcPage;
import my.oa.calculator.testbase.BaseTestCase;
import my.oa.calculator.utils.Log;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class OpenCalcTest extends BaseTestCase{
	
	CalcPage calc;

	
	@BeforeClass
    public void setUp(){

		//createBrowser(BrowserName.GoogleChrome);
		createBrowser(BrowserName.Firefox);
		calc = new CalcPage(getDriver());
    }

    @Test
    public void openurlTest(){
    	
    	
    	log.info("Logging in");
    	calc.open(BASE_URL);
        Assert.assertTrue(getDriver().getCurrentUrl().contains(BASE_URL));
    }
}
