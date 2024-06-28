package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions a = new Actions(driver);
		WebElement targetElement1 = driver.findElement(By.cssSelector("#nav-link-accountList"));
		a.moveToElement(targetElement1).build().perform();
		WebElement targetElement2 = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		a.moveToElement(targetElement2).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
        a.moveToElement(targetElement1).contextClick().build().perform();
        
        
        
        
        
		
		
		
		
		
		
		
		

	}

 }
