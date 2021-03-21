package ups.nj.stefdef;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ups.nj.supperpage.SupperClass;

public class LoginStepDef extends SupperClass {

	@Given("^User can open any browser$")
	public void user_can_open_any_browser() {
		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		driver = new ChromeDriver();	
	}

	@Given("^User able to enter url$")
	public void user_able_to_enter_url() {
    driver.get("https://www.ups.com/us/en/Home.page");
    driver.manage().window().maximize();
    
	}

	@When("^User able to click on the login button$")
	public void user_able_to_click_on_the_login_button() {
			
	//	4rt way
	WebElement ele = driver.findElement(By.linkText("Log in / Sign up"));	
	JavascriptExecutor excuter = (JavascriptExecutor)driver;
	excuter.executeScript("arguments[0].click();", ele);			
		
	// 3rd way	
	//Actions action = new Actions(driver);	
	//WebElement ele = driver.findElement(By.linkText("Log in / Sign up"));	
	//action.click(ele).build().perform();
	
	
	// 2nd way	
	//WebElement ele = driver.findElement(By.linkText("Log in / Sign up"));
	//ele.click();
	
		
	// 1 way	
    //driver.findElement(By.linkText("Log in / Sign up")).click();
    // driver.findElement(By.xpath("//a[text()='Log in / Sign up']")).click(); // This xpath create using text method 
    // driver.findElement(By.className("ups-analytics")).click();
    // driver.findElement(By.partialLinkText("Log in / Sign up")).click();
    //driver.findElement(By.xpath("(//a[@class='ups-analytics'])[7]")).click(); // by grouping xpath
	}

	@When("^User enter the userName$")
	public void user_enter_the_userName() {

	}

	@When("^User enter the password$")
	public void user_enter_the_password() {

	}

	@When("^User click on the signing button$")
	public void user_click_on_the_signing_button() {

	}

	@Then("^User able to verify successfully login$")
	public void user_able_to_verify_successfully_login() {

	}

	@Then("^User name & homepage title$")
	public void user_name_homepage_title() {

	}
}
