package org.ju;

import java.io.IOException;

import org.first.BaseClass;
import org.first.LoginPagePojo;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Dataprov extends BaseClass {
	@BeforeClass
	private void browser() {
		
		loadBrowser();
		

	}
	
	@Test(dataProvider="login")
	public void testCase3(String name,String pwd) throws IOException, InterruptedException {
		launchUrl("https://en-gb.facebook.com/");
		
		LoginPagePojo g=new LoginPagePojo();
		fillTextbox(g.getTxtuser(), name);
      fillTextbox(g.getTxtpwd(), pwd);
       btnClk(g.getBtnlgn());
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



