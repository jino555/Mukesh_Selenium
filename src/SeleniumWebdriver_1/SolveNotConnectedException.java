package SeleniumWebdriver_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SolveNotConnectedException {

	public static void main(String[] args) {


	
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://google.com/");
	}

}
