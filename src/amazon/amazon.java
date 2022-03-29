package amazon;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazon {
	
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SR\\eclipse-workspace\\amazon\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		JavascriptExecutor jk = (JavascriptExecutor)driver;
		
		Actions a = new Actions(driver);
		Robot r = new Robot();
		
		
		Thread.sleep(2000);
		
		WebElement md = driver.findElement(By.id("q"));
		md.sendKeys("txt");
		a.moveToElement(md);
		a.contextClick();
		
		Thread.sleep(5000);
		
	for(int i=0; i<3; i++) {
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
		
			
	}
	    
	    
		
		
		
		
	
		
		
		
			
			
	
	}

		
		
