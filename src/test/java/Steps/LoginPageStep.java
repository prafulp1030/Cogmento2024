package Steps;

import org.openqa.selenium.By;

import BaseLayer.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStep extends BaseClass {
	@Given("user open a url")
	public void user_open_a_url() {
		BaseClass.init();
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		driver.findElement(By.name("email")).sendKeys("prafulp1010@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Pr@ful0812");

	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//div[text()='Login']")).click();

	}

}
