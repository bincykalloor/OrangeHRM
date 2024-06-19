package OrangeHRM;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AutomationCore.BaseClass;
import PageClasses.OrangeHrmAdminPage;
import PageClasses.OrangeHrmHomePage;
import PageClasses.OrangeHrmLoginPage;
import Utilities.PageUtlility;

public class TestCases extends BaseClass {
		public WebDriver driver;
		OrangeHrmLoginPage loginPage;
		OrangeHrmHomePage homePage;
		OrangeHrmAdminPage adminPage;
		@BeforeMethod
		public void initialization()throws Exception {
			driver=browserinitialization("chrome");
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			loginPage=new OrangeHrmLoginPage(driver);
			homePage=new OrangeHrmHomePage(driver);
			adminPage=new OrangeHrmAdminPage(driver);
			
			}
		@Test
		public void ForgotPasswordLinkVerification() {
			//loginPage.ForgotPasswordLinkButton().click();----->replaced this code to below line 
			PageUtlility.clickOnElement(loginPage.ForgotPasswordLinkButton());
		}
		
		@Test
		public void SideMenuOptionVerification() {
			loginPage.Login("Admin","admin123");
			Assert.assertEquals(homePage.searchTabOption().isDisplayed(), true);
			Assert.assertEquals(homePage.adminTabOption().isDisplayed(), true);
			Assert.assertEquals(homePage.pimTabOption().isDisplayed(), true);
			Assert.assertEquals(homePage.leaveOptionVerification(), true);
		}
		
		public void adminTabVerification() {
			loginPage.Login("Admin", "admin123");
			Assert.assertEquals(adminPage.searchButtonClick().isDisplayed(), true);
			Assert.assertEquals(adminPage.resetButtonClick().isDisplayed(), true);
		}
}
