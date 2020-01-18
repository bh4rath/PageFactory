package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginPageTests {
	
	WebDriver driver;

	@BeforeSuite
	public void initialize() {
		System.setProperty("webdriver.chrome.driver", "C:\\Sauce labs repo\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://herokuapp.com");
	}

	@Test(priority=0)
	public void loginTest() {
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.setUserEmail("tester");
		loginPage.setUserPassword("tester");
		loginPage.clickOnLogin();
	}

	@AfterSuite
	public void quitDriver() {
		driver.quit();
	}
}
