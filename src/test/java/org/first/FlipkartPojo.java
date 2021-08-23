package org.first;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPojo extends BaseClass {
	public FlipkartPojo() {
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement txtuser;
	@FindBy(xpath="//input[@type='password']")
	private WebElement txtpwd;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement btnck;
	public WebElement getTxtuser() {
		return txtuser;
	}
	public WebElement getTxtpwd() {
		return txtpwd;
	}
	public WebElement getBtnck() {
		return btnck;
	}
	

}
