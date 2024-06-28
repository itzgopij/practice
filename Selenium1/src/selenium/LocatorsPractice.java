package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

  

public class LocatorsPractice { 

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String userName="Gopi";
		
		driver.manage().window().maximize();
		
		String url = "https://rahulshettyacademy.com/locatorspractice/";
		driver.get(url);
		String currenturl=driver.getCurrentUrl();
		Assert.assertEquals(currenturl, url);
		driver.findElement(By.id("inputUsername")).sendKeys(userName); 
		driver.findElement(By.name("inputPassword")).sendKeys("Gopi123"); 
		driver.findElement(By.cssSelector("input[name='chkboxOne']")).click(); 
		driver.findElement(By.xpath("//input[@name='chkboxTwo']")).click(); 
		
		driver.findElement(By.cssSelector("button[class*='signInBtn']")).click(); 
		 
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(8)); 
		w.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("p"))); 
		
		
		
		String errormsg=driver.findElement(By.tagName("p")).getText(); 
		
		Assert.assertEquals(errormsg, "* Incorrect username or password");
		
		driver.findElement(By.linkText("Forgot your password?")).click(); 
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='Name']"))); 
		
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Gopinath");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("jegangopieee@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("9566342621");
		driver.findElement(By.xpath("//button[contains(text(),'Reset Login')]")).click();
		
		String msg=driver.findElement(By.className("infoMsg")).getText(); 
		
		 
		Assert.assertEquals(msg, "Please use temporary password 'rahulshettyacademy' to Login.");
                
		driver.findElement(By.cssSelector("button[class*='go-to']")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("inputUsername")));
		driver.findElement(By.id("inputUsername")).sendKeys(userName); 
		String[] passwordArray= msg.split("'");
		String password=passwordArray[1].split("'")[0];
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		
		
		driver.findElement(By.cssSelector("button[class*='signInBtn']")).click();
		Thread.sleep(5000);
		String text=driver.findElement(By.xpath("//h2")).getText();
		
		
		String [] text1=text.split(" ");
		String finalText[]=text1[1].split(",");
		
		Assert.assertEquals(userName, finalText[0]); 
		
		//System.out.println(finalText[0]);
		
		driver.findElement(By.xpath("//button[(text()='Log Out')]")).click();
	    
		driver.quit(); 
		
		System.out.println("SUCCESS");

	}

}
