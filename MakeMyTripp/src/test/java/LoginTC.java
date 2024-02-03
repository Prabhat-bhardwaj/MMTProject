import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.LoginPage;
import firstProject.login;

public class LoginTC {

	static WebDriver driver;

	@BeforeClass
	public void tc1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void tc2() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		driver.get("http://www.freecrm.com/");
		driver.manage().window().maximize();
		loginPage.clickLogin();
		loginPage.enterEmail("prabhat9759@gmail.com");
		loginPage.enterPassword("Test@123");
		loginPage.clickSubmit();

	}

	@AfterClass
	public void tc3() {
		if (driver != null) {
			driver.quit();
		}

	}
}
