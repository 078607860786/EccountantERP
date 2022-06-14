package Purchase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import salesModule.Sales;

public class purchase_module extends Sales {
	
	
	String unit="abc";
	String description="Material Requirement Form";
	String status="DRAFT";
	String status_approved="APPROVED";
	String warehouse2="Main Store";
	String alert_draft=" Material Requirement Form created successfully.";
    String purpose="Sales";
    String sfds="Sohai";
	
    
	public void step(WebDriver driver) throws Exception {
	    
   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//Click Purchase Module
driver.findElement(By.partialLinkText("Purchase")).click();
//Click Material Requirement Form
driver.findElement(By.partialLinkText("Material Requirement Form")).click();
//Click Add Material Requirement Form
driver.findElement(By.partialLinkText("Add Material Requirement Form")).click();
//Go to Setting see Hide & Show
driver.findElement(By.className("btn-sm")).click();
Thread.sleep(5000);
//if(!driver.findElement(By.xpath("//input[@type='checkbox' and @name='report[mrf_list][descrp]']")).isSelected()){
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//input[@type='checkbox' and @name='report[mrf_list][descrp]']")).click();
//	
//}else{
//	System.out.append("Already Selected");
//}
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.findElement(By.className("btn-success")).click();
//Click Warehouse & Select
driver.findElement(By.cssSelector("button[data-id='warehouse']")).sendKeys(this.warehouse,Keys.ENTER);
driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//Write Product Name
driver.findElement(By.id("name1")).sendKeys(super.product1);
//Select Unit
driver.findElement(By.cssSelector("button[data-id='unit1']")).sendKeys(this.unit,Keys.ENTER);
//Write Discription
driver.findElement(By.id("product_desc1")).sendKeys(description);
driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//MDN Qty
driver.findElement(By.id("qty1")).clear();
driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
driver.findElement(By.id("qty1")).sendKeys(super.product_qty);
//Click Save button
driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/section[2]/div/div/div/div/form/div[3]/div/div[2]/button[1]")).click();
//After Save Material Demand Note
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
boolean pro_1 = driver.getPageSource().contains(product1);
boolean pro_des1 = driver.getPageSource().contains(description);
boolean qty1 = driver.getPageSource().contains(product_qty);
boolean status_draft = driver.getPageSource().contains(status);
boolean warehouse12 = driver.getPageSource().contains(warehouse2);
boolean unit2 = driver.getPageSource().contains(unit);

boolean alert = driver.getPageSource().contains(alert_draft);
boolean status_approved2 = driver.getPageSource().contains(status_approved);

if (pro_1== true && pro_des1==true && qty1==true && status_draft==true && warehouse12==true && unit2==true && alert==true)
{
 System.out.println("----After Save MDN Varify Data----");
}

else if(!(pro_1== true && pro_des1==true && qty1==true && status_draft==true && warehouse12==true && unit2==true && alert==true))
{
 //Go to Setting see Hide & Show
 driver.findElement(By.className("btn-sm")).click();
 if(!driver.findElement(By.xpath("//input[@type='checkbox' and @name='report[mrf_list][descrp]']")).isSelected()){
	 driver.findElement(By.xpath("//input[@type='checkbox' and @name='report[mrf_list][descrp]']")).click();
 }
 if(!driver.findElement(By.xpath("//input[@type='checkbox' and @name='report[mrf_list][product_name]']")).isSelected()){
	 driver.findElement(By.xpath("//input[@type='checkbox' and @name='report[mrf_list][product_name]']")).click();
 }
 if(!driver.findElement(By.xpath("//input[@type='checkbox' and @name='report[mrf_list][quantity]']")).isSelected()){
	
	 driver.findElement(By.xpath("//input[@type='checkbox' and @name='report[mrf_list][quantity]']")).click();
	
 }
 if(!driver.findElement(By.xpath("//input[@type='checkbox' and @name='report[mrf_list][unit]']")).isSelected()){
	
	 driver.findElement(By.xpath("//input[@type='checkbox' and @name='report[mrf_list][unit]']")).click();
 }
 if(!driver.findElement(By.xpath("//input[@type='checkbox' and @name='report[mrf_list][print_by]']")).isSelected()){
	 driver.findElement(By.xpath("//input[@type='checkbox' and @name='report[mrf_list][print_by]']")).click();	
 }

 }
 else {
	 System.out.println("Already On Hide & Show Setting");
 }
 driver.findElement(By.className("btn-success")).click();
 if (pro_1== true && pro_des1==true && qty1==true && status_draft==true && warehouse12==true && unit2==true && alert==true)
 {
  System.out.println("----After Check Hide & Show Varfiy Data----");
 }
 //Click Approve Button
 driver.findElement(By.linkText("Approve")).click();
 if (pro_1== true && pro_des1==true && qty1==true && status_approved2==true && warehouse12==true && unit2==true && alert==true)
 {
  System.out.println("----After Approve ----");
 }
 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
 String t = "Material Requirement Form has been approved successfully.";
 // identify elements with text()
 List<WebElement> l= driver.findElements(By.xpath("//*[contains(text(),'You are browsin')]"));
 // verify list size
 if ( l.size() > 0){
    System.out.println("Text: " + t + " is present. ");
 } else {
    System.out.println("Text: " + t + " is not present. ");
 }
 //---------Now Move To Next Module--------------
 //
 String material_requirement=driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[2]/div/div/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td")).getText();
 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
 //Material Requirement Note
 driver.findElement(By.linkText("Material Demand Note")).click();
 //Add Material Requirement Note
 driver.findElement(By.linkText("Add MDN")).click();
 //Select Purpose
 driver.findElement(By.cssSelector("button[data-id='warehouse']")).sendKeys(this.warehouse,Keys.ENTER);
 //Select Warehouse
 driver.findElement(By.cssSelector("button[data-id='purpose_id']")).sendKeys(this.purpose,Keys.ENTER);
 //Material Demand Note
//Write Product1 Name
 WebElement product=driver.findElement(By.id("name1"));
 product.clear();
 product.sendKeys(product1);
 Thread.sleep(3000);
 Actions builder5=new Actions(driver);
 builder5.moveToElement(product.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/section[2]/div/div/div/div/form/div[2]/div/div/div[4]/div/div/div[2]/div/div[1]/div/div[2]/a/div/div[1]"))).click().build().perform();  
 Thread.sleep(3000);
//Select Unit1
driver.findElement(By.cssSelector("button[data-id='unit1']")).sendKeys(this.unit,Keys.ENTER);
//Write Discription1
driver.findElement(By.id("product_desc1")).sendKeys(description);
driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//MDN Qty1
driver.findElement(By.id("qty1")).clear();
driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
driver.findElement(By.id("qty1")).sendKeys(super.product_qty);
//Click Save Button
driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/section[2]/div/div/div/div/form/div[3]/div/div[2]/button[1]")).click();
System.out.println("-----After save Varify------");
if(driver.getPageSource().contains(this.warehouse)) {
	 System.out.println("Successfully Contain Warehouse this Page");
 }
 if(driver.getPageSource().contains(this.purpose)) {
	 System.out.println("Successfully Contain purpose this Page");
 }
 if(driver.getPageSource().contains(this.warehouse)) {
	 System.out.println("Successfully Contain Warehouse this Page");
 }
 if(driver.getPageSource().contains(super.product1)) {
	 System.out.println("Successfully Contain Product this Page");
 }
 if(driver.getPageSource().contains(super.product_qty)) {
	 System.out.println("Successfully Contain Product_qty this Page");
 }
 if(driver.getPageSource().contains("Sohail Sager2")) {
	 System.out.println("Successfully Contain Product_qty this Page");
 }else {
	 System.out.println("This Text is Not Contain Please try Again");
 }
 //Click Edit Button
 driver.findElement(By.linkText("Edit")).click();
 System.out.println("-----in Edit Varify------");
 if(driver.getPageSource().contains(this.warehouse)) {
	 System.out.println("in Edit Page Successfully Contain Warehouse this Page");
 }
 if(driver.getPageSource().contains(this.purpose)) {
	 System.out.println("in Edit Page Successfully Contain purpose this Page");
 }
 if(driver.getPageSource().contains(this.warehouse)) {
	 System.out.println("in Edit Page Successfully Contain Warehouse this Page");
 }
 if(driver.getPageSource().contains(super.product1)) {
	 System.out.println("in Edit Page Successfully Contain Product this Page");
 }
 if(driver.getPageSource().contains(super.product_qty)) {
	 System.out.println("in Edit Page Successfully Contain Product_qty this Page");
 }
//Click newline in Edit Page and More Product
driver.findElement(By.id("newline")).click();


WebElement product22=driver.findElement(By.id("name3"));
product22.clear();
product22.sendKeys(product2);
Thread.sleep(3000);
Actions builder6=new Actions(driver);
builder6.moveToElement(product22.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/section[2]/div/div/div/div/form/div[2]/div/div/div[4]/div/div/div[2]/div[2]/div[1]/div/div[2]/a/div/div[1]"))).click().build().perform();  
Thread.sleep(3000);


Thread.sleep(3000);
//Select Unit1
driver.findElement(By.cssSelector("button[data-id='unit3']")).sendKeys(this.unit,Keys.ENTER);
//Write Discription1
driver.findElement(By.id("product_desc3")).sendKeys(description);
driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//MDN Qty1
driver.findElement(By.id("qty3")).clear();
driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
driver.findElement(By.id("qty3")).sendKeys(super.product_qty2);
//Click Save button
driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/section[2]/div/div/div/div/form/div[3]/div/div[2]/button")).click();
System.out.println("-----After Edit Varify------");
if(driver.getPageSource().contains(this.warehouse)) {
	 System.out.println("after Edit Page Successfully Contain Warehouse this Page");
}
if(driver.getPageSource().contains(this.purpose)) {
	 System.out.println("After Edit Page Successfully Contain purpose this Page");
}
if(driver.getPageSource().contains(this.warehouse)) {
	 System.out.println("After Edit Page Successfully Contain Warehouse this Page");
}
if(driver.getPageSource().contains(super.product1)) {
	 System.out.println("After Edit Page Successfully Contain Product this Page");
}
if(driver.getPageSource().contains(super.product_qty)) {
	 System.out.println("After Edit Page Successfully Contain Product_qty this Page");
}
if(driver.getPageSource().contains(super.product2)) {
	 System.out.println("After Edit Page Successfully Contain Product 2 this Page");
}
if(driver.getPageSource().contains(super.product_qty2)) {
	 System.out.println("After Edit Page Successfully Contain Product_qty2 this Page");
}
//Click Approved Button
driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[2]/div/div/div[1]/div[2]/form/div[1]/button")).click();
System.out.println("---------After Approved----------------");
if(driver.getPageSource().contains(this.purpose)) {
	 System.out.println("After Approved Successfully Contain purpose this Page");
}
if(driver.getPageSource().contains(this.warehouse)) {
	 System.out.println("After Approved Successfully Contain Warehouse this Page");
}
if(driver.getPageSource().contains(super.product1)) {
	 System.out.println("After Approved Successfully Contain Product this Page");
}
if(driver.getPageSource().contains(super.product_qty)) {
	 System.out.println("After Apprroved Successfully Contain Product_qty this Page");
}
if(driver.getPageSource().contains(super.product2)) {
	 System.out.println("After Approved Successfully Contain Product 2 this Page");
}
if(driver.getPageSource().contains(super.product_qty2)) {
	 System.out.println("After Apprved Successfully Contain Product_qty2 this Page");
}
if(driver.getPageSource().contains(this.status_approved)) {
	 System.out.println("Successfully Approved MDN");
}

String s=Integer.toString(sum123);
if(driver.getPageSource().contains(this.s)) {
	System.out.println("Total Both Product Qty"+s);
}
String MDN_Document_Number=driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[2]/div/div/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td")).getText();


//-----------Move to Purchase Module--------------
driver.findElement(By.linkText("Purchase Order")).click();
driver.findElement(By.linkText("Add Purhcase Order")).click();
driver.findElement(By.cssSelector("input[data-id='mdn_id']")).click();
	}
}


