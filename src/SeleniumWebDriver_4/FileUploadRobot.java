package SeleniumWebDriver_4;

import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FileUploadRobot

{

	public static void main(String[] args) throws InterruptedException, AWTException

	{

		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

		System.setProperty("webdriver.chrome.driver",
				"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver83\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		StringSelection sel = new StringSelection("E:\\Jino_testing\\Testing_documents\\QA PROCESS_Entiros.docx");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		System.out.println("selection" + sel);

		// Open Monster.com
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);

		// This will scroll down the page
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("scroll(0,350)");

		// Wait for 5 seconds
		Thread.sleep(5000);

		// This will click on Browse button
		driver.findElement(By.id("wdgt-file-upload")).click();

		System.out.println("Browse button clicked");

		// Create object of Robot class
		Robot robot = new Robot();
		Thread.sleep(1000);

		// Press Enter

		// Release Enter
		robot.keyRelease(KeyEvent.VK_ENTER);

		// Press CTRL+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		// Release CTRL+V
	///	robot.keyRelease(KeyEvent.VK_CONTROL);
	//	robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);

		// Press Enter�
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}