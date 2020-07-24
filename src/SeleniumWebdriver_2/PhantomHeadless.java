package SeleniumWebdriver_2;

import java.io.File;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.phantomjs.PhantomJSDriver;
//import org.testng.Assert;

public class PhantomHeadless {

	public static void main(String[] args) {
		
		File src= new File ("E:\\Jino_testing\\Test Automation\\Phantomjs\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		System.setProperty("phantomjs.binary.path", src.getAbsolutePath());
		WebDriver driver =  new PhantomJSDriver();
		 driver.get("https://www.flipkart.com/");
		 String title = driver.getTitle();
		 System.out.println("Title is " +title);
	//	Assert.assertTrue(title.contains("Shopping "));

	}

}
