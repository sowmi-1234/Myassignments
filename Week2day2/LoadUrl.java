package Week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoadUrl {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		 ChromeDriver driver =new ChromeDriver();
	     driver.get("https://dev31913.service-now.com/");
	     driver.manage().window().maximize();
	     driver.findElement(By.id("username")).sendKeys("admin");
	     Thread.sleep(2000);
	     driver.findElement(By.id("password")).sendKeys("q+NozS5Qe8!E");
	     Thread.sleep(2000);
	     driver.findElement(By.id("sysverb_Login")).click();
	  
	}

}