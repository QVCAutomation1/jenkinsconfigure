package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {

	public static WebDriver driver;

	public Baseclass() {

		if (driver == null) {
			String s1 = "https://www.qvc.com";
			System.setProperty("webdriver.chrome.driver", "F:\\chrome81\\chromeDriver.exe");
			driver = new ChromeDriver();
			driver.get(s1);
			driver.manage().window().maximize();
			
		}
		// driver.close();
	}

}
