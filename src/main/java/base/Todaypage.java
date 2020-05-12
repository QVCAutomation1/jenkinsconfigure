package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Todaypage extends Baseclass {

	@FindBy(xpath = "//div[text()='E233866']")
	private WebElement product;
	@FindBy(xpath = "//p[@class='tsvBadgeText']")
	private WebElement special;

	public Todaypage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getproduct() {
		return product;
	}

	public WebElement getSpecial() {
		return special;
	}

}
