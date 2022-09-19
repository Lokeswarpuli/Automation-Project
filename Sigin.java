package Lokeswar_Test_case;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sigin{
	
	static {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\puli.lokeswar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	}
	WebDriver driver = new ChromeDriver();
	
	@Test(priority = 1)
	public void launchBrowser() {
	driver.get("https://mobileworld.banyanpro.com/");
	driver.manage().window().maximize();
	
	}
	
	@Test(priority = 2)
	public void SignIn() throws InterruptedException {
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(1500);

	}
	
	@Test(priority = 3)
	public void userName() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("Puli");
		Thread.sleep(1500);
		
	}
	
	@Test(priority = 4)
	public void enterPassword() throws InterruptedException {
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("paSSword");
		Thread.sleep(1500);	
		
	}
	
	@Test(priority = 5)
	public void login() throws InterruptedException {
		driver.findElement(By.cssSelector("a[type='submit']")).click();
		Thread.sleep(1500);
		
	}
}
	
