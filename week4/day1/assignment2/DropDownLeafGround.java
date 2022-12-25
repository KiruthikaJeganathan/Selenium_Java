package week4.day1.assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDownLeafGround {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions cd = new ChromeOptions();
		cd.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(cd);
		driver.manage().window().maximize();

		driver.get("https://leafground.com/select.xhtml;jsessionid=node01b6hhw7csjf211q4hnvqtdlyg710515.node0");

		//Which is your favorite UI Automation tool?
		Select tool = new Select(driver.findElement(By.xpath("//select[@class='ui-selectonemenu']")));
		tool.selectByVisibleText("Cypress");

		//Choose your preferred country.
		driver.findElement(By.id("j_idt87:country_label")).click();
		driver.findElement(By.xpath("(//li[@class='ui-selectonemenu-item ui-selectonemenu-list-item ui-corner-all'])[3]")).click();

		//Confirm Cities belongs to Country is loaded
		Thread.sleep(1000);
		driver.findElement(By.id("j_idt87:city_label")).click();
		driver.findElement(By.xpath("(//li[@class='ui-selectonemenu-item ui-selectonemenu-list-item ui-corner-all'])[5]")).click();

		//Choose the Course
		WebElement course = driver.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s']"));
		course.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.findElement(By.xpath("//li[text()='Playwright']")).click();

		//Choose language randomly
		driver.findElement(By.id("j_idt87:lang_label")).click();
		driver.findElement(By.xpath("//li[@data-label='English']")).click();

		//Select 'Two' irrespective of the language chosen
		Thread.sleep(1000);
		driver.findElement(By.id("j_idt87:value_label")).click();
		driver.findElement(By.xpath("//li[@data-label='Two']")).click();
	}
}