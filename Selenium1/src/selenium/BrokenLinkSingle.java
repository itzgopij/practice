package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BrokenLinkSingle {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String url = driver.findElement(By.cssSelector("a[href*='broken']")).getAttribute("href");
		
		
		//HttpURLConnection conn = (HttpURLConnection) new URL(url)
	    HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
	
	    conn.setRequestMethod("HEAD");
	    conn.connect();
	    int respCode = conn.getResponseCode();
	    
	    Assert.assertTrue(respCode<400);
	    
 }

 }
