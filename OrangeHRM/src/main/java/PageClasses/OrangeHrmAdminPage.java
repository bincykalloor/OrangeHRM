package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrangeHrmAdminPage {
		WebDriver driver;
		By searchButton=By.xpath("//button[text()=' Search ']");
		By resetButton=By.xpath("//button[text()=' Reset ']");
		
		
		public OrangeHrmAdminPage(WebDriver driver) {
			this.driver=driver;
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
		}
			
		public WebElement searchButtonClick() {
			return(driver.findElement(searchButton));
		 }
		
		public WebElement resetButtonClick() {
			return(driver.findElement(resetButton));
		}
}
