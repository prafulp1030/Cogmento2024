package Steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import BaseLayer.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomePageStep extends BaseClass {

	@When("user is on home page and validate logo")
	public void user_is_on_home_page_and_validate_logo() {

		boolean actualLogo = driver.findElement(By.xpath("//div[@class='header item']")).isDisplayed();

		Assert.assertEquals(actualLogo, true);

	}

	@Given("user validate home page title")
	public void user_validate_home_page_title() {

		Assert.assertEquals(driver.getTitle(), "Cogmento CRM");
	}

}
