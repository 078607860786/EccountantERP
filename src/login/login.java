package login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login { 
	@SuppressWarnings("deprecation")
	public void login_credential() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://app.cloudeccountant.com/login.html");
		
		WebElement sss=driver.findElement(By.name("login"));
		WebElement sss2=driver.findElement(By.id("password"));
	
	    //click Sales Option
//		WebElement sss=driver.findElement(By.linkText("Sales"));
//		WebElement sss2=driver.findElement(By.linkText("Purchase"));

//		WebElement in=driver.findElement(By.id("name1"));
		if(sss.isEnabled() && sss2.isEnabled()) {
//			driver.findElement(By.linkText("Purchase")).click();
			sss.sendKeys("syedahusnaina@gmail.com");
			sss2.sendKeys("@Dmin123");
			
		}else  {
			
			driver.findElement(By.linkText("Sales")).click();
		}
		driver.findElement(By.id("login-btn")).click();
		driver.findElement(By.linkText("Payroll")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Salary")).click();
		Thread.sleep(3000);

		driver.findElement(By.linkText("Payslips Generate")).click();
		Thread.sleep(3000);

		driver.findElement(By.linkText("Again Close Month For All Employees")).click();
		Thread.sleep(3000);

		driver.switchTo().alert().accept();





		
//		driver.findElement(By.linkText("Sale Invoice")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("button.hline")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("Sale Invoice")).click();
//		WebElement in=driver.findElement(By.id("name1"));
//		if(in.isDisplayed()) {
//		  driver.findElement(By.id("name1")).sendKeys("Product");
//		}else {
//			System.out.print("This is a Wrong thing");
//		}

		
  	}
}
