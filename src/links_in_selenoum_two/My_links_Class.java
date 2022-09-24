package links_in_selenoum_two;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class My_links_Class {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\my new driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https:\\www.facebook.com");
// 1 - count all the links in the page 

		System.out.println(driver.findElements(By.tagName("a")).size());

		// 2- count only the links in the footer the myfooter is a mini driver
		WebElement myfooter = driver.findElement(By.id("pageFooter"));
		System.out.println(myfooter.findElements(By.tagName("a")).size());

		// 3- count the item in the latest footer

		WebElement myfootertwo = driver.findElement(By.id("pageFooterChildren"));

		System.out.println(myfootertwo.findElements(By.tagName("a")).size());

//		 4- open the links in separated tabs (this will fail )

//		for (int i = 0; i < myfootertwo.findElements(By.tagName("a")).size(); i++) {
//			Thread.sleep(2000);
//			myfootertwo.findElements(By.tagName("a")).get(i).click();
//
//
//		}

//		 5- open the links in separated tabs (this will pass )
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
for (int i = 0; i < myfootertwo.findElements(By.tagName("a")).size(); i++) {
String openLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
myfootertwo.findElements(By.tagName("a")).get(i).sendKeys(openLink);

		}

	}

}
