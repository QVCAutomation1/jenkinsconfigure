package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logginpage extends Baseclass{

	@FindBy(id="txtMastheadSearch")
	private WebElement searchBox;
	
	@FindBy(id="btnMastheadSearch")
	private WebElement searchIcon;
	
	public logginpage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	
public WebElement getSearchbox() {
	return searchBox;
}

public WebElement getsearchIcon() {
	return searchIcon;
}

	
}
