package SeleniumWebdriver_2;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SendEmails {
	static WebDriver driver;
	
	static String message ="To sign up for Gmail, create a Google Account. You can use the username and password to sign in to Gmail and other Google products like YouTube, Google Play, and Google Drive.";
	
	@BeforeTest
	public static void start() {
	
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver",
				"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver83\\chromedriver.exe");

		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
	}
	
	
	@Test
public void validation() {
		
		String actualTitle =driver.getTitle();
		System.out.println("Title "+actualTitle);
		Assert.assertEquals(actualTitle, "Facebook");
		
		
	}
	@AfterMethod
	
	public void end(ITestResult result) throws Exception {
		
		
		if(result.getStatus()==ITestResult.FAILURE) {
			
			try {
				sendEmail();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	
		public static void sendEmail() throws EmailException {
		Email email = new SimpleEmail();	
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(587);
		email.setAuthenticator(new DefaultAuthenticator("jinophilip555qa@gmail.com","9745754904"));
		email.setSSLOnConnect(false);
		email.setFrom("test@gmail.com");
		email.setSubject("Test");
		email.setMsg(SendEmails.message);
	
	    email.addTo("jinophilip555qa@gmail.com");
		email.send();
	
		
		System.out.println("Mail sent");
		}
}

	