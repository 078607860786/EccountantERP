package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login { 
	public void login_credential() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://app.cloudeccountant.com/login.html");
		
		driver.findElement(By.name("login")).sendKeys("syedahusnaina@gmail.com");
		driver.findElement(By.id("password")).sendKeys("@Dmin123");
		driver.findElement(By.id("login-btn")).click();
	}
}
