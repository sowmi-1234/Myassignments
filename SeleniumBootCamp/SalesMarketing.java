package SeleniumBootCamp;


	import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

	public class SalesMarketing {
			public static void main(String[] args) throws InterruptedException {
		
				ChromeOptions options=new ChromeOptions();
				options.addArguments(" disable-notifications");
	     ChromeDriver driver =new ChromeDriver(options);
	     //driver.executeScript("arguments[0].click();",WebElement);
	     driver.get("https://login.salesforce.com/?locale=in");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
	     Thread.sleep(2000);
	     driver.findElement(By.id("password")).sendKeys("Leaf$1234");
	     driver.findElement(By.id("Login")).click();
	     Thread.sleep(2000);
	     String title=driver.getTitle();
	     System.out.println(title);
	     driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	     driver.findElement(By.xpath("//button[text()='View All']")).click();
	     driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Marketing");
	     driver.findElement(By.xpath("//p[text()='Best-in-class on-demand marketing automation']")).click();
	     WebElement findElement = driver.findElement(By.xpath("//span[text()='Leads']"));
	     driver.executeScript("arguments[0].click();",findElement);
	     driver.findElement(By.xpath("//div[text()='New']")).click();
	     driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Sowmiya");
	        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Thangavel");
	        driver.findElement(By.xpath("//input[@name='Company']")).sendKeys("TestLeaf");
	        driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	      driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border-filled']")).click();
	      driver.findElement(By.xpath("//a[@name='Convert']")).click();
	     driver.findElement(By.xpath("(//button[@class='slds-button transparentButton'])[3]")).sendKeys("Qeagle");
	   driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
      driver.findElement(By.xpath("//button[text()='Go to Leads']")).click();
      WebElement findElement1 = driver.findElement(By.xpath("//span[text()='Opportunities']"));
      driver.executeScript("arguments[0].click();",findElement1);
    
     
    
	  
	   
	      
	      
	      
	      
	     
		}
	}

	



