package week2.day2.assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapsEditLead4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1	Launch the browser
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		//2	Enter the username
		driver.findElement(By.id("username")).sendKeys("democsr");
		//3	Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//4	Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		//5	Click crm/sfa link
		driver.manage().window().maximize();
		driver.findElement(By.linkText("CRM/SFA")).click();
		//6	Click Leads link
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']")).click();
		//7	Click Find leads
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
		//8	Enter first name
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Selenium789");
		//9	Click Find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//10 Click on first resulting lead
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		//11 Verify title of the page
		System.out.println(driver.getTitle());
		//12 Click Edit
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
		//13 Change the company name
		String name = "789";
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(name);
		System.out.println(name);
		//14 Click Update
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		//15 Confirm the changed name appears
		WebElement text = driver.findElement(By.id("viewLead_companyName_sp"));
		String name1 = text.getText();
		System.out.println(name1);
		if(name1.contains(name))
		{
			System.out.println("Changed name is appearing");
		}
		else
		{
			System.out.println("Changed name is not appearing");
		}
		//16 Close the browser (Do not log out)
		driver.close();
	}
}