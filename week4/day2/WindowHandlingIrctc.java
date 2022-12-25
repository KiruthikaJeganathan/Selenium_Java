package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandlingIrctc {

	public static void main(String[] args) throws IOException {

		ChromeOptions cd = new ChromeOptions();
		cd.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(cd);
		driver.manage().window().maximize();

		//1. Navigate to https://www.irctc.co.in/
		driver.get("https://www.irctc.co.in/");

		//2. Click on FLIGHTS link
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[contains(text(),'FLIGHTS')]")).click();
		
		//3. Switch to the Flights window
		Set<String> windows = driver.getWindowHandles();
		List<String> windowList = new ArrayList<String>(windows);
		driver.switchTo().window(windowList.get(1));
		
		//4. Take the screenshot of Flights window
		File source = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./snap/irctcflights.jpg");
		FileUtils.copyFile(source, target);
		
		//5. Close the Flights window alone
		driver.close();
		
		//6. Print the Train search window title (First window)
		driver.switchTo().window(windowList.get(0));
		System.out.println(driver.getTitle());
	}
}