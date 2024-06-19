package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtlility;

public class OrangeHrmLoginPage {
		WebDriver driver;
		@FindBy(name = "username")
		WebElement usernamefield;
		
		@FindBy(name="password")
		WebElement passwordfield;
		
		@FindBy(xpath = "//button[@type='submit']")
		WebElement loginbutton;
		
		@FindBy(xpath ="//p[text()='Forgot your password? ']")
		WebElement forgotpasswordlink;
		
		
		
		   public OrangeHrmLoginPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}



		   public WebElement ForgotPasswordLinkButton() {
			return forgotpasswordlink;
		}
		   
		   public void Login(String username,String password) {
			   //usernamefield.sendKeys(username);  
			   PageUtlility.enterText(usernamefield, username);
			  // passwordfield.sendKeys(password);
			   PageUtlility.enterText(passwordfield, password);
			  // loginbutton.click();
			   PageUtlility.clickOnElement(loginbutton);
		   }
}
