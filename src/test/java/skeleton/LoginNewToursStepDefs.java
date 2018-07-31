package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginNewToursStepDefs {
	private WebDriver d ;
	@Given("^user is on the login page of newtours$")
	public void user_is_on_the_login_page_of_newtours() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pdc4-training.pdc4\\eclipse-workspace\\AdvancedSelenium\\src\\test\\resources\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("http://newtours.demoaut.com/");
	    
	}

	@When("^user enters correct credentials$")
	public void user_enters_correct_credentials() throws Throwable {
		d.findElement(By.name("userName")).sendKeys("invalidUN");
		d.findElement(By.name("password")).sendKeys("invalidPW");
		d.findElement(By.name("login")).click();
	}

	@Then("^user can do successful login$")
	public void user_can_do_successful_login() throws Throwable {
	    Assert.assertEquals("Find a Flight: Mercury Tours:", d.getTitle());
	}
	
}
