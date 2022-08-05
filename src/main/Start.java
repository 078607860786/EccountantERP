package main;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import login.login;
import salesModule.Sales;


public class Start {
    

	public static void main(String[] args) throws Exception{
		login ss=new login();
		ss.login_credential();
		//Create Object Sales Class
//		Sales sale=new Sales();
//		sale.step();
		
	
}
}