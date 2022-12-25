package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ImplicitWaitSalesForce {

	public static void main(String[] args) {

		//1. Login to Salesforce.com
		ChromeOptions cd = new ChromeOptions();
		cd.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(cd);
		driver.manage().window().maximize();

		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		driver.findElement(By.id("Login")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//2. Click on Toggle Menu
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();

		//3. Click on view All
		driver.findElement(By.xpath("//button[text()='View All']")).click();
	}
}