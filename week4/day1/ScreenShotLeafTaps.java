package week4.day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScreenShotLeafTaps {

	public static void main(String[] args) throws IOException {

		ChromeOptions cd = new ChromeOptions();
		cd.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(cd);
		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/control/main");

		//Step 1: Take the Screenshot
		File source = driver.getScreenshotAs(OutputType.FILE);

		//Step 2: Decide / Define the Target file
		File target = new File("./snap/leaftaps.jpg");

		//Step 3: Save the Source to Target
		FileUtils.copyFile(source, target);
	}
}