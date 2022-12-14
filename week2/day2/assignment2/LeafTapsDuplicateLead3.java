package week2.day2.assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapsDuplicateLead3 {

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
		//8	Click on Email
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		//9	Enter Email
		driver.findElement(By.name("emailAddress")).sendKeys("selenium123training123@gmail.com");
		//10	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//11	Capture name of First Resulting lead
		WebElement text = driver.findElement(By.xpath("(//a[@class='linktext'])[6]"));
		String leadName = text.getText();
		//System.out.println(leadName);
		//12	Click First Resulting lead
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		//13	Click Duplicate Lead
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		WebElement txt = driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
		//14	Verify the title as 'Duplicate Lead'
		String title = driver.getTitle();
		//System.out.println(title);
		String title1 = "Duplicate Lead";
		if(title.contains(title1))
		{
			System.out.println("Title is Duplicate Lead");
		}
		else
		{
			System.out.println("Lead is not duplicate");
		}
		//15	Click Create Lead
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		//16	Confirm the duplicated lead name is same as captured name
		WebElement text1 = driver.findElement(By.xpath("(//span[@class='tabletext'])[4]"));
		String leadName1 = text1.getText();
		//System.out.println(leadName1);
		if(leadName.equals(leadName1))
		{
			System.out.println("Duplicate lead name is same as captured name");
		}
		else
		{
			System.out.println("Duplicate lead name is not same as captured name");
		}
		//17	Close the browser (Do not log out)
		driver.close();

	}
}