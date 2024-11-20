package stepDefs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.fly.pages.LoginPage;
import com.fly.pages.NewArticlePage;
import com.fly.util.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class orderStepDef {
	WebDriver driver;
	LoginPage loginPage;
	NewArticlePage articlePage;
	//ArticleTest articleTest;
	
	public orderStepDef() {
		TestBase.initDriver();
		driver = TestBase.getDriver();
		loginPage = new LoginPage(driver);
		
	}
	
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		//driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://conduit-realworld-example-app.fly.dev/#/login");
	    throw new io.cucumber.java.PendingException();
	}
	//@When("User provide {string} and {string}")
	//public void user_provide_and(String strUser, String strPwd) {
	 //   loginPage.login("haripriyadasari56@gmail.com", "Priya@56");
	   // throw new io.cucumber.java.PendingException();
	//}
//	@Then("User should be on Home Page")
//	public void user_should_be_on_home_page() {
//	    Assert.assertTrue(articlePage.isOnHomePage());
//	    throw new io.cucumber.java.PendingException();
//	}
////	@Given("Article detail Page must be displayed")
//	public void article_detail_page_must_be_displayed() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("User update article detail")
//	public void user_update_article_detail() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@Then("Article detail must be updated")
//	public void article_detail_must_be_updated() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
}
