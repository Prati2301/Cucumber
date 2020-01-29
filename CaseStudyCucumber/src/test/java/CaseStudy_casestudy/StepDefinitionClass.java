package CaseStudy_casestudy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionClass {
	
	public static WebDriver driver ;
	@Given("^user open TestMeApp$")
	public void userOpenTestMeApp() {
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	}
	
	@When("^user click signup$")
	public void userclicksignup() {
		//driver.findElement(By.xpath("//a[@href='RegisterUser.html']")).click();
		driver.findElement(By.linkText("SignUp")).click();
	}
	
	@And("^enter username as \"([^\"]*)\"$")
			public void enterusername(String uname) {
		driver.findElement(By.id("userName")).sendKeys(uname);
	}
	
	@And("^enter firstname as \"([^\"]*)\"$")
	public void enterfirstnameas(String fname) {
		driver.findElement(By.id("firstName")).sendKeys(fname);
	}
	
	@And("^enter lastname as \"([^\"]*)\"$")
	public void enterlastnameas(String lname) {
		driver.findElement(By.id("lastName")).sendKeys(lname);
	}
	
	@And("^enter password as \"([^\"]*)\"$")
	public void enterpasswordas(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	

	@And("^enter confirm password as \"([^\"]*)\"$")
	public void enterconfirmpasswordas(String cpwd) {
		driver.findElement(By.id("pass_confirmation")).sendKeys(cpwd);
	}
	
	@And("^select gender as \"([^\"]*)\"$")
	public void selectgenderas(String gen) {
		if(gen.equals("female"))
		{
			driver.findElement(By.xpath("//input[@value='Female']")).click();
			
		}
		else if(gen.equals("male")) {
			
			driver.findElement(By.xpath("//input[@value='Male']")).click();
		}
		
		//List<WebElement> allradiobuttons=driver.findElements(By.name("gender"));
		//allradiobuttons.get(1).click();
		//driver.findElement(By.id("gender")).sendKeys(gen);
	}
	
	@And("^enter email as \"([^\"]*)\"$")
	public void enteremailas(String email) {
		driver.findElement(By.id("emailAddress")).sendKeys(email);
	}
	
	@And("^enter mobile number as \"([^\"]*)\"$")
	public void entermobilenumberas(String mbl) {
		driver.findElement(By.id("mobileNumber")).sendKeys(mbl);
	}
	
	@And("^enter DOB as \"([^\"]*)\"$")
	public void enterDOBas(String dob) {
		driver.findElement(By.id("dob")).sendKeys(dob);
	}
	
	@And("^enter address as \"([^\"]*)\"$")
	public void enteraddressas(String add) {
		driver.findElement(By.id("address")).sendKeys(add);
	}

	@And("^select security quetions as \"([^\"]*)\"$")
	public void selectsecurityquetionsas(String que) {
		WebElement dropdown=driver.findElement(By.name("securityQuestion"));
		Select s= new Select(dropdown);
		s.selectByIndex(0);
		//driver.findElement(By)
	}
	
	@And("^enter the answer as \"([^\"]*)\"$")
	public void entertheansweras(String ans) {
		driver.findElement(By.id("answer")).sendKeys(ans);
	}
	
	@Then("^user click on Register$")
	public void userclickonRegister() {
		driver.findElement(By.name("Submit")).click();
	}
	
	
}
