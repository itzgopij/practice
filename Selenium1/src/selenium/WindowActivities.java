package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		driver.findElement(By.className("gb_H")).click();
		//driver.navigate().to("https://www.google.com/search?q=facebook&rlz=1C1CHBD_enIN1069IN1069&oq=facebook&aqs=chrome.0.0i271j46i67i131i199i433i465i512i650j0i67i131i433i512i650j0i67i512i650j0i433i512j0i131i433i512l2j5.2721j0j4&sourceid=chrome&ie=UTF-8");
		driver.get("https://www.google.com/search?q=instagram&rlz=1C1CHBD_enIN1069IN1069&oq=instagram&aqs=chrome..69i57j35i39i512i650l2j0i131i433i512l4j5.3521j0j9&sourceid=chrome&ie=UTF-8");
		driver.navigate().back();
		
		driver.navigate().forward();
		driver.navigate().refresh();
	driver.manage().window().minimize();
		
		
	}

}
