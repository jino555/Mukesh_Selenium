package SeleniumWebdriver_1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver81\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.payaid.asia/");

		List<WebElement> el = driver.findElements(By.tagName("a"));
		int linksSize = el.size();
		System.out.println("Size of links " + linksSize);

		for (int i = 0; i < linksSize; i++) {

			WebElement ele = el.get(i);
			String url = ele.getAttribute("href");

			verifyLinks(url);

		}
	}

	public static void verifyLinks(String link) throws IOException {

		try {
			URL url = new URL(link);

			// open connection method create a connection and will return object of
			// HttpURLConnection class
			HttpURLConnection httpURLConnect = (HttpURLConnection)url.openConnection();

			// timeout will wait for given secs to throw exception,
			// sometimes takes time to send the req and recieve response

			 httpURLConnect.setConnectTimeout(3000);

			httpURLConnect.connect();

			if (httpURLConnect.getResponseCode() == 200) {

				System.out.println(link + "- " +httpURLConnect.getResponseCode() +"-"  + httpURLConnect.getResponseMessage());
				
				int code = httpURLConnect.getResponseCode();
				Assert.assertEquals(code, 200);
				System.out.println("Test case passed");
			}
			
			else  {
				
				System.out.println(link + "- " +httpURLConnect.getResponseCode() +"-"  + httpURLConnect.getResponseMessage());
				
				String code = " " +httpURLConnect.getResponseCode();
		
				
		String exCode = "200";
				
				
				Assert.assertTrue(!exCode.equals(code));
				System.out.println("Test case failed");
				
				//check later with soft assert concept to avid TC failing
			}
	

			/*if (httpURLConnect.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {

				System.out.println(
						link + "- " + httpURLConnect.getResponseMessage() + "-" + HttpURLConnection.HTTP_NOT_FOUND);

				int code = httpURLConnect.getResponseCode();
			Assert.assertEquals(code, 200);
				System.out.println("Test case failed");
				
				}*/
				
				
			
		} catch (Exception e) {
	
			System.out.println("Error");
		}

	}

}
