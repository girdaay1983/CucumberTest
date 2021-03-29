package stepDefinations;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjects.*;

import resources.base;

public class stepDefination extends base {

	 public static Logger log =LogManager.getLogger(base.class.getName());

	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver =initializeDriver();
	}
	
	@Given("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_Site(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
		
	}

	 @When("^user enter credentials for login$")
	    public void user_enter_credentials_for_login(DataTable usercredentials) throws Throwable {
		 LandingPage lp=new LandingPage(driver);
		//Write the code to handle Data Table
		 List<List<String>> data = usercredentials.raw();
		 	Thread.sleep(5000);
		 	lp.getLogin().click();
			lp.getusername().sendKeys(data.get(0).get(0));
			lp.getpassword().sendKeys(data.get(0).get(1));
			lp.getsignin().click();
	    }
	 @When("^Verify updated details$")
	    public void Verify_updated_details(DataTable updatedetails) throws Throwable {
		 UpdateorderPages up=new UpdateorderPages(driver);
		//Write the code to handle Data Table
		 List<List<String>> data = updatedetails.raw();
		 driver.findElements(By.xpath("//*[contains(text(),'"+ data.get(0).get(0) +"')]"));
		 //click on update details
		 up.getupdatedetails().click();
		 up.getupdatepwd().sendKeys(data.get(0).get(1));
		 up.getupdatesave().click();
		 String actualsucessmsg=up.getupdatesuccessmsg().getText();
		 Assert.assertEquals(data.get(0).get(2), actualsucessmsg);
		 	log.info("Test Passed");
	    }
	 @When("^user select Tshirt and check out$")
	    public void user_select_Tshirt_and_check_out(DataTable orderdetails) throws Throwable {
		 	NeworderPages NoPg=new NeworderPages(driver);
		 	//Write the code to handle Data Table
		 	List<WebElement> wb=NoPg.getTabtshirt();
		 	
		 	wb.get(1).click();
		 	List<List<String>> data = orderdetails.raw();
		 	//Select required item in this case Tshirt
		 	driver.findElement(By.xpath("//*[@title='"+ data.get(0).get(0) +"']")).click();
		 	Thread.sleep(5000);
		 	//click on add to cart
		 	NoPg.getaddtocart().click();
		 	//Click on proceed to check out
		 	NoPg.getproceedtocheckout().click();
		 	
			//Click on proceed to check out
		 	NoPg.getspanproceedtocheckout().click();
		 	//Click on proceed to check out
		 	NoPg.getspanproceedtocheckout().click();
		 	//If terms and condtion is not checked
		 
		 	NoPg.getterms().click();
		 	
		 	//Click on proceed to check out
		 	NoPg.getproceedlastpg().click();
		 	//Select Payment method
		 	driver.findElement(By.xpath("//*[@title='"+ data.get(0).get(1) +"']")).click();
		 	//Click on confirm order
		 	NoPg.getconfirmorder().click();
		 	//Click on Back to orders button
		 	NoPg.getbacktoorders().click();
		 	Thread.sleep(5000);
		 	NoPg.getlatestorder().click();
	    }  
	 
	 @When("^Verify order details$")
	    public void Verify_order_details(DataTable orderdetails) throws Throwable {
		 	NeworderPages NoPg=new NeworderPages(driver);
		 	//Write the code to handle Data Table
		 	
		 	List<List<String>> data = orderdetails.raw();
		 	//Select required item in this case Tshirt
		 	List<WebElement> wb=driver.findElements(By.xpath("//label[contains(text(),'"+ data.get(0).get(0) +"')]"));
		 	int no_of_elements=wb.size();
		 	Assert.assertEquals(1, no_of_elements);
		 	log.info("signout successfull");
		 	
	    }  
	 
	 @And("^user signout from application$")
	    public void user_signout_from_application() throws Throwable {
		 	NeworderPages NoPg=new NeworderPages(driver);
		 	//Write the code to handle Data Table
		 	NoPg.getsignout().click();
		 	log.info("signout successfull");
		 	
	    } 
	 
	 @And("^close browsers$")
	    public void close_browsers() throws Throwable {
	        driver.quit();
	    }
	 
	 
	


}
