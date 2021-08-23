package org.testng;

import java.io.IOException;

import org.first.BaseClass;
import org.first.FlipkartPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Task4 extends BaseClass {
	@BeforeClass
	public static void loadbrow() {
		loadBrowser();

	}
	@AfterClass
	public static void closeBrowser() {
		closeCurrentTab();
		
	}
	@Parameters({"test5"})
	@Test(dataProvider="login" )
	public void flipkart(String name,String pwd) throws IOException, InterruptedException {
		launchUrl("https://www.flipkart.com/account/login");
		
		FlipkartPojo fp=new FlipkartPojo();
		fillTextbox(fp.getTxtuser(), name);
		//SoftAssert s=new SoftAssert();
		//s.assertTrue(getAtt(fp.getTxtuser()).contains("anu"), "Data incorrect");
	
		fillTextbox(fp.getTxtpwd(), pwd);
		//s.assertEquals(getAtt(fp.getTxtpwd()).contains("ann"), true);
		//Assert.assertTrue("password is incorrect", (getAtt(fp.getTxtpwd()).equals("anu12345")));
btnClk(fp.getBtnck());
//s.assertAll();
System.out.println("TC5"+ Thread.currentThread().getId());
Thread.sleep(2000);
	}
	@DataProvider(name="login")
	private Object[][] data() {
		return new Object[][]{
			{"anu","anu12345"},
			{"shree","shree123"}
			
		};
		}



}
