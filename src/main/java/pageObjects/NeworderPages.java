package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NeworderPages {

	
	public WebDriver driver;
	

	By edt_username=By.name("email");
	By edt_password=By.name("passwd");
	By btn_Addtocart=By.xpath("//*[text()='Add to cart']");
	By btn_ProceedtoCheckout=By.xpath("//*[@title='Proceed to checkout']");
	By chk_termsandcondition=By.xpath("//*[contains(text(),'I agree')]");
	By btn_ConfirmOrder=By.xpath("//*[text()='I confirm my order']");
	By btn_Backtoorder=By.xpath("//*[@title='Back to orders']");
	By tab_Tshirt=By.xpath("//*[@title='T-shirts']");
	By span_proceedtoCheckout=By.xpath("//*[text()='Proceed to checkout']");
	By span_proceedtoCheckoutbylastpage=By.xpath("//*[@class='button btn btn-default standard-checkout button-medium']");
	By btn_latestorder=By.xpath("//*[text()='Order reference']/following::a[1]");
	By btn_signout=By.xpath("//*[@title='Log me out']");
	public NeworderPages(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}

	public WebElement getaddtocart()
	{
		return driver.findElement(btn_Addtocart);
	}
	
	public WebElement getproceedtocheckout()
	{
		return driver.findElement(btn_ProceedtoCheckout);
	}
	
	public WebElement getterms()
	{
		return driver.findElement(chk_termsandcondition);
	}
	
	
	public WebElement getconfirmorder()
	{
		return driver.findElement(btn_ConfirmOrder);
	}
	
	public WebElement getbacktoorders()
	{
		return driver.findElement(btn_Backtoorder);
	}
	
	public  List<WebElement> getTabtshirt()
	{
		return driver.findElements(tab_Tshirt);
	}
	public WebElement getspanproceedtocheckout()
	{
		return driver.findElement(span_proceedtoCheckout);
	}
	public WebElement getproceedlastpg()
	{
		return driver.findElement(span_proceedtoCheckoutbylastpage);
	}
	
	public WebElement getlatestorder()
	{
		return driver.findElement(btn_latestorder);
	}
	
	public WebElement getsignout()
	{
		return driver.findElement(btn_signout);
	}
}
