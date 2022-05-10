package sampleMaven;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShot {

	static WebDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\CANDIDPIC\\eclipse-workspace\\DemoSlenium\\Drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
				
		takeScreenShot("Facebook_LoginPage");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
		
	}	
		public static void takeScreenShot(String fileName) throws IOException {
			
			File SS =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(SS, new File ("C:\\Users\\CANDIDPIC\\eclipse-workspace\\DemoSlenium\\ScreenShots\\"+fileName+".jpg"));
			
			
		

	}

}
