package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage{
	public static void main(String[] args) {

	ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
	}
}
