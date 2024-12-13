package Testpkg;

import javax.swing.text.Utilities;

import org.apache.logging.log4j.util.PropertySource.Util;
import org.testng.annotations.Test;

import Basepkg.Baseclass;
import Pagepkg.Checkout;
import Pagepkg.Link;
import Pagepkg.Login;
import Pagepkg.Shopcart;
import Utilitiespkg.Utilitiesclass;



public class Testclass extends  Baseclass{

	@Test
	public void verifylogin() throws Exception
	{
		Login ob=new Login(driver);
		Shopcart obj=new Shopcart(driver) ;
		Checkout obj1=new Checkout(driver);
		Link obj2=new Link(driver);
		ob.reg();
String xl="C:\\Users\\ANURAG\\Downloads\\lumashop.xlsx";
String sheet="Sheet1";


int rowCount =Utilitiesclass.getRowCount(xl, sheet);

for(int i=0;i<=rowCount;i++)
{
	String uname=Utilitiesclass.getCellValue(xl, sheet, i, 0);
	System.out.println("username--->"+uname);
	String pass=Utilitiesclass.getCellValue(xl, sheet, i, 1);
	System.out.println("password--->"+pass);
	
	ob.login_account(uname,pass);
	ob.scroll();
	ob.loginclick();
	
	
	driver.navigate().refresh();
}

obj.Shopnow();
obj.shop2();
obj.shop3();
obj1.Shipping("anagha","anurag");
obj1.copypaste();
obj1.DropdownOption();
obj1.Radiobutton();
obj2.mousehover();
obj2.Responsecode();
obj2.checktext();
obj2.assertprogram();
obj2.screenshotpgm();


	}
	}


