package week2.day2.assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UiPathLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Load url "https://acme-test.uipath.com/login"
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		//2. Enter email as "kumar.testleaf@gmail.com"
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		//3. Enter Password as "leaf@12"
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		//4. Click login button
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		//5. Get the title of the page and print
		System.out.println(driver.getTitle());
		//6. Click on Log Out
		driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		//7. Close the browser (use -driver.close())
		driver.close();
	}
}