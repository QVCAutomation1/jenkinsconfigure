package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Baseclass;
import base.Todaypage;
import base.logginpage;

public class Testclass {

	@Test
	public void loginSite() throws InterruptedException {

		String number = "E233866";
		String Value = "TODAY'S SPECIAL VALUE";

		// TODO Auto-generated method stub
		Todaypage pageobject = new Todaypage();
		logginpage logginpageObject = new logginpage();
		logginpageObject.getSearchbox().sendKeys("E233866");
		logginpageObject.getsearchIcon().click();
		Thread.sleep(3000);
		String name = pageobject.getproduct().getText();

		if (number.equals(name)) {
			System.out.println("product number successfully displayed in the product page, The number is :" + name);
		} else {
			System.out.println("product number not successfully displayed in the product page, The number is :" + name);
			Assert.fail();
		}
		String sum = pageobject.getSpecial().getText();
		
		if (sum.contains(Value)) {
			System.out.println("Today special value text  successfully displayed " + sum);
		} else {
			System.out.println("Today special value  not successfully displayed " + sum);
			Assert.fail();
		}
		Baseclass.driver.close();

	}

}
