package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	
	public WebDriver driver;
	
	By signin=By.cssSelector("a[href*='sign_in']");
	By title=By.cssSelector(".text-center>h2");
	By NavBar=By.cssSelector(".nav.navbar-nav.navbar-right>li>a");
	By popup=By.xpath("//button[text()='NO THANKS']");
	By btn_signin=By.name("SubmitLogin");
	By lnk_signin=By.xpath("//a[@class='login']");
	By edt_username=By.name("email");
	By edt_password=By.name("passwd");
	
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}

	public WebElement getsignin()
	{
		return driver.findElement(btn_signin);
	}
	public WebElement getLogin()
	{
		return driver.findElement(lnk_signin);
	}
	public WebElement getusername()
	{
		return driver.findElement(edt_username);
	}
	public WebElement getpassword()
	{
		return driver.findElement(edt_password);
	}
	

	
	
	
	
	
	
	public WebElement getNavigationBar()
	{
		return driver.findElement(NavBar);
	}
	public int getPopUpSize()
	{
		return driver.findElements(popup).size();
	}
	public WebElement getPopUp()
	{
		return driver.findElement(popup);
	}
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	
	
	
}
