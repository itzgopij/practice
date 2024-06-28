package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokingBrowsers {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="https://rahulshettyacademy.com/";
		driver.get(url);
		System.out.println(driver.getTitle());
		String crnturl=driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		if(url.equals(crnturl))
		System.out.println("Same");
		
		else
			System.out.println("Wrong");
		//System.out.println(driver.getPageSource());
		//driver.close();
		
		/* webdriver.chrome.driver  WebDriver driver = new chromeDriver();
		 webdriver.gecko.driver     WebDriver driver = new FirefoxDriver();
		 webdriver.edge.driver      WebDriver driver = new EdgeDriver();
		 */
		
		
		
		
		
		
		
		
		
		
		



	}

}
