package Pagepkg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
WebDriver driver;

	
	@FindBy(xpath="/html/body/div[1]/div/div/div[1]/div/div[1]/div/ul[2]/li[2]/a")
	WebElement clicksignup;
	@FindBy(xpath="/html/body/div[3]/div[3]/div/div/div/div/div/div/div/div/form/div[1]/input[1]")
	WebElement email;
	@FindBy(xpath="/html/body/div[3]/div[3]/div/div/div/div/div/div/div/div/form/div[1]/input[2]")
	WebElement password;
	@FindBy(xpath="/html/body/div[3]/div[3]/div/div/div/div/div/div/div/div/form/div[2]/button")
	WebElement login;	
	
	public  Login (WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}	
	
	public void reg()
	{
		clicksignup.click();
	}
	
	public void scroll() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", login);
		
	}
	public void login_account(String Email,String pass)
	{
		email.sendKeys(Email);
	    password.sendKeys(pass);
	}	
	
	public void loginclick() {
		login.click();
	}

	
}


