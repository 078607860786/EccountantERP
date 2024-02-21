package login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login { 
	public WebDriver driver=null;
	public login(WebDriver driver) {
		this.driver=driver;
	}

	public void login_credential() {
		
		WebElement sss=driver.findElement(By.name("login"));
		WebElement sss2=driver.findElement(By.id("password"));

		if(sss.isEnabled() && sss2.isEnabled()) {
			sss.sendKeys("syedahusnaina@gmail.com");
			sss2.sendKeys("@Dmin123");
			
		}else  {
			
			driver.findElement(By.linkText("Sales")).click();
		}
		driver.findElement(By.id("login-btn")).click();
		return;

		
  	}
}
