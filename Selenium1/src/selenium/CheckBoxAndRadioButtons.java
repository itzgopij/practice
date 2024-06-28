package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxAndRadioButtons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		Assert.assertEquals(6, driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		System.out.println("Number of CheckBoxes present in the page:"+driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		System.out.println("Number of RadioButtons present in the page:"+driver.findElements(By.xpath("//input[@type='radio']")).size());
		
		


	}

}
