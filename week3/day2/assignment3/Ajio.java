package week3.day2.assignment3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ajio {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions cd = new ChromeOptions();
		cd.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(cd);
		driver.manage().window().maximize();

		//1. Launch the URL https://www.ajio.com/
		driver.get("https://www.ajio.com/");
		//2. In the search box, type as "bags" and press enter
		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
		//3. To the left  of the screen under " Gender" click the "Men"
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		//4. Under "Category" click "Fashion Bags"
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		//5. Print the count of the items Found.
		Thread.sleep(2000);
		String txt = driver.findElement(By.className("length")).getText();
		System.out.println(txt);
		//6. Get the list of brand of the products displayed in the page and print the list.
		List<WebElement> br = driver.findElements(By.xpath("//div[@class='brand']"));
		for (WebElement brn : br)
		{
			String brandName = brn.getText();
			System.out.println(brandName);
		}
		//7. Get the list of names of the bags and print it
		List<WebElement> bg = driver.findElements(By.xpath("//div[@class='nameCls']"));
		for (WebElement bn : bg)
		{
			String bagName = bn.getText();
			System.out.println(bagName);
		}
	}
}