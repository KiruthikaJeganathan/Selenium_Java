package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);

		List<WebElement> priceList = driver.findElements(By.className("a-price-whole"));
		List<Integer> phonePrices = new ArrayList<Integer>();

		for(int i=0; i<priceList.size(); i++)
		{
			//System.out.println(priceList.get(i).getText());
			String pp = priceList.get(i).getText().replaceAll(",", "");
			if(!pp.trim().equals(""))
			{
				int price = Integer.parseInt(pp);
				phonePrices.add(price);
			}
		}
		Collections.sort(phonePrices);
		System.out.println(phonePrices.get(0));
	}
}