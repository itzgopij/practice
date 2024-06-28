package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class FriendlyLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		WebElement nameBox = driver.findElement(By.cssSelector("input[name='name']:nth-child(2)"));

		System.out.println(driver.findElement(with(By.tagName("label")).above(nameBox)).getText());

		WebElement dob = driver.findElement(By.cssSelector("label[for*='ofBirth']"));

		driver.findElement(with(By.tagName("input")).below(dob)).click();

		WebElement iceCream = driver.findElement(By.cssSelector("label[for*='Check1']"));

		driver.findElement(with(By.tagName("input")).toLeftOf(iceCream)).click();

		WebElement radioBtn = driver.findElement(By.id("inlineRadio1"));

		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radioBtn)).getText());

	}

 }
