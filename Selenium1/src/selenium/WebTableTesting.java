package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		//WebElement table = driver.findElement(By.cssSelector("table[name='courses']"));
		List<WebElement> courseNames = driver.findElements(By.xpath("//table[@name='courses'] //td[2]")); 
		
		for(WebElement e:courseNames) {
			System.out.println(e.getText());
		}

	}

}
