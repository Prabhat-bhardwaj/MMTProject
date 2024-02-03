package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	@FindBy(xpath = "//span[text()='Log In']")
	private WebElement loginBtn;

	@FindBy(xpath = "//input[@name='email']")
	private WebElement email;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;

	@FindBy(xpath = "//div[text()='Login']")
	private WebElement submit;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void clickLogin() {
		loginBtn.click();
	}

	public void enterEmail(String Email) {
		email.sendKeys(Email);
	}

	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void clickSubmit() {
		submit.click();
	}

}
