package Pagepkg;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Link {
	
		WebDriver driver;

			
			@FindBy(xpath="/html/body/div[1]/div/div/div[1]/div/div[1]/div/ul[2]/li[2]/a")
			WebElement clicksignup;
	public  Link(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}	
	
	
	public void mousehover()
	{

		WebElement Electronics=driver.findElement(By.xpath("//*[@id=\"navigation-b3fa04fff4\"]/ul/li[3]/a"));	
		
		Actions act =new Actions(driver);
 act.moveToElement(Electronics);
 act.perform();
 Electronics.click();
	}
	
	public void Responsecode() throws Exception
	{
		List <WebElement>li=driver.findElements(By.tagName("a"));
		System.out.println("total no of links"+li.size());
		for(WebElement ele:li)
		{
			String link=ele.getAttribute("href");
			String linktext=ele.getText();
			System.out.println(link+".........."+linktext);
			
		}
	}
	
	

 public void checktext()
	{
		String etext="Our Women's Area";
		String src=driver.getPageSource();
		if(src.contains(etext))
		{	
			System.out.println("contains text");
		}
		else {
			System.out.println("not contains ");
		}
	}
 public void assertprogram()
 {
	 String expectedTitle = "Women";
     String actualTitle = driver.getTitle();
     Assert.assertEquals(actualTitle, expectedTitle, "Login page title match");
 }
 public void screenshotpgm() throws Exception
	{
	File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(s, new File("C:\\Users\\ANURAG\\Desktop\\screenshot1.png"));
	WebElement button=driver.findElement(By.id("page-a7e560b13f"));
	File s1=button.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(s1, new File("./Screenshot/buttonscreenshot.png"));
	}
 
 }
 
 
