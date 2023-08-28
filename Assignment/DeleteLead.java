package Assignment;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
			    //click find leads link
			     driver.findElement(By.linkText("Find Leads")).click();
			    //click phone
			     driver.findElement(By.xpath("//span[text()='Phone']")).click();
			     
                //Enter phone number
			     driver.findElement(By.name("phoneCountryCode")).sendKeys("9");	  
			     driver.findElement(By.name("phoneAreaCode")).sendKeys("1");
			     driver.findElement(By.name("phoneNumber")).sendKeys("1234567890");
			      //click find leads button
			     driver.findElement(By.id("ext-gen915")).click();
			     //click lead id
			     driver.findElement(By.linkText("10056")).click();
			     //click delete 
			     driver.findElement(By.xpath("//a[text()='Delete']")).click();
			     System.out.println("Title of the Window:" +driver.getTitle());
			     Thread.sleep(1000);
			     driver.close();
}
}

			     
			     
			     
			     
			     
			     

			
