package Test123.JenkinsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HelloWorld4
{
	WebDriver driver;
	@Test
	  public void launchBrowser()
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
	      driver.get("https://www.Google.com");
	      System.out.println("Page accessed successfully");
	      driver.close();
	  }
}
