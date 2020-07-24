package SeleniumWebdriver_1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingAndScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver83\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.goibibo.com/");
     
      
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Scrolling
		//js.executeScript("scroll(0, 1200)");
		
		
                //Scroll into view
	WebElement el = driver.findElement(By.xpath("//p[text()='Book Tickets faster. Download our mobile Apps']"));
		
		//Scroll into View
		js.executeScript("arguments[0].scrollIntoView(true);", el);

		System.out.print("Text is " + el.getText());
		Thread.sleep(3000);
		js.executeScript("scroll(0, -400)");
	}

}
