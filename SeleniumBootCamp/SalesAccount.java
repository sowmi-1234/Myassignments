package SeleniumBootCamp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SalesAccount {

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
driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Accounts");
driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
 driver.findElement(By.xpath("//span[text()='Accounts']")).click();
 driver.findElement(By.xpath("//div[text()='New']")).click();
 driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("NewAcc");
 driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[2]")).sendKeys("Customer-Direct");
 driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
 driver.findElement(By.xpath("//button[text()='New Contact']")).click();
 driver.findElement(By.xpath("//input[@class='firstName compoundBorderBottom form-element__row input']")).sendKeys("Sowmiya");
 driver.findElement(By.xpath("//input[@class='lastName compoundBLRadius compoundBRRadius form-element__row input']")).sendKeys("Thangavel");
 driver.findElement(By.xpath("(//input[@class=' input'])[1]")).sendKeys("1234@gmail.com");
 driver.findElement(By.xpath("(//span[text()='Save'])[3]")).click();
WebElement findElement = driver.findElement(By.xpath("//span[text()='Contacts']"));
driver.executeScript("arguments[0].click();",findElement);
driver.findElement(By.xpath("(//a[@data-target-selection-name='sfdc:StandardButton.Contact.Delete'])[1]")).click();
 driver.findElement(By.xpath("//span[text()='Delete']")).click();

 
 
 
	}

}
