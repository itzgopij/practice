package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector("a[class*='blinking']")).click();
		Set<String> windows= driver.getWindowHandles();
		Iterator<String> it= windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		String[] text = driver.findElement(By.cssSelector("p[class*='red']")).getText().split(" ");
		String userName = text[4].trim();		
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(userName);
		System.out.println(userName);
		
		

	}

}
