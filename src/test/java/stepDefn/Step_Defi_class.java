package stepDefn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

//@SuppressWarnings("deprecation")
public class Step_Defi_class {
	
	public WebDriver driver=null;
	
	@Given("^Open Browser$")
	public void open_Browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\sunda\\eclipse-workspace\\Project_Nov\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
	}

	@When("^Enter the URL \"([^\"]*)\"$")
	public void enter_the_URL(String url) throws Throwable {
		driver.get(url);
	}
   
	@And("^Click on MyAccount$")
	public void click_on_MyAccount() throws Throwable {
		driver.findElement(By.linkText("My Account")).click();
	}
     //single data steps
	/*@And("^Enter username$")
	public void enter_username() throws Throwable {
		driver.findElement(By.id("username")).sendKeys("rubinraj7@gmail.com");
	}
    
	@And("^Enter password$")
	public void enter_password() throws Throwable {
		driver.findElement(By.name("password")).sendKeys("Aruna@7409");
	}*/
	
	//Multiple data steps
	@When("Enter username {string}")
	public void enter_username(String user) {
		driver.findElement(By.id("username")).sendKeys(user);
	}

	@When("Enter password {string}")
	public void enter_password(String pwd) {
		driver.findElement(By.name("password")).sendKeys(pwd);
	}
	
	//Data Table steps
	/*@When("Enter username")
	public void enter_username(io.cucumber.datatable.DataTable usernm) {
	 List <List<String>> data = usernm.raw(); 
	 driver.findElement(By.id("username")).sendKeys(data.get(0));
	}
	
	@When("Enter password")
	public void enter_password(io.cucumber.datatable.DataTable passwd) {
		 List <List<String>> data = passwd.raw(); 
		 driver.findElement(By.id("username")).sendKeys(data.get(0));
	    
	}*/
        
	@And("^Click on Login$")
	public void click_on_Login() throws Throwable {
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
	}
    
	@Then("^User able to login to webpage$")
	public void user_able_to_login_to_webpage() throws Throwable {
		String verify = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p[1]/strong")).getText();
		Assert.assertEquals(true, verify.contains("rubinraj7"));
		driver.close();
	}
	@Then("verify login")
	public void verify_login() {
		String errortext = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/ul/li/strong[1]")).getText();
		if (errortext.contains("Error")) {
			Assert.assertTrue("Invalid-input", true);
			
		}
		else {
			Assert.assertTrue(false);
		}
	}

}
