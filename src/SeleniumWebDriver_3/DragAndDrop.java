package SeleniumWebDriver_3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

static 	WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

		System.setProperty("webdriver.chrome.driver",
				"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver83\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
	//driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		
		Actions act = new Actions(driver);
JavascriptExecutor js = (JavascriptExecutor) driver;
		
	
		js.executeScript("scroll(0, 400)");
		
		//to check clicking on the arrow

		//driver.findElement(By.xpath("(//div[@class='dxi dxi-menu-down dhx_tree-toggle-button dhx_tree-toggle-button--open'])[1]")).click();

//1ST METHOD(Recommended)
		
	/*WebElement src =driver.findElement(By.xpath("//span[text()='Learning DHTMLX Suite UI']"));
	//WebElement dest =driver.findElement(By.xpath("//li[text()='Ajax in Practice']"));

	WebElement dest =driver.findElement(By.xpath("//div[@id='treeTarget'] "));
		act.dragAndDrop(src, dest).perform();
*/
		
		//another method -2
	/*	
WebElement src =driver.findElement(By.xpath("//span[text()='Learning DHTMLX Suite UI']"));
			
		WebElement dest =driver.findElement(By.xpath("//li[text()='Ajax in Practice']"));

		act.clickAndHold(src)
	.pause(2000)
		.moveToElement(dest)
		.release()
		.build()
		.perform();	
		*/
		
		
		//3rd method Without DragAndDrop
		driver.get("https://jqueryui.com/draggable/");
		
		 int size =driver.findElements(By.tagName("iframe")).size();
		 System.out.println("frame size "+size);
		 
		driver.switchTo().frame(0);
		
		WebElement src =driver.findElement(By.id("draggable"));
		act.dragAndDropBy(src,250, 0).perform();;

		
}
}
