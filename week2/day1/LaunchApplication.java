package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com");

		/*WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();

		driver.get("https://www.facebook.com");*/
	}
}