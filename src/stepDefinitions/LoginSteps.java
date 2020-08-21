package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Map;

import org.junit.Assert;

public class LoginSteps {
	
	// Use Cucumber to bind the Feature File steps to Java code
	// Glue code - step definitions - step implementation	
	
	WebDriver driver = Hooks.driver;

			
	@Given("^the user is on the login page$")
	public void the_user_is_on_the_login_page() throws Throwable {
		System.out.println("Step 1: The user is on the login page");		
		driver.get("http://admin-demo.nopcommerce.com/login");
		
	}
		
	@When("^the user enters valid credentials$")
	public void user_enters_valid_credentials() {		
		System.out.println("Step 2: User enters valid credentials");
		
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.id("Password")).sendKeys("admin");
		
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
	} 
	 
	@Then("^the user should be able to view their account balance$")
	public void user_should_see_account_balance() {
		System.out.println("Step 3: User sees dashboard");
		String bodyText = driver.findElement(By.xpath("html/body")).getText();
		String loggedInMessage = "Dashboard";
		Assert.assertTrue(bodyText.contains(loggedInMessage));
		System.out.println("Assertion Test 1: " + loggedInMessage);
	}
	
	@And("^the user logs out$")
	public void the_user_logs_out() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 4: User logs out\n");
//		String expected = "Balance";
//		String actual = "No balance";
//		Assert.assertEquals(expected, actual);
	}
	
	@When("^the user enters bad credentials$")
	public void the_user_enters_bad_credentials() {
	    
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.id("Password")).sendKeys("badadmin");
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	    
	}

	@Then("^the user should not be able to login$")
	public void the_user_should_not_be_able_to_login() {
	    
		String bodyText = driver.findElement(By.xpath("html/body")).getText();
		String loggedInMessage = "Dashboard";
		Assert.assertTrue(!bodyText.contains(loggedInMessage));
		System.out.println("Assertion Test 2: " + bodyText);
	    
	}
	@And("^the user should get a invalid login message$")
	public void the_user_should_get_a_invalid_login_message() {
	   
		String bodyText = driver.findElement(By.xpath("html/body")).getText();
		String errorMessage = "Login was unsuccessful. Please correct the errors and try again.";
		Assert.assertTrue(bodyText.contains(errorMessage));
		System.out.println("Assertion Test 3: " + errorMessage);
	    
	}
	
	@When("^user enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username)  {
	   
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys(username);		
	    
	}

	@When("^user enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) {
		
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys(password);
		
	}

	@When("^user clicks login button$")
	public void user_clicks_login_button() {
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	    
	}
	
	@Then("^user should be able to see dashboard$")
	public void user_should_be_able_to_see_account_balance() {
	   
		String bodyText = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).getText();
		String loggedInMessage = "Dashboard";
		Assert.assertTrue(bodyText.contains(loggedInMessage));
		System.out.println("Assertion Test 4: " + loggedInMessage);		
	
	}
	
	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) {
		
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys(password);
		user_clicks_login_button();
	}

	@Then("^the user should be able to see dashboard$")
	public void the_user_should_be_able_to_see_dashboard() {
	   
	    
	}
	
	@When("^user enters set of username and password$" )
	public void user_enters_set_of_username_and_password(DataTable credentials) {
		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			String username = data.get("username");
			String password = data.get("password");
		
			driver.findElement(By.id("Email")).clear();
			driver.findElement(By.id("Email")).sendKeys(username);
			driver.findElement(By.id("Password")).clear();
			driver.findElement(By.id("Password")).sendKeys(password);
			user_clicks_login_button();
		};
		
	    
	}

}

