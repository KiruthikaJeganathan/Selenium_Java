package week4.day1.assignment3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertBuyTheValue {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions cd = new ChromeOptions();
		cd.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(cd);
		driver.manage().window().maximize();

		//1. Load https://buythevalue.in/
		driver.get("https://buythevalue.in/");

		//2. Click on first product (eg: Hamdard Hing - 50GM)
		driver.findElement(By.className("product-title")).click();

		//Handle Frame
		//3. Close chat widget
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='chat widget']")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@aria-label='Dismiss']")).click();

		//4. Enter the pincode
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("600044");

		//5. Click on Check
		WebElement chk = driver.findElement(By.xpath("//input[@value='Check']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", chk);

		//6. Click on ADD TO CART
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='product-add-to-cart']")).click();

		//7. Click on View
		Thread.sleep(500);
		driver.findElement(By.xpath("(//a[text()='View Cart'])[2]")).click();

		//8. Click on CHECK OUT
		WebElement check = driver.findElement(By.xpath("//input[@id='checkout']"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", check);

		//Handle alert
		//9. Accept the alert
		Alert a = driver.switchTo().alert();
		a.accept();
	}
}