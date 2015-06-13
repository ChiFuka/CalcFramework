package my.oa.calculator.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import my.oa.calculator.pages.AbstractPage;

public class CalcPage extends AbstractPage{

	   public CalcPage(WebDriver driver) {
	        super(driver);
	        PageFactory.initElements(driver, this);
	    }
	   
	//Identificators
	    @FindBy (xpath="//input[@name='a']")
	    private WebElement inputA;

	    @FindBy (xpath="//input[@name='b']")
	    private WebElement inputB;
	    
	    @FindBy (xpath="//input[@value='plus']")
	    private WebElement actionPlus;
	    
	    @FindBy (xpath="//input[@value='minus']")
	    private WebElement actionMinus;
	    
	    @FindBy (xpath="//input[@value='mult']")
	    private WebElement actionMult;
	  
	    @FindBy (xpath="//input[@value='division']")
	    private WebElement actionDivision;
	    
	    @FindBy (xpath="//div[@name='result']")
	    private WebElement result;
	    
	    @FindBy (xpath="//input[@value='Calculate']")
	    private WebElement actionSubmit;
	    
	// Methods
	   public CalcPage open(String url) {
		    getDriver().get(url);
	        return this;
	    }
	   public String getResult(){
		   return result.getText();
	   }
	   public String sum(String A, String B) {
		   inputA.sendKeys(A);
		   inputB.sendKeys(B);
		   actionPlus.click();
		   actionSubmit.click();
		   return getResult();
		   
		   
	   }

}
