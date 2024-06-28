package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class ScreenshotTest {

	public static void main(String[] args) throws IOException {

               System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi\\Downloads\\chromedriver\\chromedriver.exe");
               ChromeOptions options = new ChromeOptions();
               options.setAcceptInsecureCerts(true);
               WebDriver driver = new ChromeDriver(options);
               driver.manage().window().maximize();
               driver.get("https://expired.badssl.com/");
               System.out.println(driver.getTitle());
               driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwjHw8W_3dCEAxUu4zgGHdHSBToQPAgJ");
               
               File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
               FileUtils.copyFile(src, new File("C:\\Users\\Gopi\\Downloads\\screenshot.png"));


	}

}
