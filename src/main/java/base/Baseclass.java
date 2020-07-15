package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {

	public static WebDriver driver;

	public Baseclass() {

		if (driver == null) {
			String s1 = "https://www.qvc.com";
			System.setProperty("webdriver.chrome.driver", "F:\\Build-Java\\workspac\\qvc2\\DRIVER\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(s1);
			driver.manage().window().maximize();
			
		}
		// driver.close();F:\Build-Java\workspac\qvc2\driver\Google_Chrome_(32bit)_v83.0.4103.116.exe
		//C:\Users\My\Downloads\Google_Chrome_(32bit)_v83.0.4103.116.exe
//C:\Users\My\Downloads\chromedriver_win32.exe
	}

}
