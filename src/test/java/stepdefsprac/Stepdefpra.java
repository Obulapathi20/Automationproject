package stepdefsprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefpra {
	public static WebDriver driver;
	
	@Given("the URl")
	public void the_u_rl() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	@Given("get the log in page")
	public void get_the_log_in_page() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("enter the valid credentials")
	public void enter_the_valid_credentials() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");

		
	}

	@When("click on log in button")
	public void click_on_log_in_button() {
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("see validate the lon in functionality")
	public void see_validate_the_lon_in_functionality() {
		driver.getTitle();
	}

	

}
