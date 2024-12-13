package Pagepkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Checkout {
WebDriver driver;

	
	@FindBy(xpath="/html/body/div[1]/div/div/div[2]/div/div[1]/form/div[1]/div/div[2]/div/input")
	WebElement firstname;
	@FindBy(xpath="//*[@id=\"form-text-1038908588\"]")
	WebElement lastname;
	
	public  Checkout (WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}	
	
	
	public void Shipping(String First,String Last)
	{
	firstname.sendKeys(First);	
	lastname.sendKeys(Last);	
	}
	public void copypaste() {
	  
	    WebElement addressLine1 = driver.findElement(By.xpath("//*[@id=\"form-text-1872431321\"]"));
	    addressLine1.sendKeys("house");
	    addressLine1.sendKeys(Keys.CONTROL + "a"); 
	    addressLine1.sendKeys(Keys.CONTROL + "c"); 
	    
	    WebElement addressLine2 = driver.findElement(By.xpath("//*[@id=\"form-text-1872431322\"]"));
	    addressLine2.sendKeys(Keys.CONTROL + "v"); 
	}
	 public void Radiobutton()
	 {
	 WebElement radiobutton=driver.findElement(By.xpath("//*[@id=\"checkout\"]/div[2]/div/div[2]/div[2]/label/input"))	;
	 
	 radiobutton.click();
	 boolean l=  radiobutton.isSelected();
	 if(l)
	 {
	 	System.out.println("Radio button is selected");
	 }
	 else
	 {
	 	System.out.println("Radio button is not selected");	
	 }
	 }
	 public void DropdownOption() {
		 
	        WebElement countryDropdown = driver.findElement(By.xpath("//*[@id=\"form-options-417181665\"]"));
	        countryDropdown.click();
	        Select select = new Select(countryDropdown);
	        select.selectByValue("ES");
	 }
}