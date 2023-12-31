package TestPage;

import java.lang.reflect.Method;
import org.testng.annotations.*;
import BasePage.BasePage_Driver;
import BasePage.LoginPage_XPaths;

public class LoginPage_Test extends BasePage_Driver 
{	
	@BeforeClass
	public void bc()
	{
		BasePage_Driver.Test1 = report.createTest("LoginPageTest");
	}
	@BeforeMethod
	public void bf(Method m)
	{
		BasePage_Driver.Test2= BasePage_Driver.Test1.createNode(m.getName());
	}
	@Test(priority =1)
	public void Valid_user()
	{
		LoginPage_XPaths.Enter_User_name();	
		BasePage_Driver.Test2.info("Valid username test pass");
	}
	@Test(priority =2)
	public void Valid_pass()
	{
		LoginPage_XPaths.Enter_password();
		BasePage_Driver.Test2.info("Valid Password test pass");
	}
	@Test(priority =3)
	public void click_login()
	{
		LoginPage_XPaths.Enter_login();
		BasePage_Driver.Test2.info("Login Successful: test pass");
	}
	}
