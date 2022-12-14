package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();

		driver.get("https://login.salesforce.com");

		driver.manage().window().maximize();

		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("hari.radhakrishnan@qeagle.com");

		driver.findElement(By.partialLinkText("Forgot")).click();
	}
}