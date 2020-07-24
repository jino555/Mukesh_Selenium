package SeleniumWebdriver_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver81\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://www.facebook.com/");

		System.out.println(driver.getTitle());
		
		System.out.println("************************");

		WebElement month = driver.findElement(By.id("month"));
		Select sel = new Select(month);

		// GET 1ST SELECTED OPTION
		WebElement firstSel = sel.getFirstSelectedOption();
		System.out.println("First selected on page load " +firstSel.getText());
		
		System.out.println("************************");


		// SELECTING DROPDOWNS
		Thread.sleep(2000);
		
		sel.selectByIndex(5);// May
		
		Thread.sleep(2000);
		
		sel.selectByValue("7");// july
		
		Thread.sleep(2000);
		
		sel.selectByVisibleText("Nov");
		

		// GET 1ST SELECTED OPTION

		WebElement firstSel1 = sel.getFirstSelectedOption();
		System.out.println("Now selected after operation  " +firstSel1.getText());
		
		System.out.println("************************");


		// GET OPTIONS (only in select class)

		List<WebElement> list = sel.getOptions();

		int size = list.size();

		System.out.println(size);

		for (WebElement ele : list)

		{

			String monthText = ele.getText();
			System.out.println("Get all options in dropdown " +monthText);

		}
		
		System.out.println("************************");*/


		//GET ALL SELECTED OPTION-useful for multiselect (ie one dropdown has
		// multiselect values)

		
		driver.get("https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html");
		
		WebElement se = driver.findElement(By.xpath("//select[@class='js-example-basic-multiple select2-hidden-accessible']"));
		Select sel1 = new Select(se);
		sel1.selectByValue("AK");
		sel1.selectByIndex(3);//Arkansas
		sel1.selectByVisibleText("Kansas");
		
		List<WebElement> list1 = sel1.getAllSelectedOptions();
		
		System.out.println("Size of multiselect "+list1.size());
		
		for(WebElement el : list1) {
			
			
			System.out.println(el.getText());
			
		}
	}
}
