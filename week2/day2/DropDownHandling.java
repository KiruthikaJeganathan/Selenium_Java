package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {

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

		//Step 1: Locate the Parent element which is having <select>
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		//Step 2: Create Object for Select class and pass the Parent web element
		Select dropDown = new Select(source);
		//Step 3: Select the value using Visible text
		dropDown.selectByVisibleText("Conference");

		WebElement industry  = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropDown1 = new Select(industry);
		dropDown1.selectByValue("IND_FINANCE");

		WebElement ownership  = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropDown2 = new Select(ownership);
		dropDown2.selectByIndex(5);
	}
}