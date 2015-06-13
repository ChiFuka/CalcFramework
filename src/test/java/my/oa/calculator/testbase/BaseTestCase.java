package my.oa.calculator.testbase;

import my.oa.calculator.pages.CalcPage;
import my.oa.calculator.utils.Log;

import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;



public class BaseTestCase extends TestBase{
	
	public CalcPage calc;
	protected static final Logger log = LoggerFactory.getLogger(Log.class);
	 @BeforeMethod
     public void beforeAllTests() {

		 
         calc = PageFactory.initElements(getDriver(), CalcPage.class);
         
     }


}
