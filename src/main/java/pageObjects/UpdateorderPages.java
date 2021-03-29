package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpdateorderPages {

	
	public WebDriver driver;
	
	By edt_password=By.name("old_passwd");
	By btn_Save=By.name("submitIdentity");
	By btn_Updateprofile=By.xpath("//*[text()='My personal information']");
	By btn_Updateprofilesucessmsg=By.xpath("//*[@class='alert alert-success']");
	public UpdateorderPages(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}

	public WebElement getupdatedetails()
	{
		return driver.findElement(btn_Updateprofile);
	}
	
	public WebElement getupdatepwd()
	{
		return driver.findElement(edt_password);
	}
	public WebElement getupdatesave()
	{
		return driver.findElement(btn_Save);
	}
	public WebElement getupdatesuccessmsg()
	{
		return driver.findElement(btn_Updateprofilesucessmsg);
	}
	
}
