package SeleniumWebdriver_2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleFileUploadAutoIt {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

		System.setProperty("webdriver.chrome.driver",
				"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver81\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[@id='wdgt-file-upload']")).click();
		Thread.sleep(8000);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		Runtime.getRuntime().exec("C:\\Users\\Jino\\Desktop\\New folder (4)\\multiple\\FileUpload.exe " + "  "
				+ "E:\\Jino_work\\Work_documents\\ResourceRequestform1-QA.docx");
		Thread.sleep(4000);

		WebElement el1 = driver.findElement(By.id("name"));
		wait.until(ExpectedConditions.visibilityOf(el1)).sendKeys("jnio");

		WebElement el = driver.findElement(By.xpath("//i[@class='naukicon naukicon-cross']"));

		wait.until(ExpectedConditions.visibilityOf(el)).click();

		driver.findElement(By.xpath("//label[@id='wdgt-file-upload']")).click();

		Thread.sleep(4000);
		Runtime.getRuntime().exec("C:\\Users\\Jino\\Desktop\\New folder (4)\\multiple\\FileUpload.exe  " + "  "
				+ "E:\\Jino_work\\JINO015RESUME.doc");

		WebElement el3 = driver.findElement(By.xpath("//i[@class='naukicon naukicon-cross']"));

		wait.until(ExpectedConditions.visibilityOf(el3)).click();
		
		driver.findElement(By.xpath("//label[@id='wdgt-file-upload']")).click();

		Thread.sleep(4000);
		Runtime.getRuntime().exec("C:\\Users\\Jino\\Desktop\\New folder (4)\\multiple\\FileUpload.exe  " + "  "
				+ "E:\\Jino_work\\resume.docx");

	}

}
