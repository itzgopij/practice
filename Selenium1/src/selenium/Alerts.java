package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Alerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String name = "Gopinath";
		driver.findElement(By.name("enter-name")).sendKeys(name);
		driver.findElement(By.id("alertbtn")).click();

		String alertText = driver.switchTo().alert().getText();
		String[] split = alertText.split(",");
		String finalText = split[0].split(" ")[1];
		Assert.assertEquals(name, finalText);

		System.out.println(finalText);
		driver.switchTo().alert().accept();

		driver.findElement(By.id("confirmbtn")).click();
		driver.switchTo().alert().dismiss();

		driver.close();
	}

}
