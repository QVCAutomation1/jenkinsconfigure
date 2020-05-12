package base;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;


public class Shopbycategries extends Baseclass {
	@FindBy(xpath = "//a[@id='shopByCategory']")
	private WebElement shop;
	@FindBy(xpath = "//div[@class='menuLinkCell shopByCat']/div/ul/li/a")
	private List<WebElement> fashion;

	public WebElement getshop() {
		return shop;

	}

	public List<WebElement> getfashion() {
		return fashion;
	}

	public Shopbycategries() {
		PageFactory.initElements(driver, this);
	}
}
