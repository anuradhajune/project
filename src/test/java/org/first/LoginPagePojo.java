package org.first;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePojo extends BaseClass {
	
	public LoginPagePojo() {
		PageFactory.initElements(driver, this);
	}
		@FindBy(id="email")
		private WebElement txtuser;
		@FindBy(id="pass")
		private WebElement txtpwd;
		@FindBy(xpath="//button[@name='login']")
		private WebElement btnlgn;
		public WebElement getTxtuser() {
			return txtuser;
		}
		public WebElement getTxtpwd() {
			return txtpwd;
		}
		public WebElement getBtnlgn() {
			return btnlgn;
		}
	

}
