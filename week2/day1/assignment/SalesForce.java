package week2.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();

		driver.get("https://login.salesforce.com");

		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("hari.radhakrishnan@qeagle.com");

		WebElement password  = driver.findElement(By.id("password"));
		password.sendKeys("Testleaf$321");

		WebElement login = driver.findElement(By.id("Login"));
		login.click();
	}
}