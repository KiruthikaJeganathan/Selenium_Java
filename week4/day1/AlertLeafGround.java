package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertLeafGround {

	public static void main(String[] args) {
		
		ChromeOptions cd = new ChromeOptions();
		cd.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(cd);
		driver.manage().window().maximize();

		//1. Click on the Show button next to Confirm Dialog
		driver.get("https://leafground.com/alert.xhtml");
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		
		//2. Get the text from the alert and print it in the console
		Alert a = driver.switchTo().alert();
		String am = a.getText();
		System.out.println(am);
		
		//3. Accept the Confirm alert
		a.accept();
	}
}