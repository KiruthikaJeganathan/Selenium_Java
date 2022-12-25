package week4.day1.assignment1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FramesCherCher {

	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeOptions cd = new ChromeOptions();
		cd.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(cd);
		driver.manage().window().maximize();

		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");

		//Topic
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//b[@id='topic']/following::input")).sendKeys("Selenium Frames");
		//Inner Frame Check Box
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@id='a']")).click();

		//Animals dropdown
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		Select dd = new Select(driver.findElement(By.xpath("//select[@id='animals']")));
		dd.selectByVisibleText("Avatar");
	}
}