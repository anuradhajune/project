package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.first.BaseClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;




public class Task1 extends BaseClass {
	public static void main(String[] args) throws IOException {
		loadBrowser();
		launchUrl("https://www.facebook.com/");
		maxWindow();
		WebElement username = driver.findElement(By.id("email"));
		fillTextbox(username, "anuradha");
		WebElement pass = driver.findElement(By.id("pass"));
		fillTextbox(pass, "anu12345");
		screenShot("fb");
	}
	

}
