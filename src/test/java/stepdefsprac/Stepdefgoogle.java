package stepdefsprac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefgoogle {
	public static WebDriver driver;

	
	@Given("get url and lanch the page")
	public void get_url_and_lanch_the_page() {
		Hooks.driver.get("https://www.google.com/");
	}

	@Given("to get the all the links in the page")
	public void to_get_the_all_the_links_in_the_page() {
		List<WebElement> l=Hooks.driver.findElements(By.xpath("//div[@class='vcVZ7d']/div/a"));
		System.out.println(l.size());
		
	}

	@When("able to enter the value on searchbar")
	public void able_to_enter_the_value_on_searchbar() {
		Hooks.driver.findElement(By.name("q")).sendKeys("flipkart");
	}

	@When("click on enter")
	public void click_on_enter() {
		Hooks.driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

	}

	@Then("validate the next page")
	public void validate_the_next_page() {
		Hooks.driver.getTitle();
	}

}
