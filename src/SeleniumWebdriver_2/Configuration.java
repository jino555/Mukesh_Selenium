package SeleniumWebdriver_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class Configuration {

	static Properties pro;

	public static void main(String[] args) throws Exception {

	Configuration con = new Configuration();

		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

		System.setProperty("webdriver.chrome.driver",
				"E:\\Jino_testing\\Test Automation\\Chrome_driver\\chromedriver81\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//driver.get(con.getUrl());
		driver.get(pro.getProperty("URL"));//ABSTRACIION(hiding internal details)


	}

	public Configuration() throws Exception {

		File src = new File("./Configuration/Config.property");
		FileInputStream fis = new FileInputStream(src);

		pro = new Properties();
		pro.load(fis);

	}

/*public String getUrl() {

	//String webUrl = pro.getProperty("URL");

		//System.out.println("url is  " + webUrl);

		//return webUrl;
	return pro.getProperty("URL");
	
		
	}*/

}
