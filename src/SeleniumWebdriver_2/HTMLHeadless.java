package SeleniumWebdriver_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class HTMLHeadless {

	public static void main(String[] args) {


		WebDriver driver =  new HtmlUnitDriver();
		 driver.get("https://www.flipkart.com/");
		 String title = driver.getTitle();
		 System.out.println("Title is " +title);
		//Assert.assertTrue(title.contains("Shopping "));
		
	}

}
