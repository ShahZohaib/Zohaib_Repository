package GithubTest;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;

public class LoginPage_OrangeHRM {
	
	WebDriver d = new ChromeDriver();
	@BeforeMethod
	public void OpenLoginPage()
	{  	
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.manage().window().maximize();
	}
	@Test
	public void EnterLoginDetails()
	{
		By login =By.xpath("//input[@name='username']");
		WebElement login_data = d.findElement(login);
		login_data.click();
		login_data.sendKeys("Admin");
		
		By pass = By.xpath("//input[@name='password']");
		WebElement password = d.findElement(pass);
		password.click();
		password.sendKeys("admin123");
		
		By submit = By.xpath("//button[@type='submit']");
		WebElement click_submit = d.findElement(submit);
		click_submit.submit();

		String act = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		if(act.equals(d.getCurrentUrl()))
		{
			System.out.println("Login Successful");
		}
		else
		{
			System.out.println("Login Failed");
		}
		System.out.println("Login Details Entered Successfully");
	}
		@AfterMethod
		public void close_page()
		{
			d.quit();
		}
				
		
		
	
}
