package SeleniumWebdriver_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class VerifyErrorMessage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver83\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    
    //Works with .getText or getAttribute("innerHTML")
    
  
try {
	boolean val = driver.findElement(By.xpath("//div[contains(text(),'your name')]")).isDisplayed();
	 System.out.print("Value  "+val);
} catch (Exception e) {
	System.out.print("not present");
}

 
  
  List<WebElement> ls =driver.findElements(By.xpath("//div[contains(text(),'your name')]"));
  
  System.out.println("size  "+ls.size());
  
  driver.close();
   /*String errorMsg =  driver.findElement(By.xpath("//div[contains(text(),'your name')]")).getAttribute("innerHTML");
    System.out.print("Error message "+errorMsg);
    
    
    
    Assert.assertTrue(errorMsg.contains("name"));*/
    
    
    
    

	}

}
