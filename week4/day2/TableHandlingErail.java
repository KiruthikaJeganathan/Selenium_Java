package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TableHandlingErail {

	public static void main(String[] args) {

		ChromeOptions cd = new ChromeOptions();
		cd.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(cd);
		driver.manage().window().maximize();

		//Verify train names are unique in https://erail.in/
		//1. Navigate to https://erail.in/
		driver.get("https://erail.in/");

		//2. Clear the text in source and enter "ms" and tab
		WebElement c = driver.findElement(By.id("txtStationFrom"));
		c.clear();
		c.sendKeys("ms", Keys.TAB);

		//3. Clear the text in destination and enter "mdu" and tab
		WebElement c1 = driver.findElement(By.id("txtStationTo"));
		c1.clear();
		c1.sendKeys("mdu", Keys.TAB);

		//4. Uncheck sort on date
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();

		//5. Get all  the train names and verify whether any duplicate train name is there or not
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> tn = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr"));
		Set<String> tl = new LinkedHashSet<String>();

		for(int i=2; i<=tn.size(); i++) {
			String name = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr["+i+"]/td[2]")).getText();
			System.out.println(name);
			tl.add(name);
		}

		if(tn.size()-1 == tl.size())
		{
			System.out.println("No Duplicates");
		}
		else
		{
			System.out.println("Duplicate Train Names are present");
		}
	}
}