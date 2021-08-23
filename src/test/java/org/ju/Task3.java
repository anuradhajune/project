package org.ju;

import java.io.IOException;

import org.first.BaseClass;
import org.first.FlipkartPojo;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;



public class Task3 extends BaseClass{
	@BeforeClass
	public static void loadbrow() {
		loadBrowser();

	}
	@Test
	public void flipkart() throws IOException {
		launchUrl("https://www.flipkart.com/account/login");
		FlipkartPojo fp=new FlipkartPojo();
		fillTextbox(fp.getTxtuser(), getExcelData(1, 0));
	Assert.assertEquals("username incorrect", "greens", (getAtt(fp.getTxtuser())));
		fillTextbox(fp.getTxtpwd(), getExcelData(1, 1));
		Assert.assertTrue("password is incorrect", (getAtt(fp.getTxtpwd()).equals("anu12345")));
btnClk(fp.getBtnck());
	}

}
