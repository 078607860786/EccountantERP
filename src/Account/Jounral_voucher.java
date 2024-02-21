package Account;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Jounral_voucher {
	WebDriver driver;
	String account="Abcd";
	String des="Description 1";
	String des2="Description 2";

	String debit="200";
	String credit="200";
	String account_against="Customer 7";
//	@BeforeClass
//	public void login() {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Usman Sher\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		 driver=new ChromeDriver();
//		 driver.manage().window().maximize();
//		driver.get("https://app.cloudeccountant.com/login.html");
		
		public void steps(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Usman Sher\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		// driver.manage().window().maximize();
//		driver.get("https://app.cloudeccountant.com/login.html");
	     String warehouse1="Main Store";
		System.out.print("Sohail Sagar");
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Usman Sher\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		l.sohail(driver);

//		p.step(driver);
		
//		Sales s1= new Sales(driver);
//		s1.step(driver);
		//Click Accounts
		driver.findElement(By.linkText("Accounts")).click();
		//Click Jounral Voucher 
		driver.findElement(By.linkText("Journal Voucher")).click();
		//Click Record Voucher
		driver.findElement(By.linkText("Record Voucher")).click();
		driver.findElement(By.cssSelector("button[data-id='warehouse']")).sendKeys(warehouse1,Keys.ENTER);
		//Acount1 Details
		WebElement pro=driver.findElement(By.id("account1"));
		pro.clear();
		pro.sendKeys(account);

		
		Actions sss=new Actions(driver);
		Thread.sleep(3000);
        sss.moveToElement(pro.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[7]/form/div/div/div/div[2]/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/a/div/div[1]"))).click().build().perform();  
        //Debit
        driver.findElement(By.id("description1")).sendKeys(des);
        
        driver.findElement(By.id("debit1")).sendKeys(debit);
        
    	WebElement pro2=driver.findElement(By.id("account2"));
		pro2.clear();
		pro2.sendKeys(account);

		
		Actions sss2=new Actions(driver);
		Thread.sleep(3000);
        sss2.moveToElement(pro.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[7]/form/div/div/div/div[2]/div[2]/div/div[2]/div[2]/div[1]/div/div[2]/a/div/div[1]"))).click().build().perform();  
        //Debit
       driver.findElement(By.id("description2")).sendKeys(des2);
        
        driver.findElement(By.id("credit2")).sendKeys(credit);

        driver.findElement(By.id("save_voucher")).click();



	}

}
