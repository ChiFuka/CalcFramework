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
	   
	//  Identificators
	// Methods
	   public CalcPage open(String url) {
	        getDriver().get(url);
	        return this;
	    }

}
