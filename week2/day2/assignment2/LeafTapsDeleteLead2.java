package week2.day2.assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LeafTapsDeleteLead2 {

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
		//8	Click on Phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//9	Enter phone number
		driver.findElement(By.name("phoneNumber")).sendKeys("159159");
		//10	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//11	Capture lead ID of First Resulting lead
		String firstLead = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		System.out.println(firstLead);
		//12	Click First Resulting lead
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		//13	Click Delete
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		//14	Click Find leads
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
		//15	Enter captured lead ID
		driver.findElement(By.name("id")).sendKeys(firstLead);
		//16	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		WebElement text = driver.findElement(By.xpath("//div[text()='No records to display']"));
		String message = text.getText();
		String message1 = "No records to display";
		if(message.contains(message1))
		{
			System.out.println("Lead successfully deleted");
		}
		else
		{
			System.out.println("Lead not deleted");
		}
		/*18	Close the browser (Do not log out)*/
		driver.close();
	}
}