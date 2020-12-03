package TestIdeas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookApp {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JavaWorkspace\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");		
		driver.findElement(By.xpath("//button[@id='u_0_b']")).click();
		
		
		
		
	
		
		
		

	}

}
