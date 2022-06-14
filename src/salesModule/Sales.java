package salesModule;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.util.Assert;

import login.login;
import main.Start;



public class Sales extends Start{
	
	public WebDriver driver;
	String status_draft="DRAFT";
	String status_approved="APPROVED";
	public String customer_name="Muhammad Sohail Sagar";
	public String warehouse="Main Store";
	protected String product1="Sohail Sagar";
	String product_des="First Product";
	String page_title="View Sale Inquiry | Eccountant Cloud Accounting";
	
	protected String product_qty="10";
	
	protected String product2="Laptop";
	protected String product_des2="Mobile";
	protected String product_qty2="20";
	int add_product_qty=Integer. parseInt(product_qty);
	int add_product_qty2=Integer. parseInt(product_qty2);
    protected int sum123=(add_product_qty)+(add_product_qty2);
    protected String s=Integer.toString(sum123);
	String product3="Food";
	String product_des3="Product 3 Food";
	String product_qty3="30";
	int add_product_qty3=Integer. parseInt(product_qty3);
	int edit_sum123=(sum123)+(add_product_qty3);
	String s2=Integer.toString(edit_sum123);
	
	
	String service_product="Clothe";
	String service_product_des="Clothe Product";
	String service_product_qty="30";
	
	int number = Integer.parseInt(product_qty);
	int number2 = Integer.parseInt(product_qty2);
	int number3 = Integer.parseInt(product_qty3);
	int add_service_qty3=Integer. parseInt(service_product_qty);
	String s3=Integer.toString(add_service_qty3);
	int service_edit_sum123=(sum123)+(add_service_qty3);

	int sum=number+number2;
	int edit_sum=number+number2+number3;
	
	
	String alert="Sale Inquiry modified successfully.";
	String hide="No Supplier Available";
	
	 String des1="Sohail";
	
	public void step() throws Exception {
//		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
    
//        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
      //click Sales Option
        driver.findElement(By.xpath("//a/span[text()='Sales']")).click();
      //Click Sale Inquiry
       driver.findElement(By.partialLinkText("Sale Inquiry")).click();
       
   
        //Click Add Sale Inquiry
        driver.findElement(By.partialLinkText("Add Sale Inquiry")).click();
      //Customer Select
        WebElement from= driver.findElement(By.id("customer_name"));
        from.clear();
        from.sendKeys(customer_name);
        Thread.sleep(3000);
        Actions builder=new Actions(driver);
        builder.moveToElement( from.findElement(By.xpath("/html/body/div/div[4]/div[2]/div[1]/div[2]/div/div[1]/div/form/div[2]/div/div/div[2]/div[2]/table/thead/tr/th/div/div/div[2]/a/div/div[1]"))).click().build().perform();
        //----------
        driver.findElement(By.cssSelector("button[data-id='warehouse']")).sendKeys(this.warehouse,Keys.ENTER);
        //Product 1
        WebElement product=driver.findElement(By.id("name1"));
        product.clear();
        product.sendKeys(product1);
        Thread.sleep(3000);
        Actions builder2=new Actions(driver);
        builder2.moveToElement(product.findElement(By.xpath("/html/body/div/div[4]/div[2]/div[1]/div[2]/div/div[1]/div/form/div[2]/div/div/div[4]/div/div/div[2]/div/div[1]/div[1]/div/a/div/div[1]"))).click().build().perform();  
        Thread.sleep(3000);
        //Write Description
        driver.findElement(By.id("product_desc1")).clear();
        driver.findElement(By.id("product_desc1")).sendKeys(product_des);
        Thread.sleep(3000);
        //Write Product Qty
        driver.findElement(By.name("product[1][qty]")).clear();
        driver.findElement(By.name("product[1][qty]")).sendKeys(product_qty);
        //Click new line
        driver.findElement(By.id("newline")).click();
        //----------Product 2-------------
        WebElement product3=driver.findElement(By.id("name2"));
        product3.clear();
        product3.sendKeys(product2);
        Thread.sleep(3000);
        Actions builder3=new Actions(driver);
        builder3.moveToElement(product.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div/div[1]/div/form/div[2]/div/div/div[4]/div/div/div[2]/div[2]/div[1]/div[1]/div/a/div/div[1]"))).click().build().perform();  
        driver.findElement(By.id("product_desc2")).clear();
        Thread.sleep(3000);
        driver.findElement(By.id("product_desc2")).sendKeys(product_des2);
        Thread.sleep(3000);
        //Write Product Qty
        driver.findElement(By.name("product[2][qty]")).clear();
        driver.findElement(By.name("product[2][qty]")).sendKeys(product_qty2);
        //----------End------000---------
        driver.findElement(By.xpath("//*[@id=\"siform\"]/div[3]/div/div[2]/button[1]")).click();
        
        

       //Product 1 Data Varify
        boolean pro_1 = driver.getPageSource().contains(product1);
        boolean pro_des1 = driver.getPageSource().contains(product_des);
        boolean qty1 = driver.getPageSource().contains(product_qty);
        //Product 2 Data Varify
        boolean pro_2 = driver.getPageSource().contains(product2);
        boolean pro_des2 = driver.getPageSource().contains(product_des2);
        boolean qty2 = driver.getPageSource().contains(product_qty2);
        boolean total_qty = driver.getPageSource().contains(s);
  

        //Warehouse
        boolean warehouse1 = driver.getPageSource().contains(warehouse);
        boolean draft_status = driver.getPageSource().contains(status_draft);
//        boolean total = driver.getPageSource().contains(sum);
      
        if (pro_1== true && pro_des1==true && qty1==true && pro_2==true && warehouse1==true && pro_des2==true && qty2==true && total_qty==true
        		
        		
        		)
        {
         System.out.println("After Save Product 1 and 2 Data Validate View page");
        }
       
        else
        {
         System.out.println("Login Unsuccessful");
        }
      
    System.out.print(sum123);
	}



//      driver.close();

         

//Click Edit Button 
    public void edit(WebDriver driver) throws Exception {
    	
    
  driver.findElement(By.partialLinkText("Edit")).click();
  Thread.sleep(1000);
  boolean pro_1 = driver.getPageSource().contains(product1);
  boolean pro_des1 = driver.getPageSource().contains(product_des);
  boolean qty1 = driver.getPageSource().contains(product_qty);
  //Product 2 Data Varify
  boolean pro_2 = driver.getPageSource().contains(product2);
  boolean pro_des2 = driver.getPageSource().contains(product_des2);
  boolean qty2 = driver.getPageSource().contains(product_qty2);
  
  //Warehouse
  boolean warehouse1 = driver.getPageSource().contains(warehouse);
  boolean draft_status = driver.getPageSource().contains(status_draft);
  boolean draft_approved = driver.getPageSource().contains(status_approved);
//  boolean total = driver.getPageSource().contains(sum);

  if (pro_1== true && pro_des1==true && qty1==true && pro_2==true && warehouse1==true && qty2==true && pro_des2==true)
  {
   System.out.println("-----in Edit Page-------");
  }
 
  else
  {
   System.out.println("Login Unsuccessful");
  }
  
  //Click Add one More Product
  driver.findElement(By.id("newline")).click();
//Product 3
  WebElement product=driver.findElement(By.id("name9"));
  product.clear();
  product.sendKeys(product3);
  Thread.sleep(3000);
  Actions builder3=new Actions(driver);
  builder3.moveToElement(product.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div/div[1]/div/form/div[2]/div/div/div[4]/div/div/div[2]/div[3]/div[1]/div[1]/div/a[1]/div/div[1]"))).click().build().perform();  
  Thread.sleep(3000);
  //Write Description
  driver.findElement(By.id("product_desc9")).clear();
  driver.findElement(By.id("product_desc9")).sendKeys(product_des3);
  Thread.sleep(3000);
  //Write Product Qty
  driver.findElement(By.name("product[9][qty]")).clear();
  driver.findElement(By.name("product[9][qty]")).sendKeys(product_qty3);
  //Click Save Button
 driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div/div[1]/div/form/div[3]/div/div[2]/button")).click();


	
 boolean pro_3 = driver.getPageSource().contains(product3);
 boolean pro_des3 = driver.getPageSource().contains(product_des3);
 boolean qty3 = driver.getPageSource().contains(product_qty3);
 boolean edit_sum2 = driver.getPageSource().contains(s2);
 if (pro_1== true && pro_des1==true && qty1==true && pro_2==true && warehouse1==true && qty2==true && pro_des2==true && pro_3== true && pro_des3==true && qty3==true && edit_sum2==true)
 {
  System.out.println("----------Validate After Edit------------");
 }

 else
 {
  System.out.println("Login Unsuccessful");
 }

 driver.findElement(By.linkText("Supplier Products")).click();
 Thread.sleep(2000);
 if(driver.getPageSource().contains(hide))
 {	 Thread.sleep(2000);

	 driver.findElement(By.linkText("Purchase")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.linkText("Vendors")).click();
	 driver.findElement(By.linkText("000")).click();
	 driver.manage().timeouts().pageLoadTimeout(30L, TimeUnit.SECONDS); 
driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/section/div/div/div[2]/div/button")).click();
	 driver.manage().timeouts().pageLoadTimeout(30L, TimeUnit.SECONDS);
driver.findElement(By.linkText("Add Product")).click();
	 driver.manage().timeouts().pageLoadTimeout(30L, TimeUnit.SECONDS);
	 //Click Add new Product
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/section/div/div/div[7]/div/div/form/div[1]/div/div/div/div/div/div/button")).click();
//	 driver.findElement(By.id("product_name6")).sendKeys(product1);
	 WebElement product6=driver.findElement(By.id("product_name6"));
     product6.clear();
     product6.sendKeys(product1);
     Thread.sleep(3000);
     Actions builder6=new Actions(driver);
     builder6.moveToElement(product6.findElement(By.xpath("//*[@id=\"row-6\"]/td[1]/div/div/div/a/div/div[1]"))).click().build().perform();  
     Thread.sleep(3000);
 
	//*[@id="row-6"]/td[1]/div/div/div/a/div/div[1]
 
 }else {
    
driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/form/table/tbody/tr[2]/td[1]/div/div/div/span/input")).click();
driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/form/table/tbody/tr[2]/td[2]/div/div/input")).sendKeys("10");

driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/form/table/tbody/tr[2]/td[6]/div/span/input")).click();


driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/form/table/tbody/tr[5]/td[1]/div/div/div/span/input")).click();
driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/form/table/tbody/tr[5]/td[2]/div/div/input")).sendKeys("20");
driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/form/table/tbody/tr[5]/td[6]/div/span/input")).click();

driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/form/table/tbody/tr[7]/td[1]/div/div/div/span/input")).click();
driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/form/table/tbody/tr[7]/td[2]/div/div/input")).sendKeys("30");
driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/form/table/tbody/tr[7]/td[6]/div/span/input")).click();

driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/form/div/div[2]/button[1]")).click();

if (pro_1== true && pro_des1==true && qty1==true && pro_2==true && warehouse1==true && qty2==true && pro_des2==true && pro_3== true && pro_des3==true && qty3==true && edit_sum2==true)
{
 System.out.println("-------After Approved-----------");
}

else
{
 System.out.println("Login Unsuccessful");
}
	}


if(status_approved=="APPROVED" && warehouse=="Main Store") {
System.out.println("Varify Successfully");
String sale_inquery=driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td")).getText();



//------------------Move to Quotation-----------
		
		
		
driver.findElement(By.partialLinkText("Quotation")).click();
driver.findElement(By.partialLinkText("Add Quotation")).click();
WebElement sss223=driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div/div[2]/div/div[1]/div/form/div[2]/div/div/div[3]/div/div/div[1]/div/div/button"));
sss223.click();
driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div/div[2]/div/div[1]/div/form/div[2]/div/div/div[3]/div/div/div[1]/div/div/div/div/input")).sendKeys(sale_inquery,Keys.ENTER);

//---------------Add Service Product--------------------
WebElement product_s=driver.findElement(By.id("name_s"));
product_s.clear();
product_s.sendKeys(service_product);
Thread.sleep(3000);
Actions builder4=new Actions(driver);
builder4.moveToElement(product_s.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div/div[2]/div/div[1]/div/form/div[2]/div/div/div[4]/div[4]/div[1]/div[2]/div/div[1]/div/div/a/div/div[1]"))).click().build().perform();  
Thread.sleep(3000);

driver.findElement(By.id("qty")).clear();
driver.findElement(By.id("qty")).sendKeys(service_product_qty);

driver.findElement(By.id("price_s")).clear();
driver.findElement(By.id("price_s")).sendKeys("10");
int ssss3e=200;
//Click Save button
driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div/div[2]/div/div[1]/div/form/div[3]/div/div[2]/button[1]")).click();

if (pro_1== true && pro_des1==true && qty1==true && pro_2==true && warehouse1==true && qty2==true && pro_des2==true && pro_3== true && pro_des3==true && qty3==true && edit_sum2==true)
{
 System.out.println("------Before Quotation Approved-----------");
}

else
{
 System.out.println("Login Unsuccessful");
}
}
  

//After save Click Approved quotation


driver.findElement(By.linkText("Approve Quotation")).click();
if (pro_1== true && pro_des1==true && qty1==true && pro_2==true && warehouse1==true && qty2==true && pro_des2==true && pro_3== true && pro_des3==true && qty3==true && edit_sum2==true)
{
 System.out.println("------After Quotation Approved-----------");
}

else
{
 System.out.println("Occur Error");
}

String quotation=driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td")).getText();
System.out.println("This is a Quotatioin Document Number"+quotation);


Thread.sleep(3000);
driver.findElement(By.linkText("Continue Without Project")).click();
driver.findElement(By.linkText("Sale Order")).click();
driver.findElement(By.linkText("Add Sale Order")).click();

WebElement type=driver.findElement(By.xpath("//*[@id=\"soform\"]/div[2]/div/div/div[3]/div/div/div[1]/div/div/button"));
type.click();
driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div[1]/div[2]/div/div[1]/div/form/div[2]/div/div/div[3]/div/div/div[1]/div/div/div/div/input")).sendKeys(quotation,Keys.ENTER);
Thread.sleep(3000);
driver.findElement(By.id("product_desc1")).sendKeys(des1);
Thread.sleep(3000);
driver.findElement(By.id("product_desc2")).sendKeys(des1);
Thread.sleep(3000);
driver.findElement(By.id("product_desc3")).sendKeys(des1);
Thread.sleep(3000);
driver.findElement(By.id("product_desc4")).sendKeys(des1);
//Add General Discount
String general_discoun="20";
Integer i=Integer.parseInt(general_discoun);
driver.findElement(By.id("total_discount_percent")).clear();
driver.findElement(By.id("total_discount_percent")).sendKeys(general_discoun);
String ss=driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div[1]/div[2]/div/div[1]/div/form/div[2]/div/div/div[5]/div[2]/table/tbody/tr[1]/td/span[2]")).getText();
System.out.println(ss);
double sohai=Double.parseDouble(ss);
System.out.println(sohai);
double sss=sohai*0.30;
System.out.println(sss);
String ss3=driver.findElement(By.cssSelector("button[title*='None']")).getText();
driver.findElement(By.cssSelector("button[title*='None']")).click();
driver.findElement(By.cssSelector("button[title*='None']")).sendKeys("Sales Text",Keys.ENTER);

String ss4=driver.findElement(By.cssSelector("button[data-id*='charges_1']")).getText();
driver.findElement(By.cssSelector("button[data-id*='charges_1']")).click();
driver.findElement(By.cssSelector("button[data-id*='charges_1']")).sendKeys("delivery charges",Keys.ENTER);
driver.findElement(By.id("des_1")).sendKeys("Other Charges");
driver.findElement(By.name("charge_val[]")).sendKeys("20");
driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div[1]/div[2]/div/div[1]/div/form/div[3]/div/div[2]/button[1]")).click();

if (pro_1== true && pro_des1==true && qty1==true && pro_2==true && warehouse1==true && qty2==true && pro_des2==true && pro_3== true && pro_des3==true && qty3==true && edit_sum2==true)
{
 System.out.println("------Before Sale Order Approved-----------");
}

else
{
 System.out.println("Sale Order Issue in Validation");
}
driver.findElement(By.linkText("Approve Sale Order")).click();

if (pro_1== true && pro_des1==true && qty1==true && pro_2==true && warehouse1==true && qty2==true && pro_des2==true && pro_3== true && pro_des3==true && qty3==true && edit_sum2==true)
{
 System.out.println("------After Sale Order Approved-----------");
}

else
{
 System.out.println(" After Sale Order Issue in Validation");
}
}

}

 
 




