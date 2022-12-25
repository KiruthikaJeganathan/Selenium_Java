package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertAndFrameW3Schools {

	public static void main(String[] args) {

		ChromeOptions cd = new ChromeOptions();
		cd.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(cd);
		driver.manage().window().maximize();

		//1. Load https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

		//2. click Try it button
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();

		//3. Enter your name in the prompt alert
		Alert a = driver.switchTo().alert();
		a.sendKeys("Kiruthika");

		//4. Click Ok in the alert
		a.accept();

		//5. get the text below Try it button and print
		String txt = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(txt);
	}
}