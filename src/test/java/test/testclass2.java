package test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Baseclass;
import base.Shopbycategries;

public class testclass2 {
	@Test
	public void shopcategries() throws InterruptedException {
		try {
		ArrayList<String> actual = new ArrayList<String>();
		actual.add("Fashion");
		actual.add("Shoes");
		actual.add("Handbags & Luggage");
		actual.add("Jewelry");
		actual.add("Beauty");
		actual.add("Electronics");
		actual.add("For the Home");
		actual.add("Kitchen &Food");
		actual.add("Health& Fitness");
		actual.add("Garden Center");
		actual.add("Clearance");
		actual.add("Men's");
		actual.add("Baby");
		actual.add("Top Brands");
		actual.add("Gifts & Holidays");
		Shopbycategries S1 = new Shopbycategries();
		Thread.sleep(10000);
		S1.getshop().click();

		List<WebElement>getfashion = S1.getfashion();
		ArrayList<String> expected = new ArrayList<String>();
		for (int i=0;i<getfashion.size();i++) {
			expected.add(getfashion.get(i).getText());
			System.out.println("Value from QVC Site"+expected.get(i));
		}
		
	//	Actions actionObject=new Actions(Baseclass.driver);
		
		
		if(actual.equals(expected))
		{
			System.out.println("shopcategries list succeefully displayed"+ expected);
			
			
		}else {
			System.out.println("shopcategries list is not displayed "+ expected);
			Assert.fail("shopcategries list is not displayed "+ expected);
		}
		
		Baseclass.driver.close();

	}catch (Exception e) {
		// TODO: handle exception
		Baseclass.driver.close();
		System.out.println(e.getMessage());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	}

}

