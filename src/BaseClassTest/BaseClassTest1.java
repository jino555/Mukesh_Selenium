package BaseClassTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import SeleniumWebDriver_3.BaseClass;

public class BaseClassTest1 extends BaseClass {

	@Test
	public void verifyLogin() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("jino");
		driver.findElement(By.id("pass")).sendKeys("9734444");
		System.out.println("Details entered");
	}

	@Test
	public void verifyTitle() throws InterruptedException {

		System.out.println("Title " + driver.getTitle());
	}

}
