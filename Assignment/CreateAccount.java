package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	

public static void main(String[] args) throws InterruptedException {
	
	//setup the path
	ChromeDriver driver =new ChromeDriver();
	//Load the url
	driver.get("http://leaftaps.com/opentaps/control/login");
	//maximize the window
	driver.manage().window().maximize();
	//findElement Enter username
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	Thread.sleep(2000);
	//findElement Enter password
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	//findElement click login
	driver.findElement(By.className("decorativeSubmit")).click();
	//verify the page is open
	//To get the title of the page
      String title = driver.getTitle();     //assign local variable ctrl+2
	System.out.println(title);
	// Click on CRM/SFA
     driver.findElement(By.linkText("CRM/SFA")).click();
	//click on lead
     driver.findElement(By.linkText("Leads")).click();
     //click createLead
     driver.findElement(By.partialLinkText("Create")).click();
     // Enter Company name
     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
     // Enter FirstName
     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sowmiya");
     //Enter Lasstname
     driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Thangavel");
   //click on createaccount 
     driver.findElement(By.xpath("//input[@value='CreateAccount']")).click();
     //Click CreateLead Button
     driver.findElement(By.name("submitButton")).click();
    //verify my created or not
     String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
     System.out.println(text);

     Thread.sleep(2000);
     
     // Step:1 Locate the dropdown web element
        WebElement tools = driver.findElement(By.id("createLeadForm_dataSourceId"));
        // Step:2 Instantiate Select class
        Select drop1 = new Select(tools);
        
        drop1.selectByVisibleText("Employee");
   //select industry 
	     WebElement indus = driver.findElement(By.name("industryEnumId"));
	     Select opts=new Select(indus);
	     opts.selectByVisibleText("Computer Software");
	     
 //select ownership
	     WebElement own = driver.findElement(By.name("ownershipEnumId"));
	     Select owner=new Select(own);
	     owner.selectByVisibleText("Corporation");
 //select marketing campaign
	     WebElement mark = driver.findElement(By.name("marketingCampaignId"));
	     Select camp=new Select(mark);
	     camp.selectByIndex(5);
	     
  //select state or province
	     WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
	     Select prov=new Select(state);
	     prov.selectByIndex(36);
//select country
	     WebElement country = driver.findElement(By.id("id=\"createLeadForm_generalCountryGeoId\""));
	     Select coun=new Select(country);
	     coun.selectByVisibleText("NJ");

     Thread.sleep(1000);
     
     driver.close();
     
     
}

}
