package my.oa.calculator.testbase;

import my.oa.calculator.pages.CalcPage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;



public class BaseTestCase extends TestBase{
	
	public CalcPage calc;
	//@BeforeClass
	//PageFactory.initElements(getDriver(), Calculator.class);
	
	 @BeforeMethod
     public void beforeAllTests() {

         calc = PageFactory.initElements(getDriver(), CalcPage.class);
         
     }

	public BaseTestCase() {
		// TODO Auto-generated constructor stub
		//@BeforeClass
		//@BeforeMethod
		//@PageFactory
		
		
	}


}
