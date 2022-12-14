package week2.day2.assignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Step 1 & 2: Download and set the path & Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// Step 6: Click on Create New Account button
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		// Step 7: Enter the first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("New");
		// Step 8: Enter the last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("User");
		// Step 9: Enter the mobile number
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9876543219");
		// Step 10: Enter the password
		driver.findElement(By.id("password_step_input")).sendKeys("testfb@1");
		// Step 11: Handle all the three drop downs
		//select Day in DOB
		WebElement day  = driver.findElement(By.id("day"));
		Select day1 = new Select(day);
		day1.selectByVisibleText("4");
		//select Month in DOB
		WebElement month  = driver.findElement(By.id("month"));
		Select month2 = new Select(month);
		month2.selectByValue("7");
		//select Year in DOB
		WebElement year  = driver.findElement(By.id("year"));
		Select year3 = new Select(year);
		year3.selectByIndex(29);
		// Step 12: Select the radio button "Female" 
		driver.findElement(By.className("_8esa")).click();
	}
}