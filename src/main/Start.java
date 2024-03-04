package main;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.opera.OperaDriver;

import login.login;


public class Start {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.driver", "F:\\chromedriver2.exe");
		WebDriver driver = new OperaDriver();
		driver.manage().window().maximize();
		driver.get("https://app.cloudeccountant.com/login.html");
	}

}