package week4.day1.assignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FrameServiceNow {

	public static void main(String[] args) {

		ChromeOptions cd = new ChromeOptions();
		cd.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(cd);
		driver.manage().window().maximize();

		//https://dev110326.service-now.com/
		driver.get("https://dev110326.service-now.com/");
		//Username: admin
		//Password: India@123

		//1. switchTo() frame using ID /Name
		driver.switchTo().frame("gsft_main");

		//2. Enter username
		driver.findElement(By.id("user_name")).sendKeys("admin");

		//3. Enter password
		driver.findElement(By.id("user_password")).sendKeys("India@123");

		//4. Click Login button
		driver.findElement(By.id("sysverb_login")).click();
	}
}