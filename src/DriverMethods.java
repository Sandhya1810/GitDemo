import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverMethods {
	
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JavaWorkspace\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Webdriver driver=New FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.findElement
		(By.xpath("//a[contains(text(),'Gmail')]")).click();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//driver.get("https://in.yahoo.com/?p=us&guccounter=1");
		//driver.navigate().back();	
		driver.close();
		
		
		
		
		
	}

}
