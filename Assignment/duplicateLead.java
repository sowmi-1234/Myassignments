package Assignment;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class duplicateLead{


	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver =new ChromeDriver();    
        driver.get("http://leaftaps.com/opentaps/control/login");       
        driver.manage().window().maximize();   
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        
          //enter the username
        driver.findElement(By.id("username")).sendKeys("demoSalesManager");
        //enter the password
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        //click on loginbutton
        driver.findElement(By.className("decorativeSubmit")).click();
        //click on CRM/SFA
	     driver.findElement(By.linkText("CRM/SFA")).click();
	      //click on leads
	     driver.findElement(By.linkText("Leads")).click();
	      //click on create lead
	     driver.findElement(By.linkText("Create Lead")).click();
	     //enter company name
	     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
	     //enter firstname
	     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sowmiya");
	     //enter lastname
	     driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Thangavel");
	     //enter firstname(local)
	     driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sowmi");
        //enter department field
	     driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Non IT");
	     //enter description field
	     driver.findElement(By.name("description")).sendKeys("From July 2023 batch");
	     //enter email
	     driver.findElement(By.name("primaryEmail")).sendKeys("sowmiyadevi43@gmail.com");
	      //click on create lead button
	     driver.findElement(By.name("submitButton")).click();
	       //get title of the window
	     String title=driver.getTitle();
	     System.out.println("Title of the Window:" +title);
	     
	     //click on duplicate button
	     driver.findElement(By.linkText("Duplicate Lead")).click();
	      //Enter new CompanyName
	     driver.findElement(By.id("createLeadForm_companyName")).clear();
	     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HCL");
	     
	     //Enter new FirstName
	     driver.findElement(By.id("createLeadForm_firstName")).clear();
	     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sowmiya");
	     
	     Thread.sleep(3000);
	     //click on create lead button
	     driver.findElement(By.name("submitButton")).click();
	     
	     //get the title of the window
	     String title1=driver.getTitle();
	     System.out.println("Title of the Window: " +title1);
	     
	     Thread.sleep(3000);
	     driver.close();
	
	}

}