package InventoryDocument;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Inventory_Document {
	
	String customer="ABC";
	 
	@Test
	public void before(){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Usman Sher\\Desktop\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://app.cloudeccountant.com/login.html");
    driver.findElement(By.cssSelector("input[placeholder='Email / Username']")).sendKeys("syedahusnaina@gmail.com");
    driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("@Dmin123");
    driver.findElement(By.id("login-btn")).click();
    //Click Purchase Module
    driver.findElement(By.partialLinkText("Purchase")).click();
    //Click Purchase Order
    driver.findElement(By.partialLinkText("Purchase Order")).click();
    //Click Create Purchase Order
    driver.findElement(By.partialLinkText("Add Purchase Order")).click();
    //Click Supplier
    driver.findElement(By.cssSelector("button[title='Select Supplier']")).sendKeys("000",Keys.ENTER);
    //Enter Customer 
//    WebElement select = driver.findElement(By.id("customer_name"));
//    List<WebElement> options = select.findElements(By.Input("ABC"));
//    for (WebElement option : options) {
//        if("ABC".equals(option.getText()))
//            option.click();   
//    }
    Select dropdown = new Select(driver.findElement(By.id("customer_name")));
    dropdown.selectByVisibleText("ABC");
//    driver.findElement(By.id("customer_name")).sendKeys(this.customer);
	}
//	@Test
//	public void before3(WebDriver driver) {
//
//		
//		driver.findElement(By.partialLinkText("Purchase")).click();
//
//		}
}
