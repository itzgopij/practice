import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class E2E_Testing {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(8));
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//input[@autocapitalize='sentences']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Bengaluru')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[contains(@class,'19yat4t')] //div[contains(text(),'Chennai')]")));
		
		//driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//div[contains(@class,'19yat4t')] //div[contains(text(),'Chennai')]")).click();

	}

}
