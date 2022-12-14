package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps");

		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("DemoSalesManager");

		WebElement password  = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");

		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();

		driver.manage().window().maximize();

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();		
	}
}