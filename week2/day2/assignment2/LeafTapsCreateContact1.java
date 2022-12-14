package week2.day2.assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafTapsCreateContact1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Launch URL "http://leaftaps.com/opentaps/control/login"
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		//2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		//4. Click on CRM/SFA Link
		driver.manage().window().maximize();
		driver.findElement(By.linkText("CRM/SFA")).click();
		//5. Click on contacts Button
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/contactsMain']")).click();
		//6. Click on Create Contact
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/createContactForm']")) .click();
		//7. Enter FirstName Field Using id Locator
		driver.findElement(By.id("firstNameField")).sendKeys("LTFN");
		//8. Enter LastName Field Using id Locator
		driver.findElement(By.id("lastNameField")).sendKeys("LTLN");
		//9. Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("LocalFN");
		//10. Enter LastName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("LocalFN");
		//11. Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.name("departmentName")).sendKeys("Training");
		//12. Enter Description Field Using any Locator of your choice 
		driver.findElement(By.name("description")).sendKeys("Demo");
		//13. Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("leaftaps1@gmail.com");
		//14. Select State/Province as NewYork Using Visible Text
		WebElement state  = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select stateName = new Select(state);
		stateName.selectByVisibleText("New York");
		//15. Click on Create Contact
		driver.findElement(By.name("submitButton")).click();
		//16. Click on edit button 
		driver.findElement(By.className("subMenuButton")).click(); 
		//17. Clear the Description Field using .clear
		driver.findElement(By.name("description")).clear();
		//18. Fill ImportantNote Field with Any text
		driver.findElement(By.name("importantNote")).sendKeys("Training note"); 
		//19. Click on update button using Xpath locator
		driver.findElement(By.className("smallSubmit")).click(); 
		//20. Get the Title of Resulting Page.
		System.out.println(driver.getTitle());
	}
}