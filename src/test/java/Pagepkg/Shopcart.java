package Pagepkg;

import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Shopcart {
WebDriver driver;

	
	@FindBy(xpath="/html/body/div[1]/div/div/div[2]/div/div/div/p[2]/a")
	WebElement shop;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div[4]/div/div[1]/div/div[2]/div/div/div[2]/div[1]/label/input")
	WebElement checkbox;
	
	@FindBy(xpath ="/html/body/div[1]/div/div/div[4]/div/div[2]/div/ul/li[2]/div/a")
	WebElement shopcart_click;
	
	@FindBy(xpath ="/html/body/div[1]/div/div/div[3]/div/div/div[2]/form/div/div/div[2]/div/button")
	WebElement continuecart;
	
	@FindBy(xpath = "//*[contains(@class,'btn btn-primary btn-action pull-right')]")
	WebElement checkout;
	@FindBy(xpath = "//*[@id=\"page-d534efa0bb\"]/div[1]/div/div/div[2]/div/div[5]/a")
	WebElement checkclick;
	
	public  Shopcart (WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}	
	
	public void Shopnow() throws Exception
	{
		shop.click();
		Thread.sleep(1000);
		checkbox.click();
		shopcart_click.click();
	}
	
	public void shop2() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)", "");
		continuecart.click();
		
		Thread.sleep(3000);
		checkout.click();
	}
	 public void shop3()throws InterruptedException {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,450)", "");
		    checkclick.click();
	}
	

	
}
