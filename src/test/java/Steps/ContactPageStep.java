package Steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import BaseLayer.BaseClass;
import io.cucumber.java.en.Given;

public class ContactPageStep extends BaseClass {

	@Given("user click on contact link")
	public void user_click_on_contact_link() {
		driver.findElement(By.xpath("//a[@href='/contacts']")).click();

	}

	@Given("user validate contact keyword")
	public void user_validate_contact_keyword() {

		Assert.assertEquals(driver.getCurrentUrl().contains("contacts"), true);
	}
}
