package CaseStudy_casestudy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	public static WebDriver driver ;
	//Scenario2
		@When("^user open TestMe$")
		public void userOpensTestMeApp() {
			System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		}
		
		@And("^user click SignIn$")
		public void userclickSignIn() {
			driver.findElement(By.linkText("SignIn")).click();
			
		}
		
		@And("^user enters credentials as$")
		public void userenterscredentialsas(DataTable dt) {
			
			List<String> cred=dt.asList(String.class);
			driver.findElement(By.name("userName")).sendKeys(cred.get(0));
			driver.findElement(By.name("password")).sendKeys(cred.get(1));
			driver.findElement(By.name("Login")).click();
		}
		
		@And("^user searches a product$")
		public void usersearchesaproduct()
		{
			driver.findElement(By.name("products")).sendKeys("head");
			driver.findElement(By.xpath("//*[@value='FIND DETAILS']")).click();
			driver.findElement(By.xpath("//*[@href='#']")).click();
		}
		
		@And("^add product to cart$")
		public void addproducttocart()
		{
			
		}
		@Then("^purchase succesfull$")
		public void purchasesuccesfull()
		{
			System.out.println("Purchase succesfull");
		}
		
}
